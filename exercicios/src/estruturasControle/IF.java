package estruturasControle;

import java.util.Scanner;

public class IF {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da média: ");
		double media = entrada.nextDouble();
		
		
		if(media >= 7 && media <= 10) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!!!");
		}
		if(media < 7 && media >= 4) {
			System.out.println("Recuperação!");
		}
		if(media < 4 && media >= 0) {
			System.out.println("Reprovado!");
		}
		if(media > 10 || media < 0) {
			System.out.println("A resposta está Incorreta!");
		}
		
		entrada.close();
	}
}
