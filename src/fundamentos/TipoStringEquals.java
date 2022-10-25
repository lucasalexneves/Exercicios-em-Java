package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2"); //true
		
		String s = new String ("2");
		System.out.println("2" == s); //false
		System.out.println("2".equals(s)); //true
		
		Scanner entrada = new Scanner (System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); //false
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}
}
