package br.edu.ifs.ED_20202.unidade_2;

public class Fila <T>{
    private int tamanho;
    private No <T> inicio;
    private No <T> fim;

    public Fila(){
      this.tamanho=0;
      this.inicio=null;
      this.fim=null;
    }
    public void incluir(T elemento){
        No<T> novoElemento = new No<T>(elemento);
        if(estahVazia()){
            this.inicio=novoElemento;
            this.fim=novoElemento;
        }else{
            this.fim.setProx(novoElemento);
            this.fim = novoElemento;
        }
        this.tamanho++;

    }
    public T remover() throws FilaVaziaException{
        if(this.estahVazia()){
            throw new FilaVaziaException();
        }
        T elemento= this.inicio.getElemento();
        No atual = this.inicio;
        this.inicio=atual.getProx();
        atual.setProx(null);
        this.tamanho--;
        return elemento;
    }

    public int getQtd(){
        return this.tamanho;
    }

    public boolean estahVazia(){
        return this.tamanho==0;
    }

    public T visualizarProximo()throws FilaVaziaException{
        if(this.estahVazia()){
            throw new FilaVaziaException();
        }
        return this.inicio.getProx().getElemento();
    }
    public void limpar(){
        this.tamanho=0;
        this.inicio=null;
        this.fim=null;
    }


}
