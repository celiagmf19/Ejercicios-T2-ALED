package ejsInventados11;

public class Ej20 {

	public static int misterioso(int n) {

	    if (n <= 1)
	        return 1;

	    return misterioso(n / 2) + misterioso(n / 2);
	}
	
	// para n=4, se ejecuta 7 veces
	
	// 15
	
	// Se reduce a la mitad, se generan dos llamadas 
	// nuevas por cada una anterior
	
	// O(n)
	
}
