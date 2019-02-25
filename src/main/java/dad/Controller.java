package dad;

import components.TypesData;
import dad.models.Model;
import dad.models.conf.HibernateUtil;
import dad.models.estructura.Evolucion;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Tipo;
import dad.models.searches.Search;
import javafx.animation.KeyFrame;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.beans.binding.Bindings;
import javafx.css.PseudoClass;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.util.Duration;
import org.controlsfx.control.textfield.TextFields;
import org.hibernate.Session;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public static final int TOTAL_POKEMON = 151;
    public static final int SCROLL_SPACE = 21;
    public static final int ELMENTOS_POR_DEFECTO_EVOLUTIONVIEW = 3;
    private Model m = new Model();
    private ImageView img1;
    private ImageView img2;
    private Group animation;
    private Boolean details = false;
    private static Session session;

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

    public Controller() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/main.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        EventHandler<KeyEvent> filter = event -> onKeyEventFilter(event);
        view.addEventFilter(KeyEvent.ANY, filter);

        //Obtener la sesion de la base de datos;
        try {
            session = new HibernateUtil().getSession();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Cargar primer pokemon de la base de datos
        session.beginTransaction();
        Pokemon pkm = session.get(Pokemon.class, 1);
        m.setActual(pkm);
        session.getTransaction().commit();

        //Ocultar los campos de detalles
        hideDetails(true);

        //Crear transicion con la animacion del pokemon
        img1 = new ImageView();
        img2 = new ImageView();

        //Bindear las imagesproperty
        img1.imageProperty().bind(m.frame1Property());
        img2.imageProperty().bind(m.frame2Property());

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

        //Agregar los elementos a la pantalla de la pokedex
        screen.getChildren().add(animation);
        refreshTypes();
        makeEvolutionChain();

        //Bindeos
        pokeNumText.textProperty().bind(m.getActual().idProperty().asString());
        nameLabel.textProperty().bind(m.getActual().nombreProperty());
        greenConsole.textProperty().bind(Bindings.concat(
                "Pokémon: ", m.getActual().nombreProperty(),
                "\nTipo: ", m.getActual().tiposProperty(),
                "\nAltura: ", m.getActual().alturaProperty(),
                "\nPeso: ", m.getActual().pesoProperty(),
                "\nDescripción: ", m.getActual().descripcionProperty())
        );
        m.busquedaProperty().bindBidirectional(searchBar.textProperty());
        m.busquedaProperty().addListener((ob, ov, nv) -> {
            Search search;
            try {
                search = new Search();
                TextFields.bindAutoCompletion(searchBar, search.getResultadosBusquedaPokemon(nv));
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

    }

    private void refreshTypes() {
        typesBox.getChildren().clear();
        for (Tipo t : m.getActual().getTipos()) {
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
        } else {
            nameLabel.setDisable(false);
            nameLabel.setVisible(true);
            typesGrid.setDisable(false);
            typesGrid.setVisible(true);
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

    private void makeEvolutionChain() {
        session.beginTransaction();
        session.getTransaction().commit();
        if (m.getActual().getEvoluciones().size() > 1) {
            if (m.getActual().getEvoluciones().size() > 2) {
                //EVEE
                for (Evolucion e : m.getActual().getEvoluciones()) {
                    if (e.getPokemons().get(0).getId() != m.getActual().getId()) {
                        //Es una preevolucion

                    } else {
                        //Es una evolucion
                    }
                }
            } else {
                // PREEVOLUCION Y EVOLUCION
            }
        } else if (m.getActual().getEvoluciones().get(0).getPokemons().get(0).getId() == m.getActual().getEvoluciones().get(0).getPokemons().get(0).getId()) {
            //CON UNA EVOLUCION
        } else if (m.getActual().getEvoluciones().get(0).getPokemons().get(0).getId() != m.getActual().getEvoluciones().get(0).getPokemons().get(0).getId()) {
            //CON UNA PREEVOLUCION
        } else {
            //Si ha llegado aca y no se ha agregado ningun pokemon, no tiene evolucion
            Label label = new Label("Sin Evoluciones");
            label.getStyleClass().add("nombre-pokemon");
            evolutionView.getChildren().add(2, label);
        }
    }

    //Funciones FXML
    @FXML
    public void onCloseButton() {
        System.exit(0);
    }

    @FXML
    public void onDetailsButton() {
        ScaleTransition scale = new ScaleTransition(Duration.millis(300), animation);
        TranslateTransition move = new TranslateTransition(Duration.millis(300), animation);
        move.setNode(animation);
        if (!details) {
            details = true;

            //Transiciones

            //Movimiento
            move.setFromX(130);
            move.setToX(48);
            move.setFromY(95);
            move.setToY(40);

            //Cambio de tamaño
            scale.setByX(-1);
            scale.setByY(-1);

            //Habilitar datos ocultos
            hideDetails(false);
        } else {
            details = false;

            //Transiciones

            //Movimiento
            move.setToY(130);
            move.setFromX(48);
            move.setToX(130);
            move.setFromY(40);
            move.setToY(95);

            //Cambio de tamaño
            scale.setByX(1);
            scale.setByY(1);

            //Ocultar datos
            hideDetails(true);
        }
        move.play();
        scale.play();
    }

    @FXML
    public void onNextPokemon() {
        if (m.getActual().getId() < TOTAL_POKEMON) {
            session.beginTransaction();
            Pokemon pkm = session.get(Pokemon.class, m.getActual().getId() + 1);
            session.getTransaction().commit();
            m.setActual(pkm);
            refreshTypes();
//            makeEvolutionChain();
        }
    }

    @FXML
    public void onPreviusPokemon() {
        if (m.getActual().getId() > 1) {
            session.beginTransaction();
            Pokemon pkm = session.get(Pokemon.class, m.getActual().getId() - 1);
            session.getTransaction().commit();
            m.setActual(pkm);
            refreshTypes();
//            makeEvolutionChain();
        }
    }

    @FXML
    public void onUpArrow() {
        greenConsole.setScrollTop(greenConsole.getScrollTop() - SCROLL_SPACE);
        scrollScreen.setVvalue(scrollScreen.getVvalue() - 0.08);
    }

    @FXML
    public void onDownArrow() {
        greenConsole.setScrollTop(greenConsole.getScrollTop() + SCROLL_SPACE);
        scrollScreen.setVvalue(scrollScreen.getVvalue() + 0.08);
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
