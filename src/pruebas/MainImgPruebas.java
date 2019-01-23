package pruebas;

import java.sql.Blob;

import Components.TypeSelector.TypeSelectorField;
import Components.Weakness.WeaknessField;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;


public class MainImgPruebas extends Application {
  @Override
  public void start(Stage primaryStage) {
    try {
      WeaknessField testW = new WeaknessField();
      TypeSelectorField testS = new TypeSelectorField();
      
      Image image;
//      Blob ablob = new 
      ImageView imageview = new ImageView();
      
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