package ejsInventados11;

public class Ej17 {

	public static void metodo(int n) {

	    if (n <= 0)
	        return;

	    System.out.println(n);

	    metodo(n - 1);
	}
	
	// 4, 3, 2, 1
	
	// n+1, es decir, 5 porque se cuenta el 0
	
	// O(n)
	
}
