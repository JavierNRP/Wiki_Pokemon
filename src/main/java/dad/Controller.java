package dad;

import components.image.ImageField;
import dad.models.Model;
import dad.models.estructura.Pokemon;
import javafx.css.PseudoClass;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    boolean pressed = false;
    Model m = new Model();

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
    private ToggleButton rightArrow;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        EventHandler<KeyEvent> filter = event -> onKeyEventFilter(event);
        view.addEventFilter(KeyEvent.ANY, filter);
        //Cambiar frames de imagenes
        Pokemon pkm = new Pokemon(1,"Bulbasour");
        m.setActual(pkm);

        ImageField img = new ImageField();
        img.setImgId(1);
        screen.getChildren().add(img);
    }

    private void onKeyEventFilter(KeyEvent event) {
        //Controlador de eventos de teclas
        if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.ENTER) {
            redButton.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
            if (!pressed) {
                pressed = true;
                redButton.fire();
            }
            event.consume();
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.ENTER) {
            redButton.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
            pressed = false;
        } else if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.RIGHT) {
            rightArrow.fire();
            rightArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), true);
        } else if (event.getEventType() == KeyEvent.KEY_RELEASED && event.getCode() == KeyCode.RIGHT) {
            rightArrow.fire();
            rightArrow.pseudoClassStateChanged(PseudoClass.getPseudoClass("pressed"), false);
        }




    }

    public Controller() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view/main.fxml"));
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
        System.out.println("ejecutado");
    }

    @FXML
    public void onArrowRight() {
        System.out.println("Arrow test");
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
