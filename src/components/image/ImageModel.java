package components.image;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

public class ImageModel {
	
	private IntegerProperty imgId;
	private StringProperty route;
	private ObjectProperty<Image> frame1;
	private ObjectProperty<Image> frame2;
	private BooleanProperty mouseOn;

	public ImageModel() {
		imgId = new SimpleIntegerProperty(this, "imgId");
		route = new SimpleStringProperty(this, "route");
		frame1 = new SimpleObjectProperty<Image>(this, "frame1");
		frame2 = new SimpleObjectProperty<Image>(this, "frame2");
		mouseOn = new SimpleBooleanProperty(this, "mouseOn");
	}

	protected final IntegerProperty imgIdProperty() { return this.imgId; }
	protected final int getImgId() { return this.imgIdProperty().get(); }
	protected final void setImgId(final int imgId) { this.imgIdProperty().set(imgId); }

	protected final StringProperty routeProperty() { return this.route; }
	protected final String getRoute() { return this.routeProperty().get(); }
	protected final void setRoute(final String route) { this.routeProperty().set(route); }

	protected final ObjectProperty<Image> frame1Property() { return this.frame1; }
	protected final Image getFrame1() { return this.frame1Property().get(); }
	protected final void setFrame1(final Image frame1) { this.frame1Property().set(frame1); }
	protected final void setFrame1(final String frame1) { this.setFrame1(new Image(frame1)); }

	protected final ObjectProperty<Image> frame2Property() { return this.frame2; }
	protected final Image getFrame2() { return this.frame2Property().get(); }
	protected final void setFrame2(final Image frame2) { this.frame2Property().set(frame2); }
	protected final void setFrame2(final String frame2) { this.setFrame2(new Image(frame2)); }

	public final BooleanProperty mouseOnProperty() { return this.mouseOn; }
	public final Boolean getMouseOn() { return this.mouseOnProperty().get(); }
	public final void setMouseOn(final Boolean mouseOn) { this.mouseOnProperty().set(mouseOn); }
}