package lista;

import mapa.Entry;

public class Nodo {
    private Object elemento;
    private Nodo anterior;
    private Nodo proximo;

    public Nodo(Object elemento) {
        this.elemento = elemento;
        this.anterior = null;
        this.proximo = null;
    }

    public Object getElemento() {
        return elemento;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
