package ej206;

public class Palindromo {

	public static boolean esPalindromo(String texto) {
		if(texto==null || texto.length()<=1) {
			return true;
		}
		
		char primera = texto.charAt(0);
		char ultima  = texto.charAt(texto.length()-1);
		
		if(primera!=ultima) {
			return false;
		}
		
		return esPalindromo(texto.substring(1, texto.length()-1));
	}
	
}
