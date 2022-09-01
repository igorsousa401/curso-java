package estruturasControle.exercicios;

import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int maiorNumero = 0;
        int contador = 0;

        do{
            System.out.println("\nDigite um número:\n ");
            int valor = entrada.nextInt();

            if(valor > maiorNumero) {
                maiorNumero = valor;
            }

            contador++;
        } while(contador != 10);

        System.out.printf("O maior valor foi %d.", maiorNumero);

        entrada.close();
    }
}
