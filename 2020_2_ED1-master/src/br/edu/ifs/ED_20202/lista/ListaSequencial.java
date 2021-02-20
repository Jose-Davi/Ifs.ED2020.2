package br.edu.ifs.ED_20202.lista;

import br.edu.ifs.ED_20202.ordenacao.IOrdenacao;
import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class ListaSequencial<T extends Comparable<T>> extends Lista<T> {


    T[] lista;
    int qtdMax;
    int finalLista;
    int inicioList;
    public ListaSequencial(Class<T> dataType){
        super();
        qtdMax = 10;
        this.lista = (T[]) java.lang.reflect.Array.newInstance(dataType, qtdMax);
        finalLista = 0;
    }

    @Override
    public void limpar() {
            for(int i =0;i<finalLista;i++){
                lista[i] =null;
        }
        finalLista = 0;
    }
    @Override
    public T get(int posicao) throws Exception {
        if(!(posicao>=0 && posicao<finalLista)){
            throw new IllegalAccessException("Posição inválida!");
        }
        return lista[posicao];
    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        for(int i=0;i<finalLista;i++){
            if(lista[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void incluir(T elemento) throws Exception {

        if(this.finalLista<this.lista.length){
            this.lista[finalLista]=elemento;
            this.finalLista++;
        }else{
            throw new Exception("A Lista ja está cheia!");
        }

    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        for(int i=finalLista-1;i>=0;i--){
            this.lista[i+1] = this.lista[i];
        }
        this.lista[0]=elemento;
        this.finalLista++;

    }



    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        if(!(posicao>=0 && posicao<finalLista)){
            throw new IllegalAccessException("Posição inválida!");
        }
        for(int i=finalLista-1;i>=posicao;i--){
            this.lista[i+1] = this.lista[i];
        }
        this.lista[posicao]=elemento;
        this.finalLista++;


    }

    @Override
    public void remover(int posicao) throws Exception {
        if(!(posicao>=0 && posicao<this.finalLista)){
            throw new IllegalAccessException("Posição inválida!");
        }
        for(int i = posicao;i<this.finalLista-1;i++){
            this.lista[i]=this.lista[i+1];
        }
        this.finalLista --;
    }
    @Override
    public int getTamanho() {

        return this.finalLista;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        for(int i=0;i<this.finalLista;i++){
            if(this.lista[i].equals(elemento)){
                return true;

            }
        }
        return false;
    }


 }

