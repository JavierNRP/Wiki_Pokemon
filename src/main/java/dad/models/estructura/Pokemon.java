package dad.models.estructura;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "POKEMON")
@Indexed
public class Pokemon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", unique = true, nullable = false)
    @Field
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "peso")
    private String peso;

    @Column(name = "altura")
    private String altura;

    @IndexedEmbedded(depth = 1)
    @ManyToMany(mappedBy = "pokemons", cascade = CascadeType.ALL)
    @Size(min = 1, max = 2)
    private List<Tipo> tipos = new ArrayList<>();

    @ManyToMany(mappedBy = "pokemons", cascade = CascadeType.ALL)
    @Column(name = "evoluciones")
    private List<Evolucion> evoluciones = new ArrayList<>();

    @ManyToMany(mappedBy = "pokemons")
    @Column(name = "movimientos")
    private List<Movimiento> movimientos = new ArrayList<>();

    public Pokemon() {

    }

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public Pokemon(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

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

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
