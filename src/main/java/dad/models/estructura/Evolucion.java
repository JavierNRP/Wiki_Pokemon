package dad.models.estructura;

import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase usada com oestructura de hibernate.
 * representa la tabla de evoluciones en la base de datos
 */
@Entity
@Indexed
@Table(name = "EVOLUCION")
public class Evolucion implements Serializable {

    /**
     * Identificado auto numerico para la BD
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * Lista de pokemon que evolucionan.
     * En la primera posicion el Pokemon que evoluciona.
     * En la segunda la evolucion.
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "evoluciones")
    private List<Pokemon> pokemons = new ArrayList<>();

    /**
     * ENUM con el metodo por el que se logra la evolucion
     */
    @Enumerated(EnumType.STRING)
    @Column(name = "metodoEvolucion", nullable = false)
    private MetodoEvolucion metodoEvolucion;


    /**
     * Constructor vacio
     */
    public Evolucion() {

    }

    /**
     * @return Identificador de la evolucación
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id Identificador de la evolucion
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Lista con pokemons que evolucionan en la primera posicion un el pokemon que evoluciona y en la segunda el pokemon al que evolociona
     */
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    /**
     * @param pokemons Lista de pokemons en la primera posicion un el pokemon que evoluciona y en la segunda el pokemon al que evolociona
     */
    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    /**
     * @return Metodo de evolución
     */
    public MetodoEvolucion getMetodo() {
        return metodoEvolucion;
    }

    /**
     * @param metodo Método de evolucion
     */
    public void setMetodo(MetodoEvolucion metodo) {
        this.metodoEvolucion = metodo;
    }

    @Override
    public String toString() {
        return pokemons.toString();
    }
}
