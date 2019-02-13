package dad.models.estructura;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "POKEMON_MOVIMIENTO")
public class Pokemon_Movimiento {

	@EmbeddedId
	private Pokemon_MovimientoID pokemon_movimiento_id;

	public Pokemon_Movimiento() {

	}

	public Pokemon_MovimientoID getPokemon_movimiento_id() {
		return pokemon_movimiento_id;
	}

	public void setPokemon_movimiento_id(Pokemon_MovimientoID pokemon_movimiento_id) {
		this.pokemon_movimiento_id = pokemon_movimiento_id;
	}

}
