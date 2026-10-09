package ejsInventados11;

public class Ej14 {

	public int contador(int N) {
		int contador = 0;

		for (int i = N; i > 1; i = i / 2) {
		    contador++;
		}
		return contador;
	}
	
	// Para N=32 se ejecuta 5 veces
	
	// log2(N)
	
	// O(log(N))
	
}
