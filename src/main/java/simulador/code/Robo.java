package simulador.code;

/**
 * Representa um robô com funcionalidades de movimento e orientação.
 * Essa classe estende a classe abstrata RoboIdeia e adiciona informações específicas de um robô real.
 *
 * @author Americo Relvas
 */
public class Robo extends RoboIdeia {
    private float posicaoX; // Posição X atual do robô.
    private float posicaoY; // Posição Y atual do robô.
    private int orientacao; // Orientação atual do robô (FRENTE, ATRAS, ESQUERDA, DIREITA).
    private final String nome; // Nome do robô.
    private final float peso; // Peso do robô em quilogramas.
    private final float velocidadeMax = 5; // Velocidade máxima do robô.
    private final float pesoCargaMax = 20; // Peso máximo da carga que o robô pode transportar.
    private final String tipoTracao = "esteira"; // Tipo de tração do robô.
    public static final int FRENTE = 0;
    public static final int ATRAS = 1;
    public static final int ESQUERDA = 2;
    public static final int DIREITA = 3;

    /**
     * Construtor para criar um novo robô com nome e peso.
     *
     * @param nome O nome do robô.
     * @param peso O peso do robô em quilogramas.
     */
    public Robo(String nome, float peso) {
        this.nome = nome;
        this.peso = peso;
        this.posicaoX = 50;
        this.posicaoY = 50;
    }
    /**
     * Construtor para criar um novo robô com nome, peso e posição inicial.
     *
     * @param nome O nome do robô.
     * @param peso O peso do robô em quilogramas.
     * @param posX A posição inicial do robô no eixo X.
     * @param posY A posição inicial do robô no eixo Y.
     */
    public Robo(String nome, float peso, float posX, float posY) {
        this.nome = nome;
        this.peso = peso;
        this.posicaoX = posX;
        this.posicaoY = posY;
    }
    /**
     * Move o robô para uma nova posição no eixo Y.
     *
     * @param pos A nova posição no eixo Y.
     */
    public void move(float pos) {
        this.posicaoY = pos;
    }
    /**
    * Move o robô para uma nova posição especificada no plano.
    *
    * @param posX A nova coordenada X da posição do robô.
    * @param posY A nova coordenada Y da posição do robô.
    * @throws IllegalArgumentException Se posX ou posY forem NaN (not-a-number) ou infinitos.
    */
    @Override
    public void move(float posX, float posY) {
        if (Float.isNaN(posX) || Float.isNaN(posY) ||
            Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException("Args não válidos");
        }
        super.posicaoX = posX;
        super.posicaoY = posY;
    }

    /**
    * Obtém a coordenada X atual da posição do robô.
    *
    * @return A coordenada X atual da posição do robô.
    */
    public float getPosicaoX() {
        return posicaoX;
    }

    /**
    * Obtém a coordenada Y atual da posição do robô.
    *
    * @return A coordenada Y atual da posição do robô.
    */
    public float getPosicaoY() {
        return posicaoY;
    }

    /**
    * Obtém a orientação atual do robô.
    *
    * @return A orientação atual do robô.
    */
    public int getOrientacao() {
        return orientacao;
    }

    /**
    * Retorna uma representação em forma de string do estado atual do robô.
    *
    * @return Uma string contendo as informações de posição e orientação do robô.
    */
    @Override
    public String toString() {
        return "Robo{" + "posicaoX=" + posicaoX + ", posicaoY="
        + posicaoY + ", orientacao=" + orientacao + '}';
    }

    /**
    * Verifica se este robô é igual a outro objeto.
    *
    * @param obj O objeto a ser comparado.
    * @return true se o objeto é um robô e possui o mesmo nome, false caso contrário.
    */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Robo){
            Robo robo = (Robo)obj;
            return this.nome.equals(robo.nome);
        } else {
            return false;
        }
    }
    /**
    * Define a orientação do robô com base na tecla pressionada e move o robô na direção correspondente.
    *
    * @param tecla A tecla pressionada ('w', 's', 'a' ou 'd').
    * @throws IllegalArgumentException Se a tecla não for válida.
    */
    public void setOrientacao(char tecla) {
        if (tecla == 'w') {
            super.orientacao = FRENTE;
            moveY(5); // Move o robô para a frente no eixo Y.
        } else if (tecla == 's') {
            super.orientacao = ATRAS;
            moveY(-5); // Move o robô para trás no eixo Y.
        } else if (tecla == 'a') {
            super.orientacao = ESQUERDA;
            moveX(-5); // Move o robô para a esquerda no eixo X.
        } else if (tecla == 'd') {
            super.orientacao = DIREITA;
            moveX(5); // Move o robô para a direita no eixo X.
        } else {
            throw new IllegalArgumentException("Arg não válido");
        }
    }

    /**
    * Imprime a posição atual do robô no formato "(posicaoX, posicaoY)".
    */
    public void printPos() {
        System.out.println("Posição do Robô: (" + posicaoX + ", " + posicaoY + ")");
    }

    /**
    * Move o robô ao longo do eixo X por uma determinada distância.
    *
    * @param dist A distância a ser percorrida ao longo do eixo X.
    * @throws IllegalArgumentException Se dist for NaN (not-a-number) ou infinito.
    */
    @Override
    public void moveX(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Arg não válido");
        }
        super.posicaoX += dist; // Atualiza a posição X do robô.
    }

    /**
    * Move o robô ao longo do eixo Y por uma determinada distância.
    *
    * @param dist A distância a ser percorrida ao longo do eixo Y.
    * @throws IllegalArgumentException Se dist for NaN (not-a-number) ou infinito.
    */
    @Override
    public void moveY(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Arg não válido");
        }
        super.posicaoY += dist; // Atualiza a posição Y do robô.
    }
}