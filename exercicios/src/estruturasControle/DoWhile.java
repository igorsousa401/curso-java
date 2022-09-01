package estruturasControle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		do {
			System.out.println("Para sair tem que falar as palavras mágicas...");
			System.out.println("Deseja sair? ");
			valor = entrada.nextLine();
		} while(!valor.equalsIgnoreCase("por favor"));
		
		entrada.close();
	}
}
