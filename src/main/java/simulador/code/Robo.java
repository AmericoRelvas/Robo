package simulador.code;

/**
 *
 * @author americo relvas
 */
//Classe Robo que herda RoboIdeia
public class Robo extends RoboIdeia{
    private float posicaoX;
    private float posicaoY;
    private int orientacao;
    private final String nome;
    private final float peso;
    private final float velocidadeMax = 5;
    private final float pesoCargaMax = 20;
    private final String tipoTracao = "esteira";
    public static final int FRENTE = 0;
    public static final int ATRAS = 1;
    public static final int ESQUERDA = 2;
    public static final int DIREITA = 3;
    public Robo(String nome, float peso){
        this.nome = nome;
        this.peso = peso;
        this.posicaoX = 50;
        this.posicaoY = 50;
    }
    public Robo(String nome, float peso, float posX, float posY){
        this.nome = nome;
        this.peso = peso;
        this.posicaoX = posX;
        this.posicaoY = posY;
    }
    public void move(float pos){
        this.posicaoY = pos;
    }
    @Override
    public void move(float posX, float posY) {
        if (Float.isNaN(posX) || Float.isNaN(posY) ||
            Float.isInfinite(posX) || Float.isInfinite(posY)) {
            throw new IllegalArgumentException("Args não válidos");
        }
        super.posicaoX = posX;
        super.posicaoY = posY;
    }
    public float getPosicaoX() {
        return posicaoX;
    }
    public float getPosicaoY() {
        return posicaoY;
    }
    public int getOrientacao() {
        return orientacao;
    }
    @Override
    public String toString() {
        return "Robo{" + "posicaoX=" + posicaoX + ", posicaoY="
               + posicaoY + ", orientacao=" + orientacao + '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Robo){
            Robo robo = (Robo)obj;
            return this.nome.equals(robo.nome);
        } else {
            return false;
        }
    }
    public void setOrientacao(char tecla) {
        if (tecla == 'w') {
            super.orientacao = FRENTE;
            moveY(5);
        } else if (tecla == 's') {
            super.orientacao = ATRAS;
            moveY(-5);
        } else if (tecla == 'a') {
            super.orientacao = ESQUERDA;
            moveX(-5);
        } else if (tecla == 'd') {
            super.orientacao = DIREITA;
            moveX(5);
        } else {
            throw new IllegalArgumentException("Arg não válido");
        }
    }
    public void printPos() {
        System.out.println("Posição do Robô: (" + posicaoX + ", " + posicaoY + ")");
    }
   @Override
    public void moveX(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Arg não válido");
        }
        super.posicaoX += dist;
    }
    @Override
    public void moveY(float dist) {
        if (Float.isNaN(dist) || Float.isInfinite(dist)) {
            throw new IllegalArgumentException("Arg não válido");
        }
        super.posicaoY += dist;
    }
}
