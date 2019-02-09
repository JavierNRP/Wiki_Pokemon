package dad;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private AnchorPane pokedex;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public Controller() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("View/MainLayout/main.fxml"));
            loader.setController(this);
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AnchorPane getPokedex() {
        return pokedex;
    }
}
