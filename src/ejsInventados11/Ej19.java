package ejsInventados11;

public class Ej19 {
	
	public class Nodo {

		int valor;
	    Nodo izquierdo;
	    Nodo derecho; 
	}

	public static int contar(Nodo nodo) {

	    if (nodo == null)
	        return 0;

	    int izquierda = contar(nodo.izquierdo);
	    int derecha = contar(nodo.derecho);

	    return 1 + izquierda + derecha;
	}
	
	// Solo 1 vez por nodo
	
	// N
	
	// No afecta a la complejidad temporal pero sí
	// a la profundidad recursiva
	
}
