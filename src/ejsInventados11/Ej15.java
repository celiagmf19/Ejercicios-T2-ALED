package ejsInventados11;

public class Ej15 {

	public static void procesar(int[] datos) {

	    for (int i = 0; i < datos.length; i++) {

	        for (int j = 0; j < datos.length - 1; j++) {

	            if (datos[j] > datos[j + 1]) {
	                int aux = datos[j];
	                datos[j] = datos[j + 1];
	                datos[j + 1] = aux;
	            }
	        }
	    }
	}
	
	// Ordena los elementos de un array, comprobando desde
	// el primer número, si es mayor que el siguiente, se
	// intercambian --> bubble sort
	
	// Se quedaría {2, 4, 1, 5}
	
	// En el peor caso, habría que cambiar todos los
	// números del array. Con el ejemplo anterior,
	// sería {5, 4, 2, 1}. En ese caso sería N^2
	
}
