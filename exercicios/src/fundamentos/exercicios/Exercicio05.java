package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do triângulo: ");
		double base = entrada.nextDouble();
		
		System.out.println("Digite o valor da altura do triângulo: ");
		double altura = entrada.nextDouble();
		
		double areaT = (base * altura) / 2;
		
		System.out.printf("A área do triângulo vale %.2f", areaT);
	
		entrada.close();
	}
}
