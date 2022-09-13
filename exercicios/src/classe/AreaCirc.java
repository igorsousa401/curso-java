package classe;

public class AreaCirc {
    
    static double PI = 3.1415;
    double raio;

    AreaCirc(double raioInicial) {
        raio = raioInicial;
    }

    double Area() {
        return PI * Math.pow(raio, 2);
    }
}
