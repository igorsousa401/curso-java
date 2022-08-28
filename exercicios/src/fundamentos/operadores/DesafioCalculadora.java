package fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// criação do novo objeto Locale
		final var localeAmericano = new Locale("en", "US");
		
		System.out.println("Informe o primeiro número: ");
		double num1 = entrada.useLocale(localeAmericano).nextDouble();
		
		System.out.println("Informe o segundo número: ");
		double num2 = entrada.useLocale(localeAmericano).nextDouble();
	
		System.out.println("Informe a operação: ");
		String operacao = entrada.useLocale(localeAmericano).next();
		
		
		
		// Lógica
		
		double resultado = operacao.equals("+") ? num1 + num2 : 0;
		resultado = operacao.equals("-") ? num1 - num2 : resultado;
		resultado = operacao.equals("*") ? num1 * num2 : resultado;
		resultado = operacao.equals("/") ? num1 / num2 : resultado;
		resultado = operacao.equals("%") ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		
		entrada.close();
	}
}
