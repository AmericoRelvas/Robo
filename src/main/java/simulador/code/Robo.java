package simulador.code;

/**
 *
 * @author americo relvas
 */
public class Robo {
    float posicaoX;
    float posicaoY;
    final String nome;
    final float peso;
    final float velocidadeMax = 5;
    final float pesoCargaMax = 20;
    final String tipoTracao = "esteira";
    int orientacao;
    static final int FRENTE = 0;
    static final int ATRAS = 1;
    static final int ESQUERDA = 2;
    static final int DIREITA = 3;
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
    public void move(float posX, float posY){
        this.posicaoX = posX;
        this.posicaoY = posY;
    }
    public void setOrientacao(char tecla){
        if (tecla == 'w') {
            this.orientacao = FRENTE;
        }else if (tecla == 's') {
            this.orientacao = ATRAS;
        }else if (tecla == 'a') {
            this.orientacao = ESQUERDA;
        }else if (tecla == 'd') {
            this.orientacao = DIREITA;
        }
    }
    public void printPos() {
        System.out.println("Posição do Robô: (" + posicaoX + ", " + posicaoY + ")");
    }
}
