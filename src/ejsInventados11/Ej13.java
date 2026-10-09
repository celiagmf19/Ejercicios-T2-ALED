package ejsInventados11;

public class Ej13 {

	public int contador(int N) {
		
		int contador = 0;

		for (int i = 0; i < N; i++) {
		    for (int j = 1; j < N; j *= 2) {
		        contador++;
		    }
		}
		return contador;
	}
	
	// Siendo N=8 se ejecuta 3 veces.
	
	// log2(N)
	
	// O(log(N)) aquí no hace falta especificar la base
	// porqwe cambiar la base solo introduce una cte
	
}
