package classe;

public class ProdutoTeste {
    
    public static void main(String[] args) {
        
        Produto p1 = new Produto();

        p1.nome = "Notebook";
        p1.preco = 4559.99;
        p1.desconto = 0.10;

        var p2 = new Produto();
        p2.nome = "Gol 1.0 2009";
        p2.preco = 25000.99;
        p2.desconto = 0.10;

        System.out.println(p1.preco);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;     
        
        System.out.printf("O preço médio do carrinho é de R$%.2f.", mediaCarrinho);
    }
}
