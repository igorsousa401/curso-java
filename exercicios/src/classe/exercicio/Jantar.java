package classe.exercicio;

public class Jantar {
    

    public static void main(String[] args) {
        
        Comida c1 = new Comida("Arroz", 0.3);

        Comida c2 = new Comida("Feijão", 0.2);
        
        Comida c3 = new Comida("Carne", 0.5);

        Pessoa p1 = new Pessoa("Igor", 90);

        p1.Comer(c1);
        p1.Comer(c2);
        p1.Comer(c2);
        p1.Comer(c1);
        p1.Comer(c1);
        p1.Comer(c1);
        p1.Comer(c2);
        p1.Comer(c2);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        p1.Comer(c3);
        
        
        p1.Comer(null);

    }
}
