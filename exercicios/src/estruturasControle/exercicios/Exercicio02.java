package estruturasControle.exercicios;

import java.util.Scanner;

public class Exercicio02 {
    

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o ano: ");
        int ano = entrada.nextInt(); 

        if(ano % 4 == 0) {
            System.out.println("O ano é Bissexto!!!");
        } else{

            System.out.println("O ano NÃO é Bissexto!!!");
        }

        entrada.close();    
    }
}
