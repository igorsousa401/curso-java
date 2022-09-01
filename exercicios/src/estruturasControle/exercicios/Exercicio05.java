package estruturasControle.exercicios;

import java.util.Scanner;

public class Exercicio05 {
 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);


        int contador = 0;
        System.out.println("Digite o número para identificar se é primo: ");
        int numero = entrada.nextInt();

        for(int i = 2; i < numero; i++) {

            if(numero % i == 0) {
                contador++;
            }
        }

        switch(contador) {
            case 0:
                System.out.printf("O número %d é primo!", numero);
                break;
            default:
                System.out.printf("O número %d não é primo!", numero);
        }


        entrada.close();


        
    }
}
