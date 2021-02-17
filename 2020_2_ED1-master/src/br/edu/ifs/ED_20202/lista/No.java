package br.edu.ifs.ED_20202.lista;

public class No<T> {
    private No<T> prox;
    private T elemento;

    public No(T elemento) {
        this.elemento = elemento;
        this.prox = null;
    }

    public No<T> getProx() {
        return prox;
    }

    public void setProx(No<T> prox) {
        this.prox = prox;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }
}
