package components.typeselector;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import components.TypesData;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.util.Callback;

public class TypeSelectorField extends VBox  implements Initializable  {

	TypeSelectorModel model = new TypeSelectorModel();
	
	@FXML ComboBox<TypeObject> Type_p;
	@FXML ComboBox<TypeObject> Type_s;
	
	ObservableList<TypeObject> list = FXCollections.observableArrayList();

    public TypeSelectorField() {
    	try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("TypeSelector.fxml"));
			loader.setController(this);
			loader.setRoot(this);
			loader.load();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		for (int i = 0; i < 18; i++)
			list.add(new TypeObject(TypesData.typeNames[i], TypesData.typeColors[i]));

		Type_s.setItems(list);
		Type_p.setItems(list);
		
		Type_p.setCellFactory(new Callback<ListView<TypeObject>, ListCell<TypeObject>>(){
			@Override
			public ListCell<TypeObject> call(ListView<TypeObject> list) {
				return new CustomTypeCell();
			}
		});
		Type_s.setCellFactory(new Callback<ListView<TypeObject>, ListCell<TypeObject>>(){
			@Override
			public ListCell<TypeObject> call(ListView<TypeObject> list) {
				return new CustomTypeCell();
			}
		});

		model.type_pProperty().bind(Type_p.getSelectionModel().selectedIndexProperty());
		model.type_sProperty().bind(Type_s.getSelectionModel().selectedIndexProperty());
		
		Type_p.getSelectionModel().selectedItemProperty().addListener( e -> 
				Type_p.setStyle(Type_p.getSelectionModel().getSelectedItem().getColor()));
		Type_s.getSelectionModel().selectedItemProperty().addListener( e -> 
				Type_s.setStyle(Type_s.getSelectionModel().getSelectedItem().getColor()));
		
		Type_p.getSelectionModel().selectFirst();
		Type_s.getSelectionModel().selectFirst();
		
	}
	
	static class CustomTypeCell extends ListCell<TypeObject>{
		@Override
		public void updateItem(TypeObject item, boolean empty) {
			super.updateItem(item, empty);
			if(item!=null) {
				Label label = new Label(item.getName());
				label.setStyle(item.getColor());
				label.setPrefWidth(64);
				setGraphic(label);
			}
		}
	}

	public final IntegerProperty type_pProperty() { return model.type_pProperty(); }
	public final int getType_p() { return model.getType_p(); }
	
	public final IntegerProperty type_sProperty() { return model.type_sProperty(); }
	public final int getType_s() { return model.getType_s(); }

}