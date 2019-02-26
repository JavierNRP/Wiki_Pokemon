package dad.models;

import dad.models.estructura.Evolucion;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Tipo;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase intermedia utilizada para volver observables todos los campos de la Clase Pokemon almacenada en la base de datos
 * para ser bindeados a los distintos elementos de la vista
 */
public class PokemonProperty {
    private IntegerProperty id;

    /**
     *
     */
    private StringProperty nombre;
    private StringProperty descripcion;
    private StringProperty peso;
    private StringProperty altura;
    private ListProperty<Tipo> tipos;
    private ListProperty<Evolucion> evoluciones;


    //Constructores
    public PokemonProperty(Object b) {
        this.id = new SimpleIntegerProperty(this, "NUMERO POKEDEX");
        this.nombre = new SimpleStringProperty(this, "NOMBRE POKEMON");
        this.peso = new SimpleStringProperty(this, "PESO POKEMON");
        this.altura = new SimpleStringProperty(this, "ALTURA POKEMON");
        this.descripcion = new SimpleStringProperty(this, "DESCRIPCION POKEMON");
        this.tipos = new SimpleListProperty<>(this, "TIPOS", FXCollections.observableArrayList());
        this.evoluciones = new SimpleListProperty<>(this, "EVOLUCIONES", FXCollections.observableArrayList());
    }

    public PokemonProperty(Pokemon pkm) {
        this.id = new SimpleIntegerProperty(this, "NUMERO POKEDEX", pkm.getId());
        this.nombre = new SimpleStringProperty(this, "NOMBRE POKEMON", pkm.getNombre());
        this.peso = new SimpleStringProperty(this, "PESO POKEMON", pkm.getPeso());
        this.altura = new SimpleStringProperty(this, "ALTURA POKEMON", pkm.getAltura());
        this.descripcion = new SimpleStringProperty(this, "DESCRIPCION POKEMON", pkm.getDescripcion());
        this.tipos = new SimpleListProperty<>(this, "TIPOS", FXCollections.observableArrayList(pkm.getTipos()));
        this.evoluciones = new SimpleListProperty<>(this, "EVOLUCIONES", FXCollections.observableArrayList(pkm.getEvoluciones()));
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

    public ObservableList<Tipo> getTipos() {
        return tipos.get();
    }

    public ListProperty<Tipo> tiposProperty() {
        return tipos;
    }

    public void setTipos(ObservableList<Tipo> tipos) {
        this.tipos.set(tipos);
    }

    public ObservableList<Evolucion> getEvoluciones() {
        return evoluciones.get();
    }

    public ListProperty<Evolucion> evolucionesProperty() {
        return evoluciones;
    }

    public void setEvoluciones(ObservableList<Evolucion> evoluciones) {
        this.evoluciones.set(evoluciones);
    }

    public String getDescripcion() {
        return descripcion.get();
    }

    public StringProperty descripcionProperty() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion.set(descripcion);
    }

    public String getPeso() {
        return peso.get();
    }

    public StringProperty pesoProperty() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso.set(peso);
    }

    public String getAltura() {
        return altura.get();
    }

    public StringProperty alturaProperty() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura.set(altura);
    }

    public Pokemon toPokemon() {
        Pokemon pkm = new Pokemon();
        pkm.setNombre(this.getNombre());
        pkm.setAltura(this.getAltura());
        pkm.setDescripcion(this.getDescripcion());
        pkm.setEvoluciones(this.getEvoluciones());
        pkm.setId(this.getId());
        pkm.setPeso(this.getPeso());
        pkm.setTipos(this.getTipos());
        return pkm;
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
