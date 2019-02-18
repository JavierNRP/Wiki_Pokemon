package pruebas;

import components.image.ImageField;
import components.pokemon.PokemonField;
import components.typeselector.TypeSelectorField;
import components.weakness.WeaknessField;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class MainImgPruebas extends Application {
  @Override
  public void start(Stage primaryStage) {
    try {
      WeaknessField testW = new WeaknessField();
      TypeSelectorField testS = new TypeSelectorField();
      ImageField testI = new ImageField();
      PokemonField testP = new PokemonField();
//      testI.setImgId(2);
      
      Button show = new Button();
      show.setText("Show");
      show.setOnAction(e->testW.setTypes(testS.getType_p(), testS.getType_s()));
      
      TextField imgtext = new TextField();
      
      Button change = new Button();
      change.setText("Change");
      change.setOnAction(e->testI.setImgId(Integer.parseInt(imgtext.getText())));
      
      VBox root = new VBox();
      root.setStyle("-fx-background-color: #ECD82D; ");
      root.getChildren().addAll(testW, testS, show, testI, imgtext, change, testP);
      Scene scene = new Scene(root,600,600);
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