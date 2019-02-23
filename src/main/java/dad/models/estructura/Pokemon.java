package dad.models.estructura;

import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.IndexedEmbedded;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "POKEMON")
@Indexed
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre", unique = true, nullable = false)
    @Field
    private String nombre;

    @IndexedEmbedded(depth = 1)
    @ManyToMany(mappedBy = "pokemons", cascade = CascadeType.ALL)
    @Size(min = 1, max = 2)
    private Set<Tipo> tipos = new HashSet<Tipo>();

    @ManyToMany(mappedBy = "pokemons", cascade = CascadeType.ALL)
    @Column(name = "evoluciones")
    private Set<Evolucion> evoluciones = new HashSet<Evolucion>();

    @OneToMany(mappedBy = "pokemon_movimiento_id.pokemon")
    @Column(name = "pokemons_movimientos")
    private Set<Pokemon_Movimiento> pokemons_movimientos = new HashSet<Pokemon_Movimiento>();

    public Pokemon() {

    }

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public Pokemon(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(Set<Tipo> tipos) {
        this.tipos = tipos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Set<Evolucion> getEvoluciones() {
        return evoluciones;
    }

    public void setEvoluciones(Set<Evolucion> evoluciones) {
        this.evoluciones = evoluciones;
    }

}
