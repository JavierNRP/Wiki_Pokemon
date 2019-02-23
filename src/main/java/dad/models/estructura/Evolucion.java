package dad.models.estructura;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.search.annotations.Indexed;

@Entity
@Indexed
@Table(name = "EVOLUCION")
public class Evolucion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "evoluciones")
	private Set<Pokemon> pokemons = new HashSet<Pokemon>();

	@Enumerated(EnumType.STRING)
	@Column(name = "metodoEvolucion", nullable = false)
	private MetodoEvolucion metodoEvolucion;

	public Evolucion() {

	}

	public Evolucion(MetodoEvolucion metodo) {
		this.metodoEvolucion = metodo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Pokemon> getPokemons() {
		return pokemons;
	}

	public void setPokemons(Set<Pokemon> pokemons) {
		this.pokemons = pokemons;
	}

	public MetodoEvolucion getMetodo() {
		return metodoEvolucion;
	}

	public void setMetodo(MetodoEvolucion metodo) {
		this.metodoEvolucion = metodo;
	}

}
