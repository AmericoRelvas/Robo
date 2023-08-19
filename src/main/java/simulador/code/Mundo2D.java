package simulador.code;

/**
 * Representa um mundo 2D com dimensões fixas.
 * Essa classe define as dimensões do mundo e permite a criação de uma instância de um ambiente 2D.
 *
 * @author Américo Relvas
 */
public class Mundo2D {
    final int DIM_X; // Dimensão X do mundo.
    final int DIM_Y; // Dimensão Y do mundo.

    /**
     * Construtor para criar um novo mundo 2D.
     *
     * @param dimX Dimensão X do mundo.
     * @param dimY Dimensão Y do mundo.
     */
    public Mundo2D(int dimX, int dimY) {
        this.DIM_X = dimX;
        this.DIM_Y = dimY;
    }
}
