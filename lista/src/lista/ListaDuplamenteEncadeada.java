package lista;

import mapa.Entry;

public class ListaDuplamenteEncadeada {
    private Nodo inicio;
    private Nodo fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void adicionarNoInicio(Object elemento) {
        Nodo novoNodo = new Nodo(elemento);
        if (estaVazia()) {
            inicio = fim = novoNodo;
        } else {
            novoNodo.setProximo(inicio);
            inicio.setAnterior(novoNodo);
            inicio = novoNodo;
        }
    }

    public void adicionarNoFim(Object elemento) {
        Nodo novoNodo = new Nodo(elemento);
        if (estaVazia()) {
            inicio = fim = novoNodo;
        } else {
            novoNodo.setAnterior(fim);
            fim.setProximo(novoNodo);
            fim = novoNodo;
        }
    }

    public void remover(Object elemento) {
        Nodo atual = inicio;

        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                if (atual == inicio && atual == fim) {
                    inicio = fim = null;
                } else if (atual == inicio) {
                    inicio = inicio.getProximo();
                    inicio.setAnterior(null);
                } else if (atual == fim) {
                    fim = fim.getAnterior();
                    fim.setProximo(null);
                } else {
                    atual.getAnterior().setProximo(atual.getProximo());
                    atual.getProximo().setAnterior(atual.getAnterior());
                }
                return;
            }
            atual = atual.getProximo();
        }
    }

    public void imprimir() {
        Nodo atual = inicio;
        while (atual != null) {
            System.out.print(atual.getElemento() + " <-> ");
            atual = atual.getProximo();
        }
        System.out.println("null");
    }
}
