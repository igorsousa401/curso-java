package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite a temperatura em °C: ");
		double tC = entrada.nextDouble();
		
		double tF = ((tC / 5) * 9) + 32;
		
		System.out.printf("%.1f °C é igual a %.1f °F.", tC, tF);
		
		entrada.close();
		}
}
