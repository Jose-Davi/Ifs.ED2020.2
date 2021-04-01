package br.edu.ifs.ED_20202.unidade_2;

public class FilaInfinita<T> {
    T[] elementos;
    int tamanho;
    int qtMax;

    public FilaInfinita() {
        ;
        this.tamanho = 0;
        this.qtMax = 1000;
        this.elementos = (T[]) new Object[qtMax];

    }

    public void incluir(T elemento) throws FilaCheiaException {
        this.aumentarCap();
        if (this.tamanho == qtMax) {
            throw new FilaCheiaException();
        }this.aumentarCap();
        this.elementos[this.tamanho++] = elemento;

    }

    public T remover() throws FilaVaziaException {

        if (estahVazia()) {
            throw new FilaVaziaException();
        }
        T elemento = this.elementos[0];
        for (int i = 0; i < tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
        return elemento;
    }

    public int getQtd() {
        return this.tamanho;
    }

    public boolean estahVazia() {
        return this.tamanho == 0;
    }

    public T visualizarProximo() throws FilaVaziaException {
        if (this.estahVazia()) {
            return null;
        }
        return this.elementos[1];
    }

    public int getQtdMaxSuportada() {
        return this.qtMax;
    }

    public void limpar() {
        this.tamanho = 0;
        this.qtMax = 1000;
        this.elementos = (T[]) new Object[qtMax];
    }

    public void aumentarCap() {
        if (this.tamanho == this.elementos.length) {
            T[] novaFila = (T[]) new Object[qtMax = qtMax * 2];
            for (int i = 0; i < this.elementos.length; i++) {
                novaFila[i] = this.elementos[i];

            }
            this.elementos = novaFila;
        }
    }
}
    class FilaCheiaException extends Exception {
    }

    class FilaVaziaException extends Exception {
    }
