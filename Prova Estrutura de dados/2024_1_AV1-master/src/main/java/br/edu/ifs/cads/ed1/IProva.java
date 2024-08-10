package br.edu.ifs.cads.ed1;

public interface IProva<T extends Comparable> {
    /**
     * Adiciona o conteúdo da <param>l1</param> e da lista <param>l2</param> à lista atual.
     * @param l1 primeira lista contendo valores
     * @param l2 segunda lista contendo valores
     */
    void importarListas(Lista<T> l1, Lista<T> l2) throws Exception;

    /**
     * Adiciona o conteúdo da <param>l1</param> e da lista <param>l2</param> à lista atual.
     * Se o <param>manterOrdenacao</param> for verdadeiro, verificar se a lista de destino (a atual),
     * as listas <param>l1</param> e <param>l2</param> também estão ordenadas.
     * Caso negativo lançar um erro.
     * @param l1 primeira lista contendo valores
     * @param l2 segunda lista contendo valores
     * @param manterOrdenacao parâmetro que indica se é necessário manter a ordenação dos dados. Caso seja positivo,
     *                        todas as listas envolvidas devem ser ordenadas.
     *                        Caso o parâmetro tenha seu valor como false, não há necessidade de verificação se as
     *                        listas afetadas estão, originalmente, ordenadas.
     */
    void importarListas(Lista<T> l1, Lista<T> l2, boolean manterOrdenacao) throws Exception;
    /**
     * Inpeciona a lista atual para saber se ela está ou não ordenada.
     * @return true em caso da lista ordenada e false se ela não estiver ordenada.
     * @throws Exception
     */boolean estahOrdenada()  throws Exception;

    /**
     * Inpeciona uma lista para saber se ela está ou não ordenada.
     * @param lista lista a inspecionada
     * @return true em caso da lista ordenada e false se ela não estiver ordenada.
     * @throws Exception
     */
    boolean estahOrdenada(Lista<T> lista)  throws Exception;

}
