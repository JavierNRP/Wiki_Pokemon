package dad;

import dad.models.TypesData;
import dad.models.Model;
import dad.models.conf.HibernateUtil;
import dad.models.estructura.Evolucion;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Tipo;
import dad.models.searches.Search;
import dad.reports.AbstractJasperReports;
import javafx.animation.*;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ObservableValue;
import javafx.css.PseudoClass;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import org.controlsfx.control.textfield.TextFields;
import org.hibernate.Session;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * @
 */
public class Controller implements Initializable {

    //Atributos

    public static final int TOTAL_POKEMON = 151;
    public static final int SCROLL_SPACE = 21;
    private Model model = new Model();
    private ImageView img1;
    private ImageView img2;
    private Group animation;
    private Boolean details = false;
    private MediaPlayer criePlayer;
    private static Session session;
    private static Connection con;
    private ScaleTransition scaleTransition;
    private TranslateTransition moveTransition;
    private List<Pokemon> suggestionElements = new ArrayList<>();
    private List<String> suggestionTextList = new ArrayList<>();
    private MediaPlayer scrollPlayer;
    private MediaPlayer bumpPlayer;

    //Nodos FXML

    @FXML
    private Label pokeNumText;
    @FXML
    private Pane screen;
    @FXML
    private AnchorPane view;
    @FXML
    private Button redButton;
    @FXML
    private TextArea greenConsole;
    @FXML
    private TextField searchBar;
    @FXML
    private Button searchButton;
    @FXML
    private ToggleButton rightArrow;
    @FXML
    private ToggleButton leftArrow;
    @FXML
    private ToggleButton upArrow;
    @FXML
    private ToggleButton downArrow;
    @FXML
    private Label nameLabel;
    @FXML
    private ScrollPane scrollScreen;
    @FXML
    private GridPane typesGrid;
    @FXML
    private VBox typesBox;
    @FXML
    private HBox evolutionView;
    @FXML
    private Label evoLabel;
    @FXML
    private HBox methodView;
    @FXML
    private CheckBox muteCry;

