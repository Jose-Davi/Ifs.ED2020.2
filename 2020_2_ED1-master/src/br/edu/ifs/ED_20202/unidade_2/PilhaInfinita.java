package br.edu.ifs.ED_20202.unidade_2;

import java.util.Arrays;

public class PilhaInfinita <T>{
    private T[] pilha;
    private int tamanho;
    private int qtMax;

    public T[] getPilha() {
        return pilha;
    }

    public void setPilha(T[] pilha) {
        this.pilha = pilha;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getQtMax() {
        return qtMax;
    }

    public void setQtMax(int qtMax) {
        this.qtMax = qtMax;
    }

    public PilhaInfinita() {
        this.qtMax = 1000;
        this.pilha = (T[]) new Object[qtMax];
        this.tamanho=0;
    }
    public void empilhar(T elemento){
        this.aumentarCap();
        this.pilha[tamanho++]=elemento;

    }

    public T desempilhar()throws Exception{
        if(this.astahVazia()){
            throw new Exception("Pilha vazia");
        }
        T elemento=this.pilha[tamanho-1];
        this.pilha[tamanho-1]=null;

        tamanho--;
        return elemento;

    }

    public boolean astahVazia(){
        return this.tamanho==0;
    }

    public T getTopo(){
        if(this.astahVazia()){
            return null;
        }
        return pilha[tamanho-1];
    }

    public int getQtd(){
       return this.tamanho;
    }
    public void aumentarCap(){
        if(this.tamanho==this.pilha.length){
            T[] novaPilha = (T[]) new Object[qtMax=qtMax*2];
            for(int i=0;i<this.pilha.length;i++){
                novaPilha[i]=this.pilha[i];

            }
            this.pilha=novaPilha;
        }

    }

}
