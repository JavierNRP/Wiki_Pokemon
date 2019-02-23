package dad;

import dad.models.Model;
import dad.models.estructura.Pokemon;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TimelineBuilder;
import javafx.css.PseudoClass;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
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

    boolean pressed = false;
    private Model m = new Model();
    private ImageView img1;
    private ImageView img2;


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
        Pokemon pkm = new Pokemon(6, "Bulbasour");
        m.setActual(pkm);



        //Crear transicion con la animacion del pokemon
        m.setFrame1(new Image(PokeDexAPP.class.getResource("/image/pokemon/" + m.getActual().getId() + ".png").toString()));
        m.setFrame2(new Image(PokeDexAPP.class.getResource("/image/pokemon/frame2/" + m.getActual().getId() + ".png").toString()));
        img1 = new ImageView(m.getFrame1());
        img2 = new ImageView(m.getFrame2());

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
