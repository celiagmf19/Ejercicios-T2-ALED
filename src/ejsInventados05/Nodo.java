package ejsInventados05;

import java.util.List;

public class Nodo {

	int valor;
    List<Nodo> hijos;
    
    public static int sumar(Nodo raiz) {
    	if(raiz==null) {
    		return 0;
    	}
    	
    	int suma = 0;
    	
    	suma += raiz.valor;
    	
    	if(raiz.hijos!=null) {
			for(Nodo n : raiz.hijos) {
				suma += sumar(n);
			}
    	}
    	
    	return suma;
    }
	
}
