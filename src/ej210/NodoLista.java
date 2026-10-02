package ej210;

public class NodoLista {

	int dato;
	NodoLista siguiente;
	
	public static NodoLista fusionarListas(NodoLista l1, NodoLista l2) {
		
		// Si la lista 1 está vacía, devuelve la 2
		if(l1==null) {
			return l2;
		}
		
		// Si la lista 2 está vacía, devuelve la 1
		if(l2==null) {
			return l1;
		}
		
		// Si el dato de la lista 1 es más pequeño que el de la lista 2, ponemos el primero el valor de la
		// lista 1, el más pequeño, y luego el siguiente es el más pequeño entre el mismo valor de la lista 2
		// y el siguiente de la lista 1, devolviendose en la lista 1
		if(l1.dato<=l2.dato) {
			l1.siguiente = fusionarListas(l1.siguiente, l2);
			return l1;
		} else {
			// Si es más pequeño el de la 2, hacemos lo mismo pero al revés
			l2.siguiente = fusionarListas(l1, l2.siguiente);
			return l2;
		}
		
	}

	
}
