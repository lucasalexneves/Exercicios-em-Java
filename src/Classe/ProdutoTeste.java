package Classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		produto p1 = new produto("Notebook", 4356.89);
		//p1.nome ="Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		produto p2 = new produto();
		p2.nome ="Caneta Preta";
		p2.preco = 12.56;
		produto.desconto = 0.29;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double meediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		System.out.printf("Media do carrinho: R$%.2f.", meediaCarrinho);
	}    
}
