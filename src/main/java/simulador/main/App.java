package simulador.main;

import simulador.code.Robo;
import java.util.Scanner; 

/**
 * Classe de entrada para iniciar a aplicação simuladora de robôs.
 * Esta classe contém o método main, que inicia a interação com o usuário para controlar o robô.
 * O usuário pode informar comandos para definir a orientação do robô e visualizar sua posição.
 * Os comandos válidos são 'w' (frente), 's' (trás), 'a' (esquerda) e 'd' (direita).
 * Para encerrar a interação, o usuário deve digitar '0'.
 * Se um valor inválido for inserido, uma mensagem de erro será exibida.
 *
 * @author americo relvas
 */
public class App {
    public static void main(String[] args) {

        // Cria uma instância de um robô com nome "RTM" e peso 3.5f.
        Robo robo = new Robo("RTM", 3.5f);

        String tecla = ""; // Armazena a tecla inserida pelo usuário.
        Scanner scan = new Scanner(System.in); // Objeto Scanner para ler a entrada do usuário.
        boolean ok = false; // Indica se a interação deve ser encerrada.

        // Loop para interagir com o usuário e controlar o robô.
        do {
            try {
                tecla = scan.next(); // Lê a tecla inserida pelo usuário.
                robo.setOrientacao(tecla.charAt(0)); // Define a orientação do robô com base na tecla.
                robo.printPos(); // Imprime a posição atual do robô.
            } catch (IllegalArgumentException ex) {
                if (tecla.charAt(0) == '0') {
                    ok = true; // Encerra a interação.
                } else {
                    System.out.println("Valor errado");
                    scan.nextLine(); // Lê a próxima linha para limpar o buffer.
                    ok = false;
                }
            }
        } while (!ok);

        robo.printPos(); // Imprime a posição final do robô.
    }
}