    public Controller() {
        try {
            FXMLLoader loader = new FXMLLoader(PokeDexAPP.class.getResource("/view/main.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Initialize

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //EventFilter
        EventHandler<KeyEvent> filter = event -> onKeyEventFilter(event);
        view.addEventFilter(KeyEvent.ANY, filter);

        //Bindeos
        pokeNumText.textProperty().bind(model.getActual().idProperty().asString());
        nameLabel.textProperty().bind(model.getActual().nombreProperty());
        model.muteProperty().bind(muteCry.selectedProperty());
        model.muteProperty().addListener((o,ov,nv) -> {
            playAllowSound();
        });

        greenConsole.textProperty().bind(Bindings.concat(
                "Pokémon: ", model.getActual().nombreProperty(),
                "\nTipo: ", model.getActual().tiposProperty(),
                "\nAltura: ", model.getActual().alturaProperty(),
                "\nPeso: ", model.getActual().pesoProperty(),
                "\nDescripción: ", model.getActual().descripcionProperty())
        );
        model.mediaProperty().addListener(e -> {
            criePlayer = new MediaPlayer(model.getMedia());
        });
        //Bindeos buscador
        model.busquedaProperty().bindBidirectional(searchBar.textProperty());
        TextFields.bindAutoCompletion(searchBar, param -> {
            suggestionTextList = new ArrayList<>();
            for (Pokemon currentCompletion : suggestionElements) {
                if (currentCompletion.getNombre().toLowerCase().contains(param.getUserText().toLowerCase())) {
                    suggestionTextList.add(currentCompletion.getNombre());
                }
            }
            return suggestionTextList;
        });

        model.busquedaProperty().addListener((ob, ov, nv) -> {
            try {
                suggestionElements = new Search().getResultadosBusquedaPokemon(nv);
                if (nv.length() - ov.length() > 1) {
                    onSearchButtonAction();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        });


        //Obtener la sesion de la base de datos;
        try {
            HibernateUtil hu = new HibernateUtil();
            session = hu.getSession();
            con = hu.getConn();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Cargar primer pokemon de la base de datos
        session.beginTransaction();
        Pokemon pkm = session.get(Pokemon.class, 1);
        onChangePokemon(pkm);
        session.getTransaction().commit();

        //Ocultar los campos de detalles
        hideDetails(true);

        //Crear transicion con la animacion del pokemon
        img1 = new ImageView();
        img2 = new ImageView();
        img1.getStyleClass().add("evo-pkm-view");
        img2.getStyleClass().add("evo-pkm-view");

        //Bindear las imagesproperty
        img1.imageProperty().bind(model.frame1Property());
        img2.imageProperty().bind(model.frame2Property());

        animation = new Group(img1);
        animation.setAutoSizeChildren(true);
        animation.setScaleX(3);
        animation.setScaleY(3);
        animation.setTranslateX(130);
        animation.setTranslateY(95);

        Timeline tl = new Timeline(
                new KeyFrame(Duration.millis(100), t -> animation.getChildren().setAll(img1)),
                new KeyFrame(Duration.millis(500), t -> animation.getChildren().setAll(img2))
        );

        tl.setCycleCount(Timeline.INDEFINITE);
        tl.setAutoReverse(true);
        tl.play();

        //Animaciones de detalles
        moveTransition = new TranslateTransition(Duration.millis(300), animation);
        moveTransition.setNode(animation);
        scaleTransition = new ScaleTransition(Duration.millis(300), animation);


        //Agregar los elementos a la pantalla de la pokedex
        screen.getChildren().add(animation);
        refreshTypes();
        makeEvolutionChain();


    }

    //Metodos

    private void refreshTypes() {
        typesBox.getChildren().clear();
        for (Tipo t : model.getActual().getTipos()) {
            typesBox.getChildren().add(makeTypeLabel(t.getId()));
        }
    }

    private void onKeyEventFilter(KeyEvent event) {
        //Evento Tecla enter cuando no está seleccionado el buscador
        if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.ENTER && !searchBar.isFocused()) {
            redButton.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
            event.consume();
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.ENTER && !searchBar.isFocused()) {
            redButton.fire();
            redButton.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
        }

        //Evento Tecla enter cuando el buscador esta seleccionado
        if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.ENTER && searchBar.isFocused()) {
            searchButton.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
            event.consume();
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.ENTER && searchBar.isFocused()) {
            searchButton.fire();
            searchButton.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
        }

        //Derecha
        else if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.RIGHT && !searchBar.isFocused()) {
            rightArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
            event.consume();
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.RIGHT && !searchBar.isFocused()) {
            rightArrow.fire();
            rightArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
            event.consume();
        }

        //Izquierda
        else if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.LEFT && !searchBar.isFocused()) {
            leftArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
            event.consume();
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.LEFT && !searchBar.isFocused()) {
            leftArrow.fire();
            leftArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
            event.consume();
        }

        //Arriba
        else if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.UP) {
            upArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
            upArrow.fire();
            event.consume();
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.UP) {
            upArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
            event.consume();
        }

        //Abajo
        else if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.DOWN) {
            downArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
            downArrow.fire();
            event.consume();
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.DOWN) {
            downArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
            event.consume();
        }

    }

    private void hideDetails(Boolean b) {
        if (b) {
            nameLabel.setDisable(true);
            nameLabel.setVisible(false);
            typesGrid.setDisable(true);
            typesGrid.setVisible(false);
            evolutionView.setDisable(true);
            evolutionView.setVisible(false);
            evoLabel.setDisable(true);
            evoLabel.setVisible(false);
            methodView.setDisable(true);
            methodView.setVisible(false);

        } else {
            nameLabel.setDisable(false);
            nameLabel.setVisible(true);
            typesGrid.setDisable(false);
            typesGrid.setVisible(true);
            evolutionView.setDisable(false);
            evolutionView.setVisible(true);
            evoLabel.setDisable(false);
            evoLabel.setVisible(true);
            methodView.setDisable(false);
            methodView.setVisible(true);
        }
    }

