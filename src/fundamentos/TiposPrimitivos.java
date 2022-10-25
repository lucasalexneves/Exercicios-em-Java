package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Informações do funcionário
		
		//Tipos numéricos inteiros
		byte AnosDeEmpresa = 23;
		short NumeroDeVoos = 542;
		int id = 56789;
		long PontosAcumulados = 3_134_845_223L;
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double VendasAcumuladas = 2_991_797_103.01;
		
		//Tipo Booleano
		boolean EstaDeFerias = false; //true
		
		// Tipo Caractere
		char status = 'A'; //Ativo
		
		// Dias de empresa
		System.out.println("O funcionário possui " + AnosDeEmpresa * 365 + " Dias na empresa.");
		
		// Número de Viagens
		System.out.println("O funcionário possui " + NumeroDeVoos / 2 + " viagens pela empresa.");
		
		// Pontos por real
		System.out.println("O funcionário possui " + PontosAcumulados / VendasAcumuladas + " Pontos por real na empresa");
		
		System.out.println(id + ": ganha --> " + salario);
		System.out.println("Férias? " + EstaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
