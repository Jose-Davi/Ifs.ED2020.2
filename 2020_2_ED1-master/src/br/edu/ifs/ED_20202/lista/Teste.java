package br.edu.ifs.ED_20202.lista;

public class Teste {
    public static void main(String[] args) throws Exception{
        LSE<Integer> lista = new LSE<>();
        lista.incluir(6);
        lista.incluir(4);
        System.out.println("Primeiro elemento da lista"+lista.getInicio().getElemento());
        System.out.println("Ultimo elemento da lista"+lista.getFim().getElemento());

    }
}
