package estruturasControle.exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {
    
    public static void main(String[] args) {
        
        

        Scanner entrada = new Scanner(System.in);

        int continuar;
		int numeroSorteado;
		int tentativas;
		int numero;

        
        do {
            System.out.println("Gerando um número entre 1 e 100...");
            Random aleatorio = new Random();
            numeroSorteado = aleatorio.nextInt(100) + 1;

            System.out.println("O jogo começou! Consegue me vencer?");
            tentativas = 0;
            

            do {

                tentativas++;
                System.out.printf("\nTentativa %d:  ", tentativas);
                numero = entrada.nextInt();

                if(numeroSorteado < numero) {
                    System.out.print("O número digitado é maior que o sorteado!");
                } else if(numeroSorteado > numero) {
                    System.out.print("O número digitado é menor que o sorteado!");
                } else {
                    System.out.print("Você acertou o número!");
                }


            } while(numero != numeroSorteado && tentativas < 10);

            System.out.println("\nDigite 0 para sair, ou qualquer outro número para continuar: ");
            continuar = entrada.nextInt();
        } while(continuar != 0);
        
        entrada.close();
    }
}
