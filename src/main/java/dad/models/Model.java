package dad.models;

import dad.PokeDexAPP;
import dad.models.estructura.Pokemon;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.scene.image.Image;

public class Model {
	private PokemonProperty actual;
	private ObjectProperty<Image> frame1;
	private ObjectProperty<Image> frame2;
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
		actual.setEvoluciones(pkm.getEvoluciones());
		actual.setTipos(FXCollections.observableArrayList(pkm.getTipos()));
		// todo agregar los otros atributos al campo

		setFrame1(new Image(PokeDexAPP.class.getResource("/image/pokemon/" + actual.getId() + ".png").toString()));
		setFrame2(
				new Image(PokeDexAPP.class.getResource("/image/pokemon/frame2/" + actual.getId() + ".png").toString()));
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

}
