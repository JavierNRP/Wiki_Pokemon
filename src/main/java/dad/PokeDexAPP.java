package dad;

import java.io.File;

import dad.models.InsertData;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * Javadoc
 * @
 */
public class PokeDexAPP extends Application {

	private double xOffset = 0;
	private double yOffset = 0;
	private File scriptDB;

	@Override
	public void start(Stage primaryStage) throws Exception {
		String path = System.getenv("USERPROFILE")+ "/PokeDex/pokedexdb.script";
		scriptDB = new File(path);
		if (!scriptDB.exists()) {
			InsertData.insertarDatos();
		}
		Controller c = new Controller();
		Scene sc = new Scene(c.getView(), 961, 600);
		sc.setFill(Color.TRANSPARENT);
		sc.setOnMousePressed(event -> {
			xOffset = event.getSceneX();
			yOffset = event.getSceneY();
		});
		sc.setOnMouseDragged(event -> {
			primaryStage.setX(event.getScreenX() - xOffset);
			primaryStage.setY(event.getScreenY() - yOffset);
		});
		primaryStage.setScene(sc);
		primaryStage.initStyle(StageStyle.TRANSPARENT);
//		primaryStage.getIcons().add(new Image(PokeDexAPP.class.getResource("/assets/poke.png").toString()));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
