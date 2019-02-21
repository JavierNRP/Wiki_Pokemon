package components.image;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import javafx.beans.property.IntegerProperty;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ImageField extends BorderPane  implements Initializable  {

	ImageModel model = new ImageModel();
	
	@FXML ImageView Image;

    public ImageField() { this(1); }

    public ImageField(int imgId) {
    	try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Image.fxml"));
			loader.setController(this);
			loader.setRoot(this);
			loader.load();
			model.setImgId(imgId);
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
	}
    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		TODO no me funcionan las rutas relativas
		model.setRoute("file:../../resources/example");
		model.imgIdProperty().addListener( e-> setframes() );
		Image.imageProperty().bind(model.frame1Property());
		model.setMouseOn(false);
		
//		this.setOnMouseEntered(e -> new Thread(animation).start());
//		this.setOnMouseExited(e -> animation.cancel(false));

//		this.sceneProperty().addListener(e -> System.out.println("bind"));
		new Thread(animation).start();
		this.sceneProperty().addListener((observableScene, oldScene, newScene) -> {
			if(oldScene == null && newScene != null) {
				System.out.println("if1");
				newScene.windowProperty().addListener((observableWindow, oldWindow, newWindow) -> {
					if(oldWindow == null && newWindow != null) {
						System.out.println("if2");
						newWindow.onCloseRequestProperty().addListener(e -> animation.cancel(false));
						newWindow.focusedProperty().addListener(e -> System.out.println("focused"));
						newWindow.onCloseRequestProperty().addListener(e -> System.out.println("closed"));
					}
				});
			}
		});
//		
//		((Stage) this.getScene().getWindow()).onCloseRequestProperty().addListener(e -> animation.cancel(false));
//		
//		this.getScene().getWindow().setOnCloseRequest(e -> animation.cancel());
//		.getScene().windowProperty().addListener(e -> System.out.println("bind"));
//		.getWindow().onCloseRequestProperty().addListener(e -> animation.cancel());
		
	}
	
	private void setframes() {
		model.setFrame1(model.getRoute()+model.getImgId()+".png");
		model.setFrame2(model.getRoute()+"frame2\\"+model.getImgId()+".png");
	}
	
	Task<Void> animation = new Task<Void>() {
		@Override
		protected Void call() throws Exception {
			try {
				System.out.println("image");
				while (!isCancelled()) {
					TimeUnit.MILLISECONDS.sleep(500);
					Image.imageProperty().unbind();
					Image.imageProperty().bind(model.frame2Property());
					TimeUnit.MILLISECONDS.sleep(500);
					Image.imageProperty().unbind();
					Image.imageProperty().bind(model.frame1Property());
					System.out.println("imagen");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
	};

	public final IntegerProperty imgIdProperty() { return model.imgIdProperty(); }
	public final int getImgId() { return model.getImgId(); }
	public final void setImgId(final int imgId) { model.setImgId(imgId); }

}