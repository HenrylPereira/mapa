package mapa;

import lista.ListaDuplamenteEncadeada;

public class Mapa {
    private ListaDuplamenteEncadeada lista;

    public Mapa() {
        lista = new ListaDuplamenteEncadeada();
    }

    public String get(String chave) {
        for (Entry entry : lista) {
            if (entry.getKey().equals(chave)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void put(String chave, String valor) {
        for (Entry entry : lista) {
            if (entry.getKey().equals(chave)) {
                entry.setValue(valor);
                return;
            }
        }

        lista.adicionarNoFim(new Entry(chave, valor));
    }

    public String remove(String chave) {
        for (Entry entry : lista) {
            if (entry.getKey().equals(chave)) {
                lista.remover(entry);
                return entry.getValue();
            }
        }
        return null;
    }

    public int size() {
        return 1;
    }

    public boolean isEmpty() {
        return lista.estaVazia();
    }
}
