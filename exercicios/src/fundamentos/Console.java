package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom dia!!!");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		
		
		System.out.printf("\n\nNome = %s", nome);
		System.out.printf("\nIdade = %d %s", idade, "anos");
		
		entrada.close();
	}
}
