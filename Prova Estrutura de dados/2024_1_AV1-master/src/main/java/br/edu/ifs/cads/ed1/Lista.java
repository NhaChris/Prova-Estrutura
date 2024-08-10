package br.edu.ifs.cads.ed1;

public abstract class Lista<T extends Comparable>  {


    /**
     * Adiciona um elemento no final da lista
     * @param elemento
     * @throws Exception
     */
    public abstract void incluir(T elemento) throws Exception;

    /**
     * Adiciona um elemento no início da lista
     * @param elemento
     * @throws Exception
     */
    public abstract void incluirInicio(T elemento) throws Exception;

    /**
     * Adiciona um elemento em uma posição específica da lista
     * @param elemento
     * @param posicao
     * @throws Exception
     */
    public abstract void incluir(T elemento, int posicao) throws Exception;

    /**
     * Retorna o elemento que está na posição
     * @param posicao
     * @return
     * @throws Exception
     */
    public abstract T get(int posicao)  throws Exception;

    /**
     * Retorna a posição do elemento
     * @param elemento
     * @return
     * @throws Exception
     */
    public abstract int getPosElemento(T elemento)  throws Exception;

    /**
     * Remove o elemento da posição
     * @param posicao
     * @throws Exception
     */
    public abstract void remover(int posicao) throws Exception;

    /**
     * Remove todos os elementos da lista.
     */
    public abstract void limpar();

    /**
     * Retorna a quantidade de elementos na lista
     * @return Quantidade de elementos na lista
     */
    public abstract int getTamanho();

    /**
     * Indica se contém ou não o elemento na lista
     * @param elemento
     * @return Veradeiro, se achou ou falso caso contrário.
     * @throws Exception
     */
    public abstract boolean contem(T elemento) throws Exception;
}
