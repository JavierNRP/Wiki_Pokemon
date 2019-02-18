package components.TypeLabel;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TypeLabelModel {
	
	private IntegerProperty typeId;
	private StringProperty colorStr;
	private StringProperty typeName;

	public TypeLabelModel() {
		typeId = new SimpleIntegerProperty(this, "typeId");
		colorStr = new SimpleStringProperty(this, "colorStr");
		typeName = new SimpleStringProperty(this, "typeName");
	}

	protected final IntegerProperty typeIdProperty() { return this.typeId; }
	protected final int getTypeId() { return this.typeIdProperty().get(); }
	protected final void setTypeId(final int typeId) { this.typeIdProperty().set(typeId); }

	protected final StringProperty colorStrProperty() { return this.colorStr; }
	protected final String getColorStr() { return this.colorStrProperty().get(); }
	protected final void setColorStr(final String colorStr) { this.colorStrProperty().set(colorStr); }

	protected final StringProperty typeNameProperty() { return this.typeName; }
	protected final String getTypeName() { return this.typeNameProperty().get(); }
	protected final void setTypeName(final String typeName) { this.typeNameProperty().set(typeName); }
	
}