    private Label makeTypeLabel(Integer id) {
        Label typelabel = new Label();
        typelabel.setText(TypesData.typeNames[id - 1]);
        typelabel.setStyle(TypesData.typeColors[id - 1]);
        typelabel.setAlignment(Pos.CENTER);
        typelabel.setMinWidth(100);
        typelabel.setEffect(new InnerShadow());
        typelabel.getStyleClass().add("screen-text");
        typelabel.getStyleClass().add("type-label");
        return typelabel;
    }

    private void playSoundEffect(String soundFile) {
        Media media = new Media(soundFile);
        MediaPlayer player = new MediaPlayer(media);
        player.play();
    }

    private void makeEvolutionChain() {
        evolutionView.getChildren().clear();
        methodView.getChildren().clear();
        if (model.getActual().getEvoluciones().isEmpty()) {
            //Sin Evolucion
            Label label = new Label("Sin Evoluciones");
            label.getStyleClass().add("nombre-pokemon");
            evolutionView.getChildren().add(label);
        } else if (model.getActual().getEvoluciones().size() > 1) {
            if (model.getActual().getEvoluciones().size() > 2) {
                //MUCHAS EVOLUCIONES DISTINTAS (CASO EEVE)
                evolutionView.getChildren().add(makeEvolutionElementView(model.getActual().toPokemon()));
                evolutionView.getChildren().add(makeEvoMethodsArrow(model.getActual().getEvoluciones().get(0).getMetodo().toString()));
                VBox evos = new VBox(5);
                for (Evolucion e : model.getActual().getEvoluciones()) {
                    Pokemon pkm = e.getPokemons().get(1);
                    evos.getChildren().add(makeEvolutionElementView(pkm));
                }
                evolutionView.getChildren().add(evos);
            } else {
                // UNA PREEVOLUCION Y UNA EVOLUCION
                //Obtener la preevolucion y la evolucion
                Evolucion preEvo = model.getActual().getEvoluciones().get(0);
                Evolucion evo = model.getActual().getEvoluciones().get(1);

                //Obtener los Pokemon de la clase Evolucion
                Pokemon prePkm = preEvo.getPokemons().get(0);
                Pokemon evoPkm = evo.getPokemons().get(1);
                methodView.getChildren().add(makeEvoMethodsArrow(preEvo.getMetodo().toString()));
                methodView.getChildren().add(makeEvoMethodsArrow(evo.getMetodo().toString()));

                //Crear los ImageView con las evoluciones
                Image preImg = new Image(PokeDexAPP.class.getResource("/image/pokemon/" + prePkm.getId() + ".png").toString());
                Image currentImg = new Image(PokeDexAPP.class.getResource("/image/pokemon/" + model.getActual().getId() + ".png").toString());
                Image evoImg = new Image(PokeDexAPP.class.getResource("/image/pokemon/" + evoPkm.getId() + ".png").toString());

                ImageView preView = new ImageView(preImg);
                ImageView currentView = new ImageView(currentImg);
                ImageView evoView = new ImageView(evoImg);

                //Agregar las imagenes a la vista
                evolutionView.getChildren().addAll(makeEvolutionElementView(prePkm), makeEvolutionElementView(model.getActual().toPokemon()), makeEvolutionElementView(evoPkm));

            }
        } else if (model.getActual().getEvoluciones().get(0).getPokemons().get(0).sameId(model.getActual().toPokemon())) {
            //CON AL MENOS UNA EVOLUCION
            Evolucion evo = model.getActual().getEvoluciones().get(0);
            Pokemon evoPkm = evo.getPokemons().get(1);

            methodView.getChildren().add(makeEvoMethodsArrow(evo.getMetodo().toString()));

            evolutionView.getChildren().addAll(makeEvolutionElementView(model.getActual().toPokemon()), makeEvolutionElementView(evoPkm));

            //Comprobar si el pokemon al que evoluciona tambien tiene otra evolucion
            if (evoPkm.getEvoluciones().size() > 1) {
                //Tiene una evolucion
                Evolucion posEvo = evoPkm.getEvoluciones().get(1);
                Pokemon posEvoPkm = posEvo.getPokemons().get(1);

                methodView.getChildren().add(makeEvoMethodsArrow(posEvo.getMetodo().toString()));

                evolutionView.getChildren().add(makeEvolutionElementView(posEvoPkm));
            }


        } else if (!model.getActual().getEvoluciones().get(0).getPokemons().get(0).sameId(model.getActual().toPokemon())) {
            //TIENE AL MENOS UNA PREEVOLUCION
            Evolucion pre = model.getActual().getEvoluciones().get(0);
            Pokemon prePkm = pre.getPokemons().get(0);

            methodView.getChildren().add(makeEvoMethodsArrow(pre.getMetodo().toString()));

            evolutionView.getChildren().addAll(makeEvolutionElementView(prePkm), makeEvolutionElementView(model.getActual().toPokemon()));

            //Comprobar si el pokemon al que evoluciona tambien tiene otra evolucion
            if (!prePkm.getEvoluciones().get(0).getPokemons().get(0).sameId(prePkm)) {
                //Tiene otra preevolucion
                Evolucion prePreEvo = prePkm.getEvoluciones().get(0);
                Pokemon prePrePkm = prePreEvo.getPokemons().get(0);

                methodView.getChildren().add(0, makeEvoMethodsArrow(prePreEvo.getMetodo().toString()));

                evolutionView.getChildren().add(0, makeEvolutionElementView(prePrePkm));
            }
        }

    }

