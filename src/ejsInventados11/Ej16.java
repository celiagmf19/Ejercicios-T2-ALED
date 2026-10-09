package ejsInventados11;

public class Ej16 {

	public static int buscar(int[] arr, int inicio, int fin, int x) {

	    if (inicio > fin)
	        return -1;

	    int medio = (inicio + fin) / 2;

	    if (arr[medio] == x)
	        return medio;

	    if (arr[medio] > x)
	        return buscar(arr, inicio, medio - 1, x);

	    return buscar(arr, medio + 1, fin, x);
	}
	
	// Toma el valor 24, 52, 31, 40
	
	// 4
	
	// O(log(N))
	
	// Para que esto funcione, tiene que estar ordenado
	// de menor a mayor, sino podría descartar que tenga
	// el valor buscado
	
}
