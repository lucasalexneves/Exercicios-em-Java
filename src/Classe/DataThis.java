package Classe;

public class DataThis {
	
	int dia;
	int mes;
	int ano;

	DataThis () {
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(1,1,1970);
	}
	
	DataThis (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
	
}
