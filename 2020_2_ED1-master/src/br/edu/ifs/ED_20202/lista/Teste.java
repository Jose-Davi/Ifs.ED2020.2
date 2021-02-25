package br.edu.ifs.ED_20202.lista;

public class Teste {
    public static void main(String[] args) throws Exception {
        ListaEncadeadaCircular<Integer> list= new ListaEncadeadaCircular<>();
        try {
            list.incluir(3);
            list.incluir(2);
            list.incluir(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //list.remover(1);

        System.out.println("Tamanho da lista:"+list.getTamanho());
        list.incluirInicio(4);
       list.incluir(9,0);
       list.incluir(5,3);
        list.incluirInicio(4);

        No aux = list.getInicio();
       for(int i=0;i<list.getTamanho();i++){
           System.out.println(aux.getElemento());
           aux=aux.getProx();

       }
        System.out.println(list.contem(4));
        list.get(0);
        //System.out.println("Elemento da Posicao 0 é: "+list.get(0));
        System.out.println("Tamanho da lista:"+list.getTamanho());
        System.out.println(list.getInicio().getElemento());
        System.out.println(list.getFim().getElemento());
        System.out.println(list.getFim().getProx().getElemento());

    }
}
