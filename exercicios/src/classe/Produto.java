package classe;

public class Produto{
    
    String nome;
    double preco;
    static double desconto = 0.25;

    double precoComDesconto() {
        double precoComDesconto = preco * (1 - desconto);
        return precoComDesconto;
    }

    Produto(String nomeProduto, double precoProduto){
        nome = nomeProduto;
        preco = precoProduto;
    }
}
