package pruebas;

import dad.Controller;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.converter.NumberStringConverter;

public class MainVista extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        Controller c = new Controller();
        Scene sc = new Scene(c.getPokedex(), 956, 600);
        sc.setFill(Color.TRANSPARENT);
        primaryStage.setResizable(false);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
