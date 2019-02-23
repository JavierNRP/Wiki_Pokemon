package pruebas;

import components.typeselector.TypeSelectorField;
import components.weakness.WeaknessField;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class MainPruebas extends Application {
  @Override
  public void start(Stage primaryStage) {
    try {
      WeaknessField testW = new WeaknessField();
      TypeSelectorField testS = new TypeSelectorField();
      
      Button show = new Button();
      show.setText("Show");
      show.setOnAction(e->testW.setTypes(testS.getType_p(), testS.getType_s()));
      
      VBox root = new VBox();
      root.getChildren().addAll(testW, testS, show);
      Scene scene = new Scene(root,400,400);
      primaryStage.setScene(scene);
      primaryStage.show();
    } catch(Exception e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    launch(args);
  }
}