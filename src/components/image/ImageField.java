package Components.Image;

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

public class ImageField extends BorderPane  implements Initializable  {

	ImageModel model = new ImageModel();
	
	@FXML ImageView Image;

    public ImageField() {
    	try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Image.fxml"));
			loader.setController(this);
			loader.setRoot(this);
			loader.load();
			model.setImgId(1);
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
	}

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
		model.setRoute("file:C:\\Users\\Javier\\Documents\\GitHub\\Wiki_Pokemon\\src\\Resources\\Examples\\");
		model.imgIdProperty().addListener( e-> setframes() );
		Image.imageProperty().bind(model.frame1Property());
		model.setMouseOn(false);

		new Thread(animation).start();
	}
	
	private void setframes() {
		model.setFrame1(model.getRoute()+model.getImgId()+".png");
		model.setFrame2(model.getRoute()+"frame2\\"+model.getImgId()+".png");
	}
	
	Task<Void> animation = new Task<Void>() {
		@Override
		protected Void call() throws Exception {
			try {
				while (true) {
					TimeUnit.MILLISECONDS.sleep(500);
					Image.imageProperty().unbind();
					Image.imageProperty().bind(model.frame2Property());
					TimeUnit.MILLISECONDS.sleep(500);
					Image.imageProperty().unbind();
					Image.imageProperty().bind(model.frame1Property());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Image.imageProperty().unbind();
			Image.imageProperty().bind(model.frame1Property());
			return null;
		}
	};

	public final IntegerProperty imgIdProperty() { return model.imgIdProperty(); }
	public final int getImgId() { return model.getImgId(); }
	public final void setImgId(final int imgId) { model.setImgId(imgId); }

}