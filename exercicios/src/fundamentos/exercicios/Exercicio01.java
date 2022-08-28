package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da Temperatura em Fahrenheit: ");
		double tF = entrada.nextDouble();
		
		double tC = (double) (5 * (tF - 32)) / 9;

		System.out.printf("A temperatura de %.2f em Celsius é de %.2f", tF, tC);
		
		entrada.close();
	}
}
