package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá Pessoal".charAt(2));
		
		String s = "Boa tarde";
		//s = s.toUpperCase(); //Colocando a String acima em maiusculo
		System.out.println(s.concat("!!!")); //Usando função concat
		System.out.println(s + "!!!"); // Usando função + tem praticamente o mesmo efeito de concat
		System.out.println(s.startsWith("Boa")); //Pergunta se começa com Boa
		System.out.println(s.toLowerCase().startsWith("boa")); // Transforma tudo em minusculo e pergunta se começa com boa
		System.out.println(s.endsWith("Tarde")); //termina com
		System.out.println(s.length()); //Quantas letras possui
		System.out.println(s.equals("boa tarde")); // Se é igual
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Se é igual ignorando letras maiusculas e minusculas
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade +
				"\nSalario: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\n\nO senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
				
	}

}
