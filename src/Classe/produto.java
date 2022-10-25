package Classe;

public class produto {

	String nome;
	double preco;
	static double desconto = 0.25;

	produto (){
		
	}

	produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}

	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
