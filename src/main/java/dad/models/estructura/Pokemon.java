package dad.models.estructura;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Clase estructura de la base de datos
 * representa los pokemons en la tabla de la base de datos
 */
@Entity
@Table(name = "POKEMON")
@Indexed
public class Pokemon implements Serializable {

    /**
     * Número de la pokedex
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    /**
     * Nombre del pokemon
     */
    @Column(name = "nombre", unique = true, nullable = false)
    @Field
    private String nombre;

    /**
     * Descripción de la pokedex
     */
    @Column(name = "descripcion")
    private String descripcion;

    /**
     * Peso
     */
    @Column(name = "peso")
    private String peso;

    /**
     * Altura
     */
    @Column(name = "altura")
    private String altura;

    /**
     * Lista con los tipos del pokemon
     * En la posicion 1 el tipo principal
     * En la posicion 2 El tipo secundarios si lo tiene
     */
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pokemons")
    @Size(min = 1, max = 2)
    private List<Tipo> tipos = new ArrayList<>();

    /**
     * Lista de posibles evoluciones que puede tener el pokemon
     */
    @ManyToMany(mappedBy = "pokemons", cascade = CascadeType.ALL)
    @Column(name = "evoluciones")
    private List<Evolucion> evoluciones = new ArrayList<>();

    /**
     * Coonstructor vacio
     */
    public Pokemon() {

    }

    /**
     * @param nombre
     */
    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param id
     * @param nombre
     */
    public Pokemon(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * @return Número de la pokedex
     */
    public Integer getId() { return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return
     */
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    /**
     * @return
     */
    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public List<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(List<Tipo> tipos) {
        this.tipos = tipos;
    }

    public List<Evolucion> getEvoluciones() {
        return evoluciones;
    }

    public void setEvoluciones(List<Evolucion> evoluciones) {
        this.evoluciones = evoluciones;
    }

    public boolean sameId(Pokemon pkm) {
        return this.getId().equals(pkm.getId());
    }

    @Override
    public String toString() {
        return nombre;
    }
}
