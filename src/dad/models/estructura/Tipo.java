package dad.models.estructura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

@Entity
@Indexed
@Table(name = "TIPO")
public class Tipo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "nombre", unique = true, nullable = false)
	@Field
	private String nombre;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "eficacias")
	@ElementCollection(targetClass = Eficacia.class)
	private List<Eficacia> eficacias = new ArrayList<Eficacia>();

	@IndexedEmbedded
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "tipos")
	private Set<Pokemon> pokemons = new HashSet<Pokemon>();
	
	@OneToMany(mappedBy="tipoAtaque")
	@Column(name="movimientos")
	private Set<Movimiento> movimientos;

	public Tipo() {

	}

	public Tipo(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Eficacia> getEficacias() {
		return eficacias;
	}

	public void setEficacias(List<Eficacia> eficacias) {
		this.eficacias = eficacias;
	}

}
