package ejsInventados10;

public class Nodo {

	int valor;
    Nodo izquierdo;
    Nodo derecho;
	
    public static int altura(Nodo nodo) {
    	if(nodo==null) {
    		return 0;
    	}
    	
    	int alturas = 1;
    	
    	int izquierda = altura(nodo.izquierdo);
    	int derecha = altura(nodo.derecho);
    	
    	return alturas; 
    }
}
