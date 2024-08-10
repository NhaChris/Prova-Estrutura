package br.edu.ifs.cads.ed1;

public class No<T extends Comparable<T>> implements Comparable<No<T>>{
    private T dado;
    private No<T> proximo;
    public No(T item){
        this.dado = item;
    }

    public T getDado() {
        return dado;
    }

    public void setDado(T dado) {
        this.dado = dado;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    /**
     * Método a ser implementado na prova.
     */
    public int compareTo(No<T> o) {

        return this.dado.compareTo(o.getDado());

    }
}
