package Components.TypeSelector;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class TypeSelectorModel {
	
	private IntegerProperty type_p;
	private IntegerProperty type_s;

	public TypeSelectorModel() {
		type_p = new SimpleIntegerProperty(this, "type_p");
		type_s = new SimpleIntegerProperty(this, "type_s");
	}

	protected final IntegerProperty type_pProperty() { return this.type_p; }
	protected final int getType_p() { return this.type_pProperty().get(); }
	protected final void setType_p(final int type_p) { this.type_pProperty().set(type_p); }
	
	protected final IntegerProperty type_sProperty() { return this.type_s; }
	protected final int getType_s() { return this.type_sProperty().get(); }
	protected final void setType_s(final int type_s) { this.type_sProperty().set(type_s); }
	
}