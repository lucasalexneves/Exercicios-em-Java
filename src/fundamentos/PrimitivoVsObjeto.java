package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = "Texto"; //Objeto
		s.toUpperCase();
		
		// Wrappers são a versão objeto dos tipos primitivo!
		int a = 123;
		System.out.println(a);
		
	}
}
