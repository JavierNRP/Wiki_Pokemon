package components.TypeLabel;

import java.net.URL;
import java.util.ResourceBundle;

import components.TypesData;
import javafx.beans.property.IntegerProperty;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class TypeField extends Label implements Initializable {

	private TypeLabelModel model = new TypeLabelModel();
	private int typeinit = 0;
	
	public TypeField() {}
	public TypeField(int typeId) { this.typeinit = typeId; }
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
//		TODO sacar los datos de la BD
		model.typeIdProperty().addListener(e -> {
			model.setColorStr(TypesData.typeColors[model.getTypeId()]);
			model.setTypeName(TypesData.typeNames[model.getTypeId()]);
		});
		model.colorStrProperty().addListener(e -> {
			this.setStyle(model.getColorStr());
		});
		this.textProperty().bind(model.typeNameProperty());
		model.setTypeId(typeinit);
	}
	
	public void setTypeId(int typeId) { model.setTypeId(typeId); }
	public final IntegerProperty typeIdProperty() { return model.typeIdProperty(); }
	public final int getTypeId() { return model.getTypeId(); }
	
}
