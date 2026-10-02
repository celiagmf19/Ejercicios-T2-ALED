package ej209;

public class Cambio {
	

	public static int contarFormasCambio(int objetivo, int[] monedas) {
		
		// Estos son los valores que tienen las monedas de cada posición
		int[] valores = {1, 2, 5};
		
		// No podemos tener modenas nulas o no tener monedas para un valor concreto (se pone 0 si no tenemos monedas)
		if(monedas.length<valores.length || monedas==null) {
			return 0;
		}
		
		// Contamos tres veces, una por cada tipo de moneda
		return contar(objetivo, monedas, valores, valores.length-1);
	}
	
	
	// Esto se crea para evitar permutaciones, tipo que no cuente dos veces 1+2 y 2+1
	private static int contar(int objetivo, int[] cantidades, int[] valores, int indice) {
		
		// Si el cambio es 0, devolvemos 1 porque solo hay una forma de devolver 0
		if(objetivo==0) {
			return 1;
		}
		
		// No podemos devolver -3 euros
		if(objetivo<0) {
			return 0;
		}
		
		// El índice sirve para recorrer el array de monedas y de valores, no podemos tener posiciones negativas
		if(indice<0) {
			return 0;
		}
		
		// Tomamos los parámetros según el índice
		int valor = valores[indice];
		int cantidad = cantidades[indice];
		int formas = 0;
		
		// Recorremos las tres cantidades de monedas y la multiplicamos por su valor
		// correspondiente para ver el dinero que tenemos
		for(int i=0; i<=cantidad; i++) {
			int suma = i*valor;
			
			// Si ya tenemos el cambio que queremos, dejamos de contar
			if(suma>objetivo) {
				break;
			}
			
			// Vamos añadiendo si hemos encontrado una forma o no, hemos empezado por el número más
			// alto del arraya y vamos restando 1 hasta llegar a 0
			formas += contar(objetivo-suma, cantidades, valores, indice-1);
		}
		
		// Devolvemos las formas que tenemos
		return formas;
	}
}

