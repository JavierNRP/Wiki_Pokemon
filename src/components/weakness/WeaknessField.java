package Components.Weakness;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Components.TypesData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class WeaknessField extends BorderPane implements Initializable {

	private WeaknessModel model = new WeaknessModel();
	
    @FXML private GridPane weaknessTable;

    public WeaknessField() {
    	try { 
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Weakness.fxml"));
			loader.setController(this);
			loader.setRoot(this);
			loader.load();
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initLabels();
		model.changedProperty().addListener(e-> showResistancesAction());
	}
	
	public void setTypes(int type_p, int type_s) {
		if(type_p < 0 || type_p>17  ||  type_s < 0 || type_s>17) {
			Alert OutOfBounds = new Alert(AlertType.ERROR);
			OutOfBounds.setTitle("ERROR");
			OutOfBounds.setHeaderText("OutOfBoundsException");
			OutOfBounds.setContentText("Types span from 0 to 17");
			OutOfBounds.show();
		}
		else {
			model.setType_p(type_p);
			model.setType_s(type_s);
			model.setChanged(!model.getChanged());
		}
	}

	private Label[] labelType = new Label[18];

	private void initLabels() {
		for(int i=0; i<18; i++) {
			labelType[i] = new Label();
			labelType[i].setStyle(TypesData.typeColors[i]);
			labelType[i].setText(TypesData.typeNames[i]);
			labelType[i].setPrefWidth(48);
			labelType[i].setPrefHeight(20);
		}
	}
    
	private void showResistancesAction() {
		weaknessTable.getChildren().removeAll(labelType);
		int type1=model.getType_p();
		int type2=model.getType_s();
		float[] floatResistances = new float[18];
		if(type1!=type2)
			for(int i=0; i<18; i++)
				floatResistances[i] = TypesData.typeDamage[i][type1] * TypesData.typeDamage[i][type2];
		else
			for(int i=0; i<18; i++)
				floatResistances[i] = TypesData.typeDamage[i][type1];
		for(int i=0; i<18; i++) {
			int aux = 0;
			if(floatResistances[i] == (float) 0.5) aux = -1;
			else if (floatResistances[i] == (float) 0.25) aux = -2;
			else aux = (int) floatResistances[i];
			switch(aux) {
			case  0: weaknessTable.addRow(0, labelType[i]); break;
			case  1: weaknessTable.addRow(3, labelType[i]); break;
			case  2: weaknessTable.addRow(4, labelType[i]); break;
			case  4: weaknessTable.addRow(5, labelType[i]); break;
			case -1: weaknessTable.addRow(2, labelType[i]); break;
			case -2: weaknessTable.addRow(1, labelType[i]); break;
			}
			
		}
	}
}
