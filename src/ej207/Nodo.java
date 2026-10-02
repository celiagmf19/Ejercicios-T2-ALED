package ej207;

public class Nodo {

	int valor;
	Nodo izq, der;
	
	public static boolean esBST(Nodo nodo) {
		return esBSTAux(nodo, null, null);
	}
	
	private static boolean esBSTAux(Nodo nodo, Nodo min, Nodo max) {
		if(nodo==null) {
			return true;
		}
		
		if(min!=null && nodo.valor<=min.valor) {
			return false;
		}
		
		if(max!=null && nodo.valor>=max.valor) {
			return false;
		}
		
		return esBSTAux(nodo.izq, min, nodo) && esBSTAux(nodo.der, nodo, max);
	}
	
}
