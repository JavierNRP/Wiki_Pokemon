package dad.Models.estructura;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.search.annotations.Indexed;

@Entity
@Indexed
@Table(name = "MOVIMIENTO")
public class Movimiento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "descripcion", nullable = false)
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "id")
	private Tipo tipoAtaque;

	@OneToMany(mappedBy = "pokemon_movimiento_id.movimiento")
	@Column(name = "movimientos_pokemons")
	private Set<Pokemon_Movimiento> movimientos_pokemons = new HashSet<Pokemon_Movimiento>();

	@Enumerated(EnumType.STRING)
	@Column(name = "tipoMovimiento", nullable = false)
	private MovimientoTipo tipoMovimiento;

	@Max(300)
	@Min(5)
	@Column(name = "potencia")
	private Integer potencia;

	@Max(100)
	@Min(20)
	@Column(name = "precision")
	private Integer precision;

	@Max(1)
	@Min(0)
	@Column(name = "prioridad", nullable = false)
	private Integer prioridad;

	public Movimiento() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Tipo getTipoAtaque() {
		return tipoAtaque;
	}

	public void setTipoAtaque(Tipo tipoAtaque) {
		this.tipoAtaque = tipoAtaque;
	}

	public Set<Pokemon_Movimiento> getMovimientos_pokemons() {
		return movimientos_pokemons;
	}

	public void setMovimientos_pokemons(Set<Pokemon_Movimiento> movimientos_pokemons) {
		this.movimientos_pokemons = movimientos_pokemons;
	}

	public MovimientoTipo getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(MovimientoTipo tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public Integer getPrecision() {
		return precision;
	}

	public void setPrecision(Integer precision) {
		this.precision = precision;
	}

	public Integer getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

}
