package ejsInventados11;

public class Ej11 {

	public int contador(int N) {
		int contador = 0;
	
		for (int i = 0; i < N; i++) {
		    for (int j = 0; j < i; j++) {
		        contador++;
		    }
		}
		return contador;
	}
	
	// i < N, por lo tanto i va desde 0 a 4, ya que el
	// 5 no entra puesto que N es 5. j < i asi que como 
	// máximo llega hasta 3, puesto que i como máximo
	// es 4. Por tanto, toma valores de 0 a 3, se
	// ejecuta un total de 10 veces
	
	// N(N-1)/2
	
	// O(N^2)
	
}
