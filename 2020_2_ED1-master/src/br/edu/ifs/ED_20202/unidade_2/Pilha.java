package br.edu.ifs.ED_20202.unidade_2;

public class Pilha <T>{
    private No inicio;
    private int tamanho;


    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Pilha(){
       this.inicio=null;
       this.tamanho=0;
    }
    public void empilhar(T elemento){
        No<T> novoElemento = new No<T>(elemento);

        if(this.tamanho==0){
            this.inicio=novoElemento;

        } else {

            novoElemento.setProx(inicio);
            this.inicio=novoElemento;

        }
        this.tamanho++;
    }

    public T desempilhar(){
        No atual = this.inicio;
        T elemento = (T) this.inicio.getElemento();
        this.inicio=atual.getProx();
        atual.setProx(null);
        this.tamanho--;
        return elemento;

    }
    public T getTopo(){

        return (T) this.inicio.getElemento();
    }

    public boolean estahVazia(){
        return this.tamanho==0;
    }

    public int getQtd(){
        return this.getTamanho();
    }


    @Override
    public String toString() {
        return "PilhaEncadeada{" +
                "Topo=" + inicio.getElemento() +
                ", tamanho=" + tamanho +
                '}';
    }
}
