package classe;

public class ValorNull {
    

    public static void main(String[] args) {
        
        String s1 = "";
        System.out.println(s1.concat("!!!"));

        Data d1 = Math.random() > 0.5 ? new Data() : null;

        if(d1 != null) {
            d1.dia = 30;
            System.out.println(d1.dia);
        }

    }
}
