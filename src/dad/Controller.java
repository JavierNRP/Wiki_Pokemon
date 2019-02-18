package dad;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.controlsfx.control.textfield.TextFields;

public class Controller implements Initializable {

    @FXML
    private TextField pruebaText;

    @FXML
    private AnchorPane view;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	String [] palabras = { "perico", "de", "los", "palotes" }; 
    	
    	TextFields.bindAutoCompletion(pruebaText, palabras);
    	
    	pruebaText.textProperty().addListener((o, ov, nv) -> System.out.println("has seleccionado " + nv));
    	
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
    public void onCloseButton(){
        System.exit(0);
    }

    //Getters & Setters
    public AnchorPane getView() {
        return view;
    }
}
