package simulador.code;

/**
 * Representa uma caixa com itens.
 * Essa classe estende a classe abstrata CaixaIdeia e adiciona informações específicas de uma caixa real.
 *
 * @author Americo Relvas
 */
public class Caixa extends CaixaIdeia {
    public String nomeItem; // Nome do item contido na caixa.
    public int qtdItem; // Quantidade do item contido na caixa.

    /**
     * Construtor para criar uma nova instância de Caixa.
     *
     * @param nomeItem O nome do item contido na caixa.
     * @param qtdItem A quantidade do item contido na caixa.
     * @param posX Coordenada X da posição inicial da caixa.
     * @param posY Coordenada Y da posição inicial da caixa.
     * @param peso Peso da caixa em quilogramas.
     * @param comprimento Comprimento da caixa em unidades de medida.
     * @param largura Largura da caixa em unidades de medida.
     * @param altura Altura da caixa em unidades de medida.
     */
    public Caixa(String nomeItem, int qtdItem, int posX, 
                 int posY, float peso, float comprimento, 
                 float largura, float altura) {
        super(posX, posY, peso, comprimento, largura, altura);
        this.nomeItem = nomeItem;
        this.qtdItem = qtdItem;
    }

    /**
     * Retorna uma representação em forma de string da caixa.
     *
     * @return Uma string contendo o nome do item e a quantidade de itens na caixa.
     */
    @Override
    public String toString() {
        return "Caixa{" + "nomeItem=" + nomeItem + 
               ", qtdItem=" + qtdItem + '}';
    }
}