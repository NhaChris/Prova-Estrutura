package br.edu.ifs.cads.ed1;

public class Main {
    public static void main(String[] args) throws Exception {
        ListaEnc lista = new ListaEnc<Integer>();

        lista.incluir(2);
        lista.incluir(3);
        lista.incluir(7);
        if(lista.contem(8)){
            System.out.println("Sim");
        }
        if(lista.estahOrdenada()){
            System.out.println("Sim");
        }
        else{
            System.out.println("Não");
        }
    }
}