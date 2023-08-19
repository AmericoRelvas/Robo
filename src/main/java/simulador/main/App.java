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
        if (args.length != 0){
            args[0] = args[0].toLowerCase();
            if (args[0].equals("--author")) {
                System.out.println("Autor: Américo Relvas");
            } else if (args[0].equals("--version")) {
                System.out.println("Versão: 1.0.0");
            } else if (args[0].equals("--help")) {
                System.out.println("Exec. Movimentos Agendados:");
                System.out.println("\t--move w a w w s d d a");
            } else if (args[0].equals("--commands")) {
                System.out.println("Comandos suportados:");
                System.out.println("\tw: move para cima");
                System.out.println("\ta: move para esquerda");
                System.out.println("\ts: move para baixo");
                System.out.println("\td: move para direita");
                System.out.println("\t0: sair da aplicação");
            } else if (args[0].equals("--move")) {
                Robo robo = new Robo();
                System.out.println("Movimentos agendados: ");
                robo.movimentosAgendados(args);
            } else {
                System.out.println("Argumento não válido");
            }
            System.exit(0);
        }
        // Cria uma instância de um robô 
        Robo robo = new Robo();

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
