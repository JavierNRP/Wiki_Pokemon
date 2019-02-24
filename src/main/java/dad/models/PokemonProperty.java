package dad.models;

import dad.models.estructura.Evolucion;
import dad.models.estructura.Movimiento;
import dad.models.estructura.Pokemon;
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
    private StringProperty descripcion;
    private StringProperty peso;
    private StringProperty altura;

    //todo agregar movimientos y evoluciones a las properties
    private Set<Tipo> tipos = new HashSet<>();

    private Set<Evolucion> evoluciones = new HashSet<>();

    private Set<Movimiento> movimientos = new HashSet<>();


    //Constructores
    public PokemonProperty() {
        this.id = new SimpleIntegerProperty(this, "NUMERO POKEDEX");
        this.nombre = new SimpleStringProperty(this, "NOMBRE POKEMON");
        this.peso = new SimpleStringProperty(this, "PESO POKEMON");
        this.altura = new SimpleStringProperty(this, "ALTURA POKEMON");
        this.descripcion = new SimpleStringProperty(this, "DESCRIPCION POKEMON");
        //todo agregar los demas atributos
    }

    public PokemonProperty(Pokemon pkm) {
        this.id = new SimpleIntegerProperty(this, "NUMERO POKEDEX", pkm.getId());
        this.nombre = new SimpleStringProperty(this, "NOMBRE POKEMON", pkm.getNombre());
        this.peso = new SimpleStringProperty(this, "PESO POKEMON", pkm.getPeso());
        this.altura = new SimpleStringProperty(this, "ALTURA POKEMON", pkm.getAltura());
        this.descripcion = new SimpleStringProperty(this, "DESCRIPCION POKEMON", pkm.getDescripcion());
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
