package estruturasControle.exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        Scanner entrada =  new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();


        double media = (nota1 + nota2) / 2;
        
        if(media <= 10 && media >= 7) {
            System.out.println("Aprovado!!!!");
        } else if(media < 7 && media >= 4) {
            System.out.println("Prova Final!");
        } else if(media < 4 && media >= 0) {
            System.out.println("Reprovado!");
        } else {
            System.out.println("Alguma nota inserida é inválida!");
        }

        entrada.close();
    }
}
