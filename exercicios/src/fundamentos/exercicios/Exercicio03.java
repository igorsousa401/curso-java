package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua altura em m: ");
		double altura = entrada.nextDouble();
		
		System.out.println("Digite seu peso kg: ");
		double peso = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("O seu IMC é de %.2f", imc);
		
		entrada.close();
	}
}
