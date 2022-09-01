package estruturasControle.exercicios;

import java.util.Scanner;


public class Exercicio07 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int number = 0;

       
        int total = 0;

        while(number >= 0) {

            System.out.println("Digite um número: ");
            number = entrada.nextInt();
            if(number >= 0) {
                total += number;
                System.out.printf("\nO total deu, até o momento, %d.\n", total);
            }
        }

        entrada.close();

        
    }
}
