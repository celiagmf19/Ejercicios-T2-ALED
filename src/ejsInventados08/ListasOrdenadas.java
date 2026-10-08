package ejsInventados08;

public class ListasOrdenadas {

	public static NodoLista fusionar(NodoLista l1, NodoLista l2) {
		
		if(l1==null) {
			return l2;
		}
		
		if(l2==null) {
			return l1;
		}
		
		if(l1.dato<l2.dato) {
			l1.siguiente =fusionar(l1.siguiente, l2);
			return l1;
		} else {
			l2.siguiente = fusionar(l1, l2.siguiente);
			return l2;
		}
	}
	
}
