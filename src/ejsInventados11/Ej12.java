package ejsInventados11;

public class Ej12 {
	
	public int contador(int N) {
		
		int contador = 0;

		for (int i = 0; i < N; i++) {
		    for (int j = i; j < N; j++) {
		        contador++;
		    }
		}
		return contador;
	}
	
	// Lo mismo que el ejercicio anterior. i llega hasta
	// 3 porque N=4.
	// Toma valores desde 0 a 2. Se ejecuta 0 veces para 0,
	// 1 vez para 1, 2 veces para 2 y 3 veces para 3
	// Por lo que se ejecuta un total de 6 veces
	
	// N(N-1)/2
	
	// O(N^2)
}
