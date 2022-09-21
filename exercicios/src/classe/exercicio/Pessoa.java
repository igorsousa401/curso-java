package classe.exercicio;

public class Pessoa {
    
        String nome;
        double peso;

    Pessoa(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void Comer (Comida comida) {
        
        if(comida != null) {
            peso +=  comida.pesoComida;
            System.out.printf("\nO peso total é de %.2f", peso);
        } else {
            System.out.printf("\nO peso total é de %.2f", peso);
        }
        
    }
}
