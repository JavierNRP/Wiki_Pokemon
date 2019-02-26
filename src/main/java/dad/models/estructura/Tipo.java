package dad.models.estructura;

import java.io.Serializable;
import java.util.*;
import java.util.ArrayList;

import javax.persistence.*;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

/**
 * Clase estructura de la base de datos
 * representa los tipos en la tabla de la base de datos
 */

@Entity
@Indexed
@Table(name = "TIPO")
public class Tipo implements Serializable {

	/**
	 * Identidad autogenerada por la base de datos
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	/**
	 * Nombre del tipo
	 */
	@Column(name = "nombre", unique = true, nullable = false)
	@Field
	private String nombre;

	/**
	 * Lista con las eficacias de este tipo a los otros tipos
	 */
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "eficacias")
	@ElementCollection(targetClass = Eficacia.class)
	private List<Eficacia> eficacias = new ArrayList<>();

	/**
	 * Lista de pokemon que pertenecen a este tipo
	 */
	@ManyToMany(mappedBy = "tipos",cascade = CascadeType.ALL)
	private List<Pokemon> pokemons = new LinkedList<>();

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

	public List<Pokemon> getPokemons() {
		return pokemons;
	}

	@Override
	public String toString() {
		return 	nombre;
	}
}
