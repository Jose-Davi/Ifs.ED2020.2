package br.edu.ifs.ED_20202.lista;

public class ListaDuplaCircular<T extends Comparable<T>> extends Lista<T> {

    private NoDupla inicio;
    private NoDupla fim;
    private int tamanho;

    public ListaDuplaCircular() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public NoDupla getInicio() {
        return inicio;
    }

    public NoDupla getFim() {
        return fim;
    }

    @Override
    public void incluir(T elemento) throws Exception {
        NoDupla<T> novoElemento = new NoDupla<>(elemento);
        if(this.tamanho==0){
            this.inicio=novoElemento;
            this.fim=novoElemento;
        }else{
            NoDupla aux=fim;
            this.fim=novoElemento;
            novoElemento.setAnterior(aux);
            novoElemento.setProx(aux.getProx());
            aux.setProx(novoElemento);

        }
        this.tamanho++;
        this.inicio.setAnterior(fim);
        this.fim.setProx(inicio);
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        NoDupla<T> novoElemento = new NoDupla<>(elemento);

        if(this.tamanho==0){
            this.inicio=novoElemento;
            this.fim=novoElemento;
        }else{
            this.inicio.setAnterior(novoElemento);
            novoElemento.setProx(inicio);
            this.inicio=novoElemento;
        }
        this.inicio.setAnterior(fim);
        this.fim.setProx(inicio);
        this.tamanho++;

    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        NoDupla<T>novoElemento = new NoDupla<T>(elemento);

        if(posicao<0){
            throw new IllegalArgumentException("Posição inválida!");
        }
        if(posicao==0){
            incluirInicio(elemento);
        }else if(posicao==this.tamanho-1){
            novoElemento.setAnterior(fim);
            fim.setProx(novoElemento);
            fim = novoElemento;
            this.tamanho++;
            //modificacao para circular
            this.inicio.setAnterior(fim);
            this.fim.setProx(inicio);

        }else {
            NoDupla aux= inicio;
            for(int i=0;i<posicao-1;i++){
                aux = aux.getProx();
            }
            novoElemento.setAnterior(aux);
            novoElemento.setProx(aux.getProx());
            aux.setProx(novoElemento);
            novoElemento.getProx().setAnterior(novoElemento);
            this.tamanho++;
        }


    }

    @Override
    public T get(int posicao) throws Exception {
        NoDupla atual = inicio;
        NoDupla elemento=null;
        if(this.tamanho==0){
            throw new IllegalAccessException("Lista vazia!");
        }
        for(int i=0;i<this.tamanho;i++){
            if(i==posicao){
                elemento=atual;
                break;
            }
            atual = atual.getProx();
        }
        return (T) elemento.getElemento();
    }

    @Override
    public int getPosElemento(T elemento) throws Exception {
        int contador=0;
        NoDupla aux=inicio;
        if(this.tamanho==0){
            throw new IllegalArgumentException("Lista vazia!");
        }
        for(int i=0;i<this.tamanho;i++){
            if (aux.getElemento().equals(elemento)) {
                return contador;

            }
            aux = aux.getProx();
            contador++;
        }return -1;
    }

    @Override
    public void remover(int posicao) throws Exception {
        if(posicao<0 || posicao>this.tamanho){
            throw new Exception("Posicao invalida!");
        }
        if(posicao==0){
            if(inicio==fim){
                this.inicio=this.fim=null;
            }else{
            this.inicio=inicio.getProx();

            //implementando a circular
            this.inicio.setAnterior(fim);
            this.fim.setProx(inicio);
           }
        }else{
            if(posicao==this.tamanho-1){
                this.fim=fim.getAnterior();
                //implementando a circular
                this.fim.setProx(inicio);
                this.inicio.setAnterior(fim);
            }else{
                NoDupla aux = inicio;
                for(int i=0;i<posicao;i++){
                    aux= aux.getProx();
                }if(aux.getAnterior() != null){
                    aux.getAnterior().setProx(aux.getProx());
                }
                if(aux.getProx() != null){
                    aux.getProx().setAnterior(aux.getAnterior());
                }

            }
        }this.tamanho--;

    }

    @Override
    public void limpar() {
        this.inicio= null;
        this.fim = null;
        this.tamanho=0;
        System.out.println("Lista Limpa com sucesso!");
    }

    @Override
    public int getTamanho() {
        return this.tamanho;
    }

    @Override
    public boolean contem(T elemento) throws Exception {
        NoDupla aux =inicio;
        if(this.tamanho==0){
            throw new IllegalArgumentException("Lista vazia!");
        }
        for(int i=0;i<this.tamanho;i++){
            if (aux.getElemento().equals(elemento)) {
                return true;
            }
            aux = aux.getProx();}
        return false;

    }
}

