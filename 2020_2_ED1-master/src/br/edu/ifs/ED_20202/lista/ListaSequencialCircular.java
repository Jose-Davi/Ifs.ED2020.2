package br.edu.ifs.ED_20202.lista;

public class ListaSequencialCircular <T extends Comparable<T>> extends Lista<T> {

        private T[] lista;
        private int qtdMax;
        private int fim;
        private int tamanho;
        private int inicio;
        int fimLista;


        public ListaSequencialCircular(Class<T> dataType){
            super();
            qtdMax = 5;
            this.lista = (T[]) java.lang.reflect.Array.newInstance(dataType, qtdMax);
            this.tamanho=0;
            this.inicio=0;

        }

       public T[] getLista() {
         return lista;
      }

      public void setLista(T[] lista) {
        this.lista = lista;
      }

      public int getQtdMax() {
        return qtdMax;
      }

      public void setQtdMax(int qtdMax) {
        this.qtdMax = qtdMax;
      }

      public int getFim() {
        return fim;
      }

      public void setFim(int fim) {
        this.fim = fim;
      }

      public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
      }

      public int getInicio() {
        return inicio;
      }

      public void setInicio(int inicio) {
        this.inicio = inicio;
      }

    @Override
        public void limpar() {
              this.fim=-1;
              this.inicio=fim;
        }
        @Override
        public T get(int posicao) throws Exception {
            if(this.tamanho==0){
                throw new IllegalAccessException("Lista Vazia!");
            }
             return this.lista[(inicio+posicao)%qtdMax];

        }

        @Override
        public int getPosElemento(T elemento) throws Exception {
           if (tamanho == 0 ){
            throw new Exception("Lista vazia!");}
            for(int i=0;i<fim;i++){
                if(lista[i].equals(elemento)){
                    return i;
                }
            }
         return -1;
        }

        @Override
        public void incluir(T elemento) throws Exception {
            if(this.tamanho==this.qtdMax){
                throw new IllegalAccessException("A lista está cheia,impossivel adicionar novo elemento");
            }if(this.tamanho==0){

                lista[fim]=elemento;
                this.inicio=fim;
                fim=(fim+1)%qtdMax;

            }else {

                lista[fim]=elemento;
                fim=(fim+1)%qtdMax;
            }
            this.tamanho++;
            this.fimLista=tamanho-1;

        }

        @Override
        public void incluirInicio(T elemento) throws Exception {
            if(this.tamanho==qtdMax){
                throw new Exception("Lista ja está cheia!");
            }else
            if(this.tamanho==0){
                lista[fim]=elemento;
                inicio=fim;
                fim=(fim+1)%qtdMax;
            }else{
                inicio=(fim+tamanho)%qtdMax;
                fim=(fim+1)%qtdMax;}
            lista[inicio]=elemento;
            this.tamanho++;

        }
        @Override
        public void incluir(T elemento, int posicao) throws Exception {
            if(this.tamanho==this.qtdMax){
                throw new IllegalAccessException("A lista está cheia,impossivel adicionar novo elemento");
            }if(this.tamanho==0){
                lista[fim]=elemento;
                this.inicio=fim;
                fim=(fim+1)%qtdMax;


            }else{if(posicao==inicio){
                lista[(inicio+tamanho)%qtdMax] = elemento;

            }else{
                if(posicao==fim-1){
                    lista[fim]=elemento;
                    fim=(fim+1)%qtdMax;

                }
            }
                for(int i=fim-1;i>=posicao;i--){
                    this.lista[i+1] = this.lista[i];
                }
                this.lista[posicao]=elemento;

            }
            this.tamanho++;
            this.fimLista=tamanho-1;
        }

        @Override
        public void remover(int posicao) throws Exception {
            if(this.tamanho==0){
                throw new IllegalAccessException("Lista Vazia!");
            }
                if(posicao==inicio){
                  inicio=(inicio+1)%qtdMax;

                    this.tamanho--;
                }else {
                    if (posicao == fim) {
                        fim = (fim + 1) % qtdMax;
                        this.tamanho--;
                    } else {
                        if (lista[posicao] != null) {
                            for (int i = posicao; i < this.tamanho - 1; i++) {
                                this.lista[i] = this.lista[i + 1];
                            }
                        }
                        this.tamanho--;
                    }
                }
            this.fimLista=tamanho-1;
        }
        @Override
        public int getTamanho() {
            return this.tamanho;
        }

        @Override
        public boolean contem(T elemento) throws Exception {
            for(int i=0;i<this.tamanho;i++){
                if(this.lista[i].equals(elemento)){
                    return true;
                }
            }
            return false;
        }

    }





