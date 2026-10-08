package ejsInventados06;

public class Palindromo {

	public static boolean esPalindromo(String texto) {
		if(texto==null) {
			return false;
		}
		
		if(texto.length()<=1) {
			return true;
		}
		
		char c = texto.charAt(0);
		char d = texto.charAt(texto.length()-1);
		
		if(c!=d) {
			return false;
		}
		
		String newTexto = texto.substring(1, texto.length()-1);
		
		return esPalindromo(newTexto);
	
	}
	
}
