package fundamentos.controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String palavra = "#";
		
		for(String i = "."; !i.equals("......"); i += ".") {
			
			System.out.println(palavra);
			palavra += "#";
		}
	}
}
