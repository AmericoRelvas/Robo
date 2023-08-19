package simulador.code;

/**
 * Classe abstrata para modelar a ideia de uma caixa.
 * Esta classe define atributos e métodos básicos para manipulação de caixas.
 *
 * @author Americo Relvas
 */
public abstract class CaixaIdeia {
    protected int posX; // Posição X da caixa.
    protected int posY; // Posição Y da caixa.
    protected float peso; // Peso da caixa em quilogramas.
    protected final float comprimento; // Comprimento da caixa em unidades de medida.
    protected final float largura; // Largura da caixa em unidades de medida.
    protected final float altura; // Altura da caixa em unidades de medida.

    /**
     * Construtor que inicializa os atributos da caixa.
     *
     * @param posX Coordenada X da posição inicial da caixa.
     * @param posY Coordenada Y da posição inicial da caixa.
     * @param peso Peso da caixa em quilogramas.
     * @param comprimento Comprimento da caixa em unidades de medida.
     * @param largura Largura da caixa em unidades de medida.
     * @param altura Altura da caixa em unidades de medida.
     */
    public CaixaIdeia(int posX, int posY, float peso, 
                      float comprimento, float largura, float altura) {
        this.posX = posX;
        this.posY = posY;
        this.peso = peso;
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }

    /**
     * Obtém a coordenada X da posição da caixa.
     *
     * @return A coordenada X da posição da caixa.
     */
    public int getPosX() {
        return posX;
    }

    /**
     * Define a coordenada X da posição da caixa.
     *
     * @param posX A nova coordenada X da posição da caixa.
     */
    public void setPosX(int posX) {
        this.posX = posX;
    }

    /**
     * Obtém a coordenada Y da posição da caixa.
     *
     * @return A coordenada Y da posição da caixa.
     */
    public int getPosY() {
        return posY;
    }

    /**
     * Define a coordenada Y da posição da caixa.
     *
     * @param posY A nova coordenada Y da posição da caixa.
     */
    public void setPosY(int posY) {
        this.posY = posY;
    }

    /**
     * Obtém o peso da caixa.
     *
     * @return O peso da caixa em quilogramas.
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Define o peso da caixa.
     *
     * @param peso O novo peso da caixa em quilogramas.
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }
}
