package dad.models;

import dad.models.estructura.Pokemon;
import javafx.scene.Group;
import javafx.scene.image.Image;

public class Model {
    private Pokemon actual;
    private Image frame1;
    private Image frame2;

    public Pokemon getActual() {
        return actual;
    }

    public void setActual(Pokemon actual) {
        this.actual = actual;
    }

    public Image getFrame1() {
        return frame1;
    }

    public void setFrame1(Image frame1) {
        this.frame1 = frame1;
    }

    public Image getFrame2() {
        return frame2;
    }

    public void setFrame2(Image frame2) {
        this.frame2 = frame2;
    }
}
