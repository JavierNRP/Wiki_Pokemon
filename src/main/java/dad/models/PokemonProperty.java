package dad.models;

import dad.models.estructura.Evolucion;
import dad.models.estructura.Movimiento;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Tipo;
import javafx.beans.property.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class PokemonProperty {
    private IntegerProperty id;

    private StringProperty nombre;
    private StringProperty descripcion;
    private StringProperty peso;
    private StringProperty altura;

    //todo agregar movimientos y evoluciones a las properties
    private ListProperty<Tipo> tipos;

    private List<Evolucion> evoluciones = new ArrayList<>();

    private List<Movimiento> movimientos = new ArrayList<>();


    //Constructores
    public PokemonProperty() {
        this.id = new SimpleIntegerProperty(this, "NUMERO POKEDEX");
        this.nombre = new SimpleStringProperty(this, "NOMBRE POKEMON");
        this.peso = new SimpleStringProperty(this, "PESO POKEMON");
        this.altura = new SimpleStringProperty(this, "ALTURA POKEMON");
        this.descripcion = new SimpleStringProperty(this, "DESCRIPCION POKEMON");
        this.tipos = new SimpleListProperty<Tipo>(this, "TIPOS", FXCollections.observableArrayList());
        //todo agregar los demas atributos
    }

    public PokemonProperty(Pokemon pkm) {
        this.id = new SimpleIntegerProperty(this, "NUMERO POKEDEX", pkm.getId());
        this.nombre = new SimpleStringProperty(this, "NOMBRE POKEMON", pkm.getNombre());
        this.peso = new SimpleStringProperty(this, "PESO POKEMON", pkm.getPeso());
        this.altura = new SimpleStringProperty(this, "ALTURA POKEMON", pkm.getAltura());
        this.descripcion = new SimpleStringProperty(this, "DESCRIPCION POKEMON", pkm.getDescripcion());
        this.tipos = new SimpleListProperty<Tipo>(this, "TIPOS", FXCollections.observableArrayList(pkm.getTipos()));
        this.evoluciones = pkm.getEvoluciones();
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

    public ObservableList<Tipo> getTipos() {
        return tipos.get();
    }

    public ListProperty<Tipo> tiposProperty() {
        return tipos;
    }

    public void setTipos(ObservableList<Tipo> tipos) {
        this.tipos.set(tipos);
    }

    public List<Evolucion> getEvoluciones() {
        return evoluciones;
    }

    public void setEvoluciones(List<Evolucion> evoluciones) {
        this.evoluciones = evoluciones;
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
}
