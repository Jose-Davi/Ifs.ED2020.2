package br.edu.ifs.ED_20202.lista;

public class Teste {
    public static void main(String[] args) throws Exception{
       LSE<Integer> listaEn = new LSE<>();
        listaEn.incluir(6);
        listaEn.incluir(4);
        listaEn.incluir(55,2);
        //System.out.println("Primeiro elemento da lista "+lista.getInicio().getElemento());
        //System.out.println("Ultimo elemento da lista "+lista.getFim().getElemento());
        //ListaSequencial<Integer> listas= new ListaSequencial<>(Integer.class);
        //listas.incluir(3);
        //listas.incluir(1);
        //listas.incluir(8);
        //listas.incluir(2);
        for(int i = 0;i< listaEn.getTamanho();i++){
           System.out.println(listaEn.get(i));
        }
        LDE<Integer> lista= new LDE<>();
        lista.incluirInicio(3);
        lista.incluirInicio(1);
        lista.incluirInicio(9);
        lista.incluir(6);
        lista.incluir(7);
        for(int i=0;i<lista.getTamanho();i++){
            System.out.println(lista.get(i));
        }
        lista.incluir(8,2);
        System.out.println("Depois da inserção na posicao 2");
        for(int i=0;i<lista.getTamanho();i++){
            System.out.println(lista.get(i));
        }
        lista.limpar();

        System.out.println(lista.get(2));




    }
}
