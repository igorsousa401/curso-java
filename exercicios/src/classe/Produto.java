package classe;

public class Produto{
    
    String nome;
    double preco;
    double desconto;

    double precoComDesconto() {
        double precoComDesconto = preco * (1 - desconto);
        return precoComDesconto;
    }

    Produto(String nomeProduto, double precoProduto, double descontoProduto){
        nome = nomeProduto;
        preco = precoProduto;
        desconto = descontoProduto;
    }
}
