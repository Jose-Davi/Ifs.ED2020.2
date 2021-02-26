package br.edu.ifs.ED_20202.lista;

public class Teste {
    public static void main(String[] args) throws Exception {
       LDE <Integer> list = new LDE<>();

            list.incluir(3);
            list.incluir(2);
            list.incluir(1);

            //System.out.println("----Lista Circular simplesmente encadeada----");
            list.incluirInicio(4);
            list.incluir(9,0);
            list.incluir(5,3);
            list.incluirInicio(4);
        System.out.println("Tamanho da lista:"+list.getTamanho());

       for(int i=0;i<list.getTamanho();i++){
           System.out.println(list.get(i));

       }
       /* System.out.println(list.contem(4));
        list.get(0);
        System.out.println("Elemento da Posicao 0 é: "+list.get(0));
        System.out.println("Tamanho da lista:"+list.getTamanho());
        System.out.println(list.getInicio().getElemento());
        System.out.println(list.getFim().getElemento());
        System.out.println(list.getFim().getProx().getElemento());
        ListaDuplaCircular<Integer> lista = new ListaDuplaCircular<>();
        lista.incluir(4);
        lista.incluir(3);
        lista.incluir(3);
        lista.incluir(2, 0);
        lista.incluir(5, 3);



        System.out.println("Tamanho da lista:"+lista.getTamanho());
        for(int i=0;i<lista.getTamanho();i++){
            System.out.println(lista.get(i));
        }

        lista.remover(2);
        System.out.println("___Depois da remoção___");
        for(int i=0;i<lista.getTamanho();i++){
            System.out.println(lista.get(i));
        }
        System.out.println("------------------------------");
        System.out.println(lista.getInicio().getElemento());
        System.out.println(lista.getFim().getElemento());
        System.out.println(lista.getFim().getProx().getElemento());
        System.out.println(lista.getInicio().getAnterior().getElemento());
        System.out.println("Buscando elementos");
        System.out.println(lista.contem(5));
        System.out.println(lista.get(0));
        System.out.println(lista.getPosElemento(5));*/


    }
}
