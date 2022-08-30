package estruturasControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Digite um número: ");
		
		int number = Integer.parseInt(value);
		
		
		if(number % 2 == 0) {
			System.out.println("O número é par!");
		} else {
			System.out.println("O número é impar!");
		}
	}
}
