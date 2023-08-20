package simulador.code;

/**
 * Classe abstrata para modelar a ideia de um robô.
 * Essa classe define atributos e métodos básicos para manipulação de robôs.
 * @since 1.0
 * @version 1.0
 * @author Americo Relvas
 */
public abstract class RoboIdeia {
    /**
     * Posição X atual do robô.
     */
    protected float posicaoX;

    /**
     * Posição Y atual do robô.
     */
    protected float posicaoY;

    /**
     * Orientação atual do robô.
     * 0 representa Norte, 90 representa Leste, 180 representa Sul e 270 representa Oeste.
     */
    protected Orientacao orientacao;

    /**
     * Nome do robô.
     */
    protected String nome;

    /**
     * Peso do robô em quilogramas.
     */
    protected float peso;

    /**
     * Move o robô para uma posição específica.
     *
     * @param posX Coordenada X da nova posição.
     * @param posY Coordenada Y da nova posição.
     */
    public abstract void move(float posX, float posY);

    /**
     * Move o robô ao longo do eixo X por uma determinada distância.
     *
     * @param dist Distância a ser percorrida ao longo do eixo X.
     */
    public abstract void moveX(float dist);

    /**
     * Move o robô ao longo do eixo Y por uma determinada distância.
     *
     * @param dist Distância a ser percorrida ao longo do eixo Y.
     */
    public abstract void moveY(float dist);
}

