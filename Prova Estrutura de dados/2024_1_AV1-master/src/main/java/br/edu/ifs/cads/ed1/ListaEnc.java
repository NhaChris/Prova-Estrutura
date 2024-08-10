package br.edu.ifs.cads.ed1;

public class ListaEnc<T extends Comparable<T>> extends Lista<T> implements IProva<T> {

    No inicio;
    No fim;
    public ListaEnc(){

    }

    @Override
    public void incluir(T elemento) throws Exception {
        No Novo = new No<>(elemento);
        if (inicio == null) {
            inicio = Novo;
            fim = Novo;
        }
        else {
            fim.setProximo(Novo);
            fim = Novo;
        }
    }


    public T get(int posicao)  throws Exception {
        int n = 1;
        No<T> NoAtual = inicio;
        if (NoAtual == null){
            throw new Exception("Lista Vazia");
        }
        while (n < posicao){
            NoAtual = NoAtual.getProximo();
            n++;
            if (NoAtual == null){
                throw new Exception("Não encontrado");
            }
        }
        return NoAtual.getDado();

    }


    public int getPosElemento(T elemento)  throws Exception {
        int n = 1;
        No<T> NoAtual = inicio;
        if (NoAtual == null){
            throw new Exception("Lista Vazia");
        }
        while (NoAtual.getDado() != elemento){
            NoAtual = NoAtual.getProximo();
            n++;
            if (NoAtual == null){
                throw new Exception("Não encontrado");
            }
        }
        return n;
    }

    @Override
    public void incluirInicio(T elemento) throws Exception {
        No Novo = new No<>(elemento);
        Novo.setProximo(inicio);
        inicio = Novo;
    }

    @Override
    public void incluir(T elemento, int posicao) throws Exception {
        No Novo = new No<>(elemento);
        No Antigo = inicio;
        No Aux = null;
        int len = 0;
        while(Antigo != null){
            Antigo = Antigo.getProximo();
            len++;
        }
        Antigo = inicio;
        int place = 1;
        if(inicio == null){
            throw new Exception("Lista Vazia, tente não incluir uma posição");
        }
        if(posicao > len){
            throw new Exception("Posição informada excede tamanho da lista");
        }
        while(place < posicao){
            Aux = Antigo;
            Antigo = Antigo.getProximo();
            place++;
        }
        if(Aux == null) {
            Novo.setProximo(Antigo);
            inicio = Novo;
        }
        else {
            Aux.setProximo(Novo);
            Novo.setProximo(Antigo);
        }
    }

    @Override
    public void remover(int posicao) throws Exception {
        No Aux = inicio;
        No NoAtual = inicio;
        int place = 1;
        if(inicio == null){
            throw new Exception("Lista Vazia");
        }
        if(posicao <= 0){
            throw new Exception("Posição deve ser maior que 0");
        }
        if(posicao == 1){
            inicio = inicio.getProximo();
        }
        else{
            while(place < posicao){
                Aux = NoAtual;
                NoAtual = NoAtual.getProximo();
                place++;
            }
            if(NoAtual == null){
                Aux.setProximo(null);
            }
            else{
                Aux.setProximo(NoAtual.getProximo());
            }
        }
    }

    @Override
    public int getTamanho() {
        No NoAtual = inicio;
        int tamanho = 0;
        if(inicio == null){
            return 0;
        }
        while(NoAtual != null){
            tamanho++;
        }
        return tamanho;
    }

    public void limpar() {
        inicio = null;
    }



    @Override
    public boolean contem(T elemento) throws Exception {
        No Atual = inicio;
        boolean result = false;
        while(Atual != null){
            if(Atual.getDado() == elemento){
                result = true;
            }
            Atual = Atual.getProximo();
        }
        return result;
    }

    @Override
    public void importarListas(Lista<T> l1, Lista<T> l2) throws Exception {

    }

    @Override
    public void importarListas(Lista<T> l1, Lista<T> l2, boolean manterOrdenacao) throws Exception {

    }

    @Override
    public boolean estahOrdenada() throws Exception {
        No Atual = inicio;
        boolean result = true;
        while(Atual.getProximo() != null){
            if(Atual.compareTo(Atual.getProximo()) == 1){
                result = false;
            }
            Atual = Atual.getProximo();
        }
        return result;
    }

    @Override
    public boolean estahOrdenada(Lista<T> lista) throws Exception {
        return false;
    }
}