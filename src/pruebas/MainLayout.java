package pruebas;

import dad.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainLayout extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Controller c = new Controller();
        Scene sc = new Scene(c.getView(), 961, 600);
        sc.setFill(Color.TRANSPARENT);
        primaryStage.setScene(sc);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
