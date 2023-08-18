package simulador.main;

import simulador.code.Robo;
import java.util.Scanner; 

/**
 *
 * @author americo relvas
 */
//Classe App contendo o main para iniciar a aplicação
public class App {
    public static void main(String[] args) {
//Criação do objeto robo
        Robo robo = new Robo("RTM", 3.5f);
//Fazendo a leitura das posições por meio do teclado 
//Caso a tecla zero (0) seja pressionada, então, será encerrada a aplicação
//Se alguma outra tecla seja pressionada, uma exceção será lançada e uma nova tecla será requisitada
        String tecla = "";
        Scanner scan = new Scanner(System.in);
        boolean ok = false;
        do {
            try {
                tecla = scan.next();
                robo.setOrientacao(tecla.charAt(0));
                robo.printPos();                
            } catch (IllegalArgumentException ex){
                if (tecla.charAt(0) == '0') {
                    ok = true;
                } else {
                    System.out.println("Valor errado");
                    scan.nextLine();
                    ok = false;
                }
            }
        } while(!ok);
        robo.printPos();
    }
}
