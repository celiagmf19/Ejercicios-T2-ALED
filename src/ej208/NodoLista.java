package ej208;

public class NodoLista {
	
	int dato;
	NodoLista siguiente;
	
	public static NodoLista invertirRecursivo(NodoLista actual) {

		if(actual==null || actual.siguiente==null) {
			return actual;
		}
		
		NodoLista nueva = invertirRecursivo(actual.siguiente);
		
		actual.siguiente.siguiente = actual;
		
		actual.siguiente = null;
		
		return nueva;
	}
	
}
