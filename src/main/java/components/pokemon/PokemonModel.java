package components.pokemon;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PokemonModel {
	
	private IntegerProperty type_p;
	private IntegerProperty type_s;
	private IntegerProperty pokeId;
	private StringProperty text;

	public PokemonModel() {
		type_p = new SimpleIntegerProperty(this, "type_p");
		type_s = new SimpleIntegerProperty(this, "type_s");
		pokeId = new SimpleIntegerProperty(this, "pokeId");
		text = new SimpleStringProperty(this, "text");
	}

	protected final IntegerProperty type_pProperty() { return this.type_p; }
	protected final int getType_p() { return this.type_pProperty().get(); }
	protected final void setType_p(final int type_p) { this.type_pProperty().set(type_p); }
	
	protected final IntegerProperty type_sProperty() { return this.type_s; }
	protected final int getType_s() { return this.type_sProperty().get(); }
	protected final void setType_s(final int type_s) { this.type_sProperty().set(type_s); }

	protected final IntegerProperty pokeIdProperty() { return this.pokeId; }
	protected final int getPokeId() { return this.pokeIdProperty().get(); }
	protected final void setPokeId(final int pokeId) { this.pokeIdProperty().set(pokeId); }

	protected final StringProperty textProperty() { return this.text; }
	protected final String getText() { return this.textProperty().get(); }
	protected final void setText(final String text) { this.textProperty().set(text); }
	
}