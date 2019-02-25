package dad.models;

import dad.PokeDexAPP;
import dad.models.estructura.Pokemon;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.scene.image.Image;
import javafx.scene.media.Media;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Model {
	private PokemonProperty actual;
	private ObjectProperty<Image> frame1;
	private ObjectProperty<Image> frame2;
	private ObjectProperty<Media> media;
	private StringProperty busqueda;

	public Model() {
		actual = new PokemonProperty();
		frame1 = new SimpleObjectProperty<>(this, "FRAME 1");
		frame2 = new SimpleObjectProperty<>(this, "FRAME 2");
		busqueda = new SimpleStringProperty(this, "busqueda", "");
	}

	public PokemonProperty getActual() {
		return actual;
	}

	public void setActual(Pokemon pkm) {
		actual.setId(pkm.getId());
		actual.setNombre(pkm.getNombre());
		actual.setDescripcion(pkm.getDescripcion());
		actual.setPeso(pkm.getPeso());
		actual.setAltura(pkm.getAltura());
		actual.setEvoluciones(FXCollections.observableArrayList(pkm.getEvoluciones()));
		actual.setTipos(FXCollections.observableArrayList(pkm.getTipos()));
		actual.setEvoluciones(FXCollections.observableArrayList(pkm.getEvoluciones()));
		// todo agregar los otros atributos al campo

		setFrame1(new Image(PokeDexAPP.class.getResource("/image/pokemon/" + actual.getId() + ".png").toString()));
		setFrame2(
				new Image(PokeDexAPP.class.getResource("/image/pokemon/frame2/" + actual.getId() + ".png").toString()));

		setMedia(new Media(PokeDexAPP.class.getResource("/sounds/cries" + actual.getId() + ".mp3").toString()));

	}

	public Image getFrame1() {
		return frame1.get();
	}

	public ObjectProperty<Image> frame1Property() {
		return frame1;
	}

	public void setFrame1(Image frame1) {
		this.frame1.set(frame1);
	}

	public Image getFrame2() {
		return frame2.get();
	}

	public ObjectProperty<Image> frame2Property() {
		return frame2;
	}

	public void setFrame2(Image frame2) {
		this.frame2.set(frame2);
	}

	public final StringProperty busquedaProperty() {
		return this.busqueda;
	}

	public final String getBusqueda() {
		return this.busquedaProperty().get();
	}

	public final void setBusqueda(final String busqueda) {
		this.busquedaProperty().set(busqueda);
	}

	public final ObjectProperty<Media> mediaProperty() {
		return this.media;
	}

	public final Media getMedia() {
		return this.mediaProperty().get();
	}

	public final void setMedia(final Media media) {
		this.mediaProperty().set(media);
	}

}
