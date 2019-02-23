package dad;

import dad.models.Model;
import dad.models.estructura.Pokemon;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.css.PseudoClass;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    int count = 0;
    private Model m = new Model();
    private ImageView img1;
    private ImageView img2;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        EventHandler<KeyEvent> filter = event -> onKeyEventFilter(event);
        view.addEventFilter(KeyEvent.ANY, filter);
        Pokemon pkm = new Pokemon(1, "Bulbasour");
        m.setActual(pkm);
        System.out.println(m.getActual().getId());





        //Crear transicion con la animacion del pokemon
        m.setFrame1(new Image(PokeDexAPP.class.getResource("/image/pokemon/" + m.getActual().getId() + ".png").toString()));
        m.setFrame2(new Image(PokeDexAPP.class.getResource("/image/pokemon/frame2/" + m.getActual().getId() + ".png").toString()));

        img1 = new ImageView();
        img2 = new ImageView();

        //Bindear las imagesproperty
        img1.imageProperty().bind(m.frame1Property());
        img2.imageProperty().bind(m.frame2Property());

        Group animation = new Group(img1);
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


        screen.getChildren().add(animation);

        //Bindeos
        pokeNumText.textProperty().bind(m.getActual().idProperty().asString());
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
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.RIGHT && !searchBar.isFocused()) {
            rightArrow.fire();
            rightArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
        }

        //Izquierda
        else if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.LEFT && !searchBar.isFocused()) {
            leftArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.LEFT && !searchBar.isFocused()) {
            leftArrow.fire();
            leftArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
        }

        //Arriba
        else if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.UP) {
            upArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.UP) {
            upArrow.fire();
            upArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
        }

        //Abajo
        else if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.DOWN) {
            downArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.DOWN) {
            downArrow.fire();
            downArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
        }

    }

    public Controller() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/main.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //Funciones FXML
    @FXML
    public void onCloseButton() {
        System.exit(0);
    }

    @FXML
    public void onPrueba() {
        System.out.println("ejecutado" + count++);
    }

    @FXML
    public void onNextPokemon() {
        System.out.println("right");
    }

    @FXML
    public void onPreviusPokemon() {
        System.out.println("left");
    }

    @FXML
    public void onUpArrow() {
        System.out.println("up");
    }

    @FXML
    public void onDownArrow() {
        System.out.println("down");
    }

    @FXML
    public void onCancelTextFocus() {
        view.requestFocus();
    }

    //Getters & Setters
    public AnchorPane getView() {
        return view;
    }

    public Pane getScreen() {
        return screen;
    }
}
