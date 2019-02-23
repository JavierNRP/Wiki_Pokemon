package dad.models;

import dad.models.estructura.Pokemon;

public class Model {
    Pokemon actual,siguiente,anterior;

    public Pokemon getActual() {
        return actual;
    }

    public void setActual(Pokemon actual) {
        this.actual = actual;
    }

    public Pokemon getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Pokemon siguiente) {
        this.siguiente = siguiente;
    }

    public Pokemon getAnterior() {
        return anterior;
    }

    public void setAnterior(Pokemon anterior) {
        this.anterior = anterior;
    }
}
