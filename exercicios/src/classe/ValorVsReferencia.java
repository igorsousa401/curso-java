package classe;

public class ValorVsReferencia {
    
    public static void main(String[] args) {
        
        double a = 2;
        double b = a;

        a++;
        b--;
        System.out.println(a + " " + b);

        Data d1 = new Data(1, 3, 1987);
        Data d2 = d1;

        System.out.printf("%d/%s/%d", d1.dia, d1.mes, d1.ano);
        System.out.printf("\n%d/%s/%d", d2.dia, d2.mes, d2.ano);

        voltarParaOValorPadrao(d1);
        System.out.printf("\n%d/%s/%d", d1.dia, d1.mes, d1.ano);
        System.out.printf("\n%d/%s/%d", d2.dia, d2.mes, d2.ano);

        int c = 5;
        alterarTipoPrimitivo(c);
        System.out.println("\n" + c);
    }

    static void voltarParaOValorPadrao(Data d) {
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarTipoPrimitivo(double d) {
        d++;
    }
}
