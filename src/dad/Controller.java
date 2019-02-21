package dad;

import components.image.ImageField;
import javafx.css.PseudoClass;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    boolean pressed = false;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        screen.getChildren().add(new ImageField(2));
        EventHandler<KeyEvent> filter = event -> onKeyEventFilter(event);
        view.addEventFilter(KeyEvent.ANY, filter);
    }

    private void onKeyEventFilter(KeyEvent event) {
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
