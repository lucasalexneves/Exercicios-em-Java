package Classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		//d1.dia = 19;
		//d1.mes = 12;
		//d1.ano = 1993;

		Data d2 = new Data(21, 11, 1999);
		//d2.dia = 21;
		//d2.mes = 11;
		//d2.ano = 1999;
		
		
		
		//System.out.printf("Minha data de nascimento é: %d/%d/%d", 
		//		d1.dia, d1.mes, d1.ano);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}
