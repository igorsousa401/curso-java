package classe;

public class DataTeste {
    
    public static void main(String[] args) {
        
        Data d1 = new Data();
    
        var d2 = new Data(30, "Outubro", 2002);

        System.out.printf("%d/%s/%d",d1.dia, d1.mes, d1.ano);
        System.out.printf("\n%d/%s/%d",d2.dia, d2.mes, d2.ano);
    }
}
