package classe;

public class DataTeste {
    
    public static void main(String[] args) {
        
        Data d1 = new Data();
        d1.dia = 28;
        d1.mes = "junho";
        d1.ano = 2002;

        var d2 = new Data();
        d2.dia = 30;
        d2.mes = "Outubro";
        d2.ano = 2002;

        System.out.printf("\nO aniversário de Igor é %d de %s de %d.", d1.dia, d1.mes, d1.ano);
        System.out.printf("\nO aniversário de Kelly é %d de %s de %d.", d2.dia, d2.mes, d2.ano);
    }
}
