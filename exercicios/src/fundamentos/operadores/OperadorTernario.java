package fundamentos.operadores;

public class OperadorTernario {
	
	public static void main(String[] args) {
		
		double media = 4.6;
		
		String resultadoParcial = media >= 5 ? "Em recuperação" : "Reprovado";
		
		String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;
		
		System.out.printf("O aluno está %s!", resultadoFinal);
	}

}
