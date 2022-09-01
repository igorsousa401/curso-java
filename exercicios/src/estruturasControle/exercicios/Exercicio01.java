package estruturasControle.exercicios;

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int num = entrada.nextInt();

        if(num <= 10 && num >= 0) {
            System.out.println("O número está entre 0 e 10!");
        } else {
            System.out.println("O número NÃO está entre 0 e 10!");
        }

        if(num % 2 == 0) {
            System.out.println("O número é par!");
        } else{
            System.out.println("O número é impar!");
        }

        entrada.close();
    }
}
