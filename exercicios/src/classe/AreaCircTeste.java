package classe;

public class AreaCircTeste {
    
    public static void main(String[] args) {
        AreaCirc a1 = new AreaCirc(10);
        AreaCirc a2 = new AreaCirc(5);

        AreaCirc.PI = 10;
        System.out.printf("A área da Circunferência de raio %.2f é de %.2f.", a1.raio ,a1.Area());
        System.out.printf("\nA área da Circunferência de raio %.2f é de %.2f.", a2.raio , a2.Area());

    }
}
