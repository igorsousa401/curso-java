package fundamentos.operadores;

public class DesafioOperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int left = (int) Math.pow((6 * (3+2)), 2) / (3 * 2);
		
		int right = (int) Math.pow(((1-5) * (2-7) / 2), 2);
		
		int total = (int) Math.pow((left - right), 3) / (int) Math.pow(10, 3);
		
		System.out.printf("O valor da expressão é %d.", total);
	}
}
