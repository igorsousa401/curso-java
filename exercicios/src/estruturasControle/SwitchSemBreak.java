package estruturasControle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "preta";
		
		
		// COM O BREAK
		switch(faixa) {
			
			case "preta":
				System.out.println("Sei de tudo!");
			case "roxa":
				System.out.println("Seu algumas coisas!");
			case "amarela":
				System.out.println("Sei de pouca coisa!");
				break;
			default:
				System.out.println("Não sei de nada!");
		}
		
		
		// SEM O BREAK
		switch(faixa) {
		
		case "preta":
			System.out.println("Sei de tudo!");
		case "roxa":
			System.out.println("Seu algumas coisas!");
		case "amarela":
			System.out.println("Sei de pouca coisa!");
			break;
		default:
			System.out.println("Não sei de nada!");
	}
	}
}
