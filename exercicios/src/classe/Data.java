package classe;

public class Data {
    
    int dia;
    int mes;
    int ano;
    String nome;

    // String dataFormatada() {
    //     return String.format("\nO aniversário de %s é %d de %s de %d.", nome,dia, mes, ano);
    // }

    Data(int diaFormatado, int mesFormatado, int anoFormatado) {
        dia = diaFormatado;
        mes = mesFormatado;
        ano = anoFormatado;
    }
    Data() {
        dia = 19;
        mes = 01;
        ano = 1970;
    }
}
