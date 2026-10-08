package ejsInventados08;

public class NodoLista {

	 int dato;
	 NodoLista siguiente;
	 
	 public static NodoLista invertir(NodoLista actual) { 
		 
		 if(actual==null || actual.siguiente==null) {
			return actual;
		 }
		 
		 NodoLista primero = invertir(actual.siguiente);
		 
		 actual.siguiente.siguiente = actual;
		 actual.siguiente = null;
		 
		 return primero;
		 
	 }
	
}