    private HBox makeEvolutionElementView(Pokemon pkm) {
        HBox element = new HBox(15);
        element.getStyleClass().add("evolution-view");
        element.setAlignment(Pos.CENTER);
        element.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> onChangePokemon(pkm));
        VBox pkmView = new VBox(5);
        pkmView.setAlignment(Pos.CENTER);

        Image img = new Image(PokeDexAPP.class.getResource("/image/pokemon/" + pkm.getId() + ".png").toString());
        ImageView imgView = new ImageView(img);
        imgView.getStyleClass().add("evo-pkm-view");
        DropShadow ds = new DropShadow(15, Color.DARKRED);
        element.addEventHandler(MouseEvent.MOUSE_ENTERED, e -> {
            imgView.requestFocus();
        });
        element.addEventHandler(MouseEvent.MOUSE_EXITED, e -> {
            screen.requestFocus();
        });
        imgView.focusedProperty().addListener((ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) ->
        {
            if (newValue) {
                imgView.setEffect(ds);
            } else {
                imgView.setEffect(null);
            }
        });
        Label name = new Label(pkm.getNombre());
        name.getStyleClass().add("screen-text");
        pkmView.getChildren().addAll(imgView, name);

        element.getChildren().addAll(pkmView);
        return element;
    }

    private void playActualCrie() {
        criePlayer.play();
        criePlayer.setStartTime(Duration.ZERO);
        criePlayer.seek(Duration.ZERO);
    }

    private void onChangePokemon(Pokemon pkm) {
        model.setActual(pkm);
        makeEvolutionChain();
        refreshTypes();
        if (!model.isMute()) {
            playActualCrie();
        }
    }

    private VBox makeEvoMethodsArrow(String method) {
        VBox p = new VBox();
        p.setPadding(new Insets(8, 15, 8, 8));
        Label l = new Label(method);
        l.getStyleClass().add("screen-text");
        p.getStyleClass().add("evo-method-arrow");
        p.getChildren().add(l);

        return p;
    }

    private void playAllowSound() {
        playSoundEffect(PokeDexAPP.class.getResource("/sounds/scroll.mp3").toString());
    }

    private void playNotAllowSound() {
        playSoundEffect(PokeDexAPP.class.getResource("/sounds/notallowed.mp3").toString());
    }

    //Funciones FXML

    @FXML
    public void onCloseButtonAction() {
//        AbstractJasperReports.createReport(con,PokeDexAPP.class.getResource("/templateReport.jrxml").toString());
//        AbstractJasperReports.createReport(con,PokeDexAPP.class.getResource("/Leaf_Green_Table_Based.jrxml").toString());
        System.exit(0);
    }

    @FXML
    public void onDetailsButtonAction() {
        scrollScreen.setVvalue(0.0);
        if (moveTransition.getStatus() != Animation.Status.RUNNING && scaleTransition.getStatus() != Animation.Status.RUNNING)
            if (!details) {
                details = true;

                //Transiciones

                //Movimiento
                moveTransition.setFromX(130);
                moveTransition.setToX(48);
                moveTransition.setFromY(95);
                moveTransition.setToY(40);

                //Cambio de tamaño
                scaleTransition.setByX(-1);
                scaleTransition.setByY(-1);

                //Habilitar datos ocultos
                hideDetails(false);
            } else {
                details = false;

                //Transiciones

                //Movimiento
                moveTransition.setToY(130);
                moveTransition.setFromX(48);
                moveTransition.setToX(130);
                moveTransition.setFromY(40);
                moveTransition.setToY(95);

                //Cambio de tamaño
                scaleTransition.setByX(1);
                scaleTransition.setByY(1);

                //Ocultar datos
                hideDetails(true);
            }
        playAllowSound();
        moveTransition.play();
        scaleTransition.play();

    }

    @FXML
    public void onNextPokemonAction() {
        if (model.getActual().getId() < TOTAL_POKEMON) {
            session.beginTransaction();
            Pokemon pkm = session.get(Pokemon.class, model.getActual().getId() + 1);
            session.getTransaction().commit();
            onChangePokemon(pkm);
            scrollScreen.setVvalue(0.0);
            if (model.isMute()) {
                playAllowSound();
            }
        } else {
            playNotAllowSound();
        }

    }

    @FXML
    public void onPreviousPokemonAction() {
        if (model.getActual().getId() > 1) {
            session.beginTransaction();
            Pokemon pkm = session.get(Pokemon.class, model.getActual().getId() - 1);
            session.getTransaction().commit();
            onChangePokemon(pkm);
            scrollScreen.setVvalue(0.0);
            if (model.isMute()) {
                playAllowSound();
            }
        } else {
            playNotAllowSound();
        }
    }

    @FXML
    public void onSearchButtonAction() {
        if (suggestionElements.size() > 0) {
            for (Pokemon pkm : suggestionElements) {
                if (pkm.getNombre().equalsIgnoreCase(searchBar.getText())) {
                    onChangePokemon(pkm);
                }
            }
            playAllowSound();
        } else {
            playNotAllowSound();
        }
    }

    @FXML
    public void onUpArrowAction() {
        if (greenConsole.getScrollTop() > 0 && scrollScreen.getVvalue() > 0.0) {
            greenConsole.setScrollTop(greenConsole.getScrollTop() - SCROLL_SPACE);
            scrollScreen.setVvalue(scrollScreen.getVvalue() - 0.08);
            playAllowSound();
        } else {
            playNotAllowSound();
        }
    }

    @FXML
    public void onDownArrowAction() {
        if (scrollScreen.getVvalue() < 1.0) {
            greenConsole.setScrollTop(greenConsole.getScrollTop() + SCROLL_SPACE);
            scrollScreen.setVvalue(scrollScreen.getVvalue() + 0.08);
            playAllowSound();
        } else {
            playNotAllowSound();
        }
    }

    @FXML
    void onCryButtonAction() {
        playActualCrie();
    }

    //Getters & Setters

    public AnchorPane getView() {
        return view;
    }

    public Pane getScreen() {
        return screen;
    }

    public static Session getSession() {
        return session;
    }
}
