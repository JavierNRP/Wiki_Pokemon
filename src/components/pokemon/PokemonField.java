package components.pokemon;

import java.net.URL;
import java.util.ResourceBundle;

import components.image.ImageField;
import components.TypeLabel.TypeField;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class PokemonField extends GridPane implements Initializable {
	
	PokemonModel model = new PokemonModel();
	
	ImageField image = new ImageField();
	TypeField type_p = new TypeField();
	TypeField type_s = new TypeField();
	Label text = new Label();
	
	public PokemonField() { this(1); }
	public PokemonField(int pokeId) {
		model.setPokeId(pokeId);
//		TODO sacar los datos de la BD
		model.setText("");
		model.setType_p(0);
		model.setType_s(1);
		
		this.add(image, 0, 0, 1, 2);
		this.add(type_p, 1, 0);
		this.add(type_s, 1, 1);
		this.add(text, 2, 0, 1, 2);
		
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		image.imgIdProperty().bind(model.pokeIdProperty());
		type_p.typeIdProperty().bind(model.type_pProperty());
		type_s.typeIdProperty().bind(model.type_sProperty());
//		TODO bindear todos los datos segun pokeId
	}

}
