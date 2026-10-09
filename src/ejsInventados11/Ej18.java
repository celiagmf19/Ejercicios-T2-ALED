package ejsInventados11;

public class Ej18 {

	public static void metodo(int n) {

	    if (n <= 0)
	        return;

	    metodo(n - 1);
	    metodo(n - 1);
	}
	
	// para n=1: 3
	
	// para n=2: 7
	
	// para n=3: 15
	
	// 2^(n+1) -1
	
	// O(2^n)
	
}
