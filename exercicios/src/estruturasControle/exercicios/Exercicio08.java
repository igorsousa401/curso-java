package estruturasControle.exercicios;

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a palavra para ser inserida: ");
        String palavra = entrada.nextLine();

        char letras[] = palavra.toCharArray();

        for(int i = 0; i < letras.length; i++) {
            System.out.println(letras[i]);
        }
        entrada.close();
    }
}
