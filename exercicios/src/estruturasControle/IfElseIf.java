package estruturasControle;

import javax.swing.JOptionPane;

public class IfElseIf {

	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Digite a nota: ");
		
		int nota = Integer.parseInt(value);
		
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Inválida!");
		} else if(nota >= 8.1) {
			System.out.println("Conceito A!");
		} else if(nota >= 6.1) {
			System.out.println("Conceito B!");
		} else if(nota >= 4.1) {
			System.out.println("Conceito C!");
		} else if(nota >= 2.1) {
			System.out.println("Conceito D!");
		} else {
			System.out.println("Conceito E!");
		}
	}
}
