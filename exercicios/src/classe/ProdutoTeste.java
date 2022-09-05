package classe;

public class ProdutoTeste {
    
    public static void main(String[] args) {
    
        Produto p1 = new Produto("Notebook", 4559.99, 0.10);

        var p2 = new Produto("Gol 1.0 2009", 25000.99, 0.10);

        System.out.println(p1.preco);

        double precoComDesconto1 = p1.precoComDesconto();
        double precoComDesconto2 = p2.precoComDesconto();
        double mediaCarrinho = (precoComDesconto1 + precoComDesconto2) / 2;     
        
        System.out.printf("O preço médio do carrinho é de R$%.2f.", mediaCarrinho);
    }
}
