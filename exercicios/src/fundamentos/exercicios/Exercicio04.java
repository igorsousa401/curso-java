package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o número: ");
		double num = entrada.nextDouble();
		
		double quadrado = Math.pow(num, 2);
		double cubo = Math.pow(num, 3);
		
		System.out.printf("%.2f ao quadrado é %.2f e ao cubo é %.2f.", num, quadrado, cubo);
		
		entrada.close();
	}
}
