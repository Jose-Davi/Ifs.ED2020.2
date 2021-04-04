package br.edu.ifs.ED_20202.unidade_2;

public class Teste {

    public static void main(String[] args)throws Exception {
      /*  Pilha<String> pilha= new Pilha<>();
        pilha.empilhar("A");
        pilha.empilhar("B");
        pilha.empilhar("C");
        pilha.empilhar("D");
        pilha.empilhar("F");
        System.out.println("Elemento desimpilhado: "+pilha.desempilhar());
        System.out.println(pilha);
        System.out.println(pilha.estahVazia());
        System.out.println(pilha.getTopo());
        System.out.println("Elemento desimpilhado: "+pilha.desempilhar());*/
        Fila<Integer> fila= new Fila<>();
        fila.incluir(1);
        fila.incluir(2);
        fila.incluir(3);
        System.out.println("A fila está vazia?"+fila.estahVazia());
        //System.out.println("Qual a quantidade de elemntos da fila?"+fila.getQtd());
        System.out.println(fila.remover());
        System.out.println(fila.visualizarProximo());


    





}

    }

