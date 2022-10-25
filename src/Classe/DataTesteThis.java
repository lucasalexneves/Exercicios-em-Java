package Classe;

public class DataTesteThis {

	public static void main(String[] args) {
		
		DataThis d1 = new DataThis();
		d1.ano = 2021;
		//d1.dia = 19;
		//d1.mes = 12;
		//d1.ano = 1993;

		DataThis d2 = new DataThis(21, 11, 1999);
		//d2.dia = 21;
		//d2.mes = 11;
		//d2.ano = 1999;
		
		//System.out.printf("Minha data de nascimento é: %d/%d/%d", 
		//		d1.dia, d1.mes, d1.ano);
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
