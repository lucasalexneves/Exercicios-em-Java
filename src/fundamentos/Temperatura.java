package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (ºF - 32) X 5/9 = ºC
		
		final double FATOR = 5.0/9.0;
		final double AJUSTE = 32;
		
		double fahrenheint = 86;
		double celsius = (fahrenheint - AJUSTE) * FATOR;
		System.out.println("A temperatura é " + celsius + " C.");

		fahrenheint = 0;
		celsius = (fahrenheint - AJUSTE) * FATOR;
		System.out.println("A temperatura é " + celsius + " C.");
	}
}
