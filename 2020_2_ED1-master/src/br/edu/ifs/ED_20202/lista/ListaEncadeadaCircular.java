package br.edu.ifs.ED_20202.lista;

public class ListaEncadeadaCircular<T extends Comparable<T>> extends Lista<T> {

    private No inicio;
    private No<T> fim;
    private int tamanho;

    public ListaEncadeadaCircular() {
        this.inicio=null;
        this.tamanho = 0;
    }
    public No<T> getInicio() {
        return inicio;
    }

    public No<T> getFim() {
        return fim;
    }

    @Override
    public void incluir(T elemento) throws Exception {
        No<T> novoElemento = new No<T>(elemento);
        if(this.inicio==null && this.fim==null){
            this.inicio=novoElemento;
            this.fim=novoElemento;
            this.fim.setProx(inicio);
        }else{
            this.fim.setProx(novoElemento);
            this.fim = novoElemento;
            this.fim.setProx(inicio);
        }
        this.tamanho++;

    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        No<T> novoElemento = new No<T>(elemento);
        No <T> aux;
        if(this.tamanho==0){
            this.inicio=novoElemento;
            this.fim=novoElemento;
           // this.fim.setProx(inicio);
        } else {
            aux=inicio;
            this.inicio=novoElemento;
            this.inicio.setProx(aux);
           // this.fim.setProx(inicio);

        }

        this.fim.setProx(inicio);

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        No<T> novoElemento = new No<T>(elemento);
        No aux = inicio;
        if(posicao<0 || posicao>this.tamanho){
            throw new IllegalArgumentException("Posição invalida!");
        }

        if(posicao==this.tamanho-1){
            this.fim.setProx(novoElemento);
            this.fim =novoElemento;
            this.fim.setProx(inicio);

        }else
        if(posicao==0){
            incluirInicio(elemento);
        }else{
            for(int i=0;i<posicao-1;i++){
                aux = aux.getProx();
            }
            novoElemento.setProx(aux.getProx());
            aux.setProx(novoElemento);
            aux=novoElemento;}
        this.tamanho++;

    }

    @Override
    public T get(int posicao) throws Exception {
        No aux=inicio;

        if(this.tamanho==0){
            throw new IllegalAccessException("Lista vazia!");
        }for(int i=0;i<tamanho;i++){
            if(i==posicao){
                System.out.println(aux.getElemento());
                break;
            }
            aux=aux.getProx();

        }
        return (T) aux.getElemento();
    }


    @Override
    public int getPosElemento(T elemento) throws Exception {

        int contador=0;
        No aux=inicio;
        if(this.tamanho==0){
            throw new IllegalArgumentException("Lista vazia!");
        }
        while (aux != null) {
            if (aux.getElemento().equals(elemento)) {
                return contador;
            }
            aux = aux.getProx();
            contador++;
        }return -1;
    }

    @Override
    public void remover(int posicao) throws Exception {
        No anterior=null;
        No atual = this.inicio;
        if(posicao<0 || posicao>this.tamanho){
            throw new Exception("Posição inválida!");
        }
        for(int i=0;i<this.tamanho;i++){
            if(this.tamanho==1){
                this.inicio=null;
                this.fim=null;
            }else
            if (i==posicao) {
                if(atual==inicio){
                    this.inicio=atual.getProx();
                    atual.setProx(null);
                    this.fim.setProx(inicio);
                }else if(atual==fim){
                    this.fim=anterior;
                    anterior.setProx(null);
                    this.fim.setProx(inicio);
                }else{
                    anterior.setProx(atual.getProx());
                    atual=null;
                }break;
            }
            anterior = atual;
            atual = atual.getProx();
        }

    }

    @Override
    public void limpar() {
        this.inicio.setProx(null);
        this.inicio = null;
        this.tamanho=0;

    }

    @Override
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        No  aux =inicio;
        if(this.tamanho==0){
            throw new IllegalArgumentException("Lista vazia!");
        }
        while (aux != null) {
            if (aux.getElemento().equals(elemento)) {
                return true;
            }
            aux = aux.getProx();}
        return false;
    }
}

