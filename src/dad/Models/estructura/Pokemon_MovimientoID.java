package dad.Models.estructura;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class Pokemon_MovimientoID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pokemon_movimiento_id", insertable = false, updatable = false)
	private Pokemon pokemon;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "pokemon_movimiento_id", insertable = false, updatable = false)
	private Movimiento movimiento;

	@Enumerated(EnumType.STRING)
	@Column(name = "metodoAprendizaje", nullable = false)
	private MetodoAprendizaje metodoAprendizaje;

	public Pokemon_MovimientoID() {

	}

	public Pokemon getPokemon() {
		return pokemon;
	}

	public void setPokemon(Pokemon pokemon) {
		this.pokemon = pokemon;
	}

	public Movimiento getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(Movimiento movimiento) {
		this.movimiento = movimiento;
	}

	public MetodoAprendizaje getMetodoAprendizaje() {
		return metodoAprendizaje;
	}

	public void setMetodoAprendizaje(MetodoAprendizaje metodoAprendizaje) {
		this.metodoAprendizaje = metodoAprendizaje;
	}

}
