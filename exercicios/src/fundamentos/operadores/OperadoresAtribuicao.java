package fundamentos.operadores;

public class OperadoresAtribuicao {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = 7;
		
		b = a + b;
		System.out.println(b);
		
		b += a;
		System.out.println(b);
		
		b -= a;
		System.out.println(b);
		
		b *= a;
		System.out.println(b);
		
		b /= a;
		System.out.println(b);
		
		b %= 2;
		System.out.println(b);
		
		
		if(b == 0) {
			System.out.printf("O número é par!");
		} else {
			System.out.printf("O número é impar!");
		}
	}
}
