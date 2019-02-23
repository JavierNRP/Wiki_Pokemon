package dad.models;

import dad.models.estructura.Evolucion;
import dad.models.estructura.Pokemon;
import dad.models.estructura.Pokemon_Movimiento;
import dad.models.estructura.Tipo;
import javafx.beans.property.*;
import javafx.scene.image.Image;

import java.util.HashSet;
import java.util.Set;

public class Model {
    private PokemonProperty actual;
    private ObjectProperty<Image> frame1;
    private ObjectProperty<Image> frame2;

    public Model() {
        frame1 = new SimpleObjectProperty<>(this, "FRAME 1");
        frame2 = new SimpleObjectProperty<>(this, "FRAME 2");
    }

    public PokemonProperty getActual() {
        return actual;
    }

    public void setActual(Pokemon actual) {
        this.actual = new PokemonProperty(actual);
    }

    public Image getFrame1() {
        return frame1.get();
    }

    public ObjectProperty<Image> frame1Property() {
        return frame1;
    }

    public void setFrame1(Image frame1) {
        this.frame1.set(frame1);
    }

    public Image getFrame2() {
        return frame2.get();
    }

    public ObjectProperty<Image> frame2Property() {
        return frame2;
    }

    public void setFrame2(Image frame2) {
        this.frame2.set(frame2);
    }

}

