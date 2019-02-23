package dad.models;

import dad.models.estructura.Evolucion;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Pokemon_Movimiento;
import dad.models.estructura.Tipo;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.HashSet;
import java.util.Set;

public class PokemonProperty {
    private IntegerProperty id;

    private StringProperty nombre;

    //todo agregar descripcion, peso y altura
    //todo agregar movimientos y evoluciones a las properties
    private Set<Tipo> tipos = new HashSet<Tipo>();

    private Set<Evolucion> evoluciones = new HashSet<Evolucion>();

    private Set<Pokemon_Movimiento> pokemons_movimientos = new HashSet<Pokemon_Movimiento>();


    //Constructores
    public PokemonProperty() {
        this.id = new SimpleIntegerProperty(this, "NUMERO POKEDEX");
        this.nombre = new SimpleStringProperty(this, "NOMBRE POKEMON");
        //todo agregar los demas atributos
    }

    public PokemonProperty(Pokemon pkm) {
        this.id = new SimpleIntegerProperty(this, "NUMERO POKEDEX", pkm.getId());
        this.nombre = new SimpleStringProperty(this, "NOMBRE POKEMON", pkm.getNombre());
        //todo agregar los demas atributos
    }

    //Getters y setters
    public int getId() {
        return id.get();
    }

    public IntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public Set<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(Set<Tipo> tipos) {
        this.tipos = tipos;
    }

    public Set<Evolucion> getEvoluciones() {
        return evoluciones;
    }

    public void setEvoluciones(Set<Evolucion> evoluciones) {
        this.evoluciones = evoluciones;
    }

    public Set<Pokemon_Movimiento> getPokemons_movimientos() {
        return pokemons_movimientos;
    }

    public void setPokemons_movimientos(Set<Pokemon_Movimiento> pokemons_movimientos) {
        this.pokemons_movimientos = pokemons_movimientos;
    }
}
