package br.edu.ifs.ED_20202.lista;

public class NoDupla<T> {
    private T elemento;
    private NoDupla<T> prox;
    private NoDupla<T> anterior;

    public NoDupla(T elemento) {
        this.elemento = (T) elemento;
        this.prox = null;
        this.anterior = null;

    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NoDupla<T> getProx() {
        return prox;
    }

    public void setProx(NoDupla<T> prox) {
        this.prox = prox;
    }

    public NoDupla<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NoDupla<T> anterior) {
        this.anterior = anterior;
    }
}