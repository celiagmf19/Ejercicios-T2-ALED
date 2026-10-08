package ejsInventados04;

import java.util.List;

public class Nodo {
	
	private int valor;
    private List<Nodo> hijos;

    public int getValor() {
        return valor;
    }

    public List<Nodo> getHijos() {
        return hijos;
    }
    
    public static boolean contiene(Nodo raiz, int buscado) {
    	if(raiz==null) {
    		return false;
    	}
    	
    	if(raiz.getValor()==buscado) {
    		return true;
    	}
    	
    	if(raiz.getHijos()!=null) {
    		for(Nodo n : raiz.getHijos()) {
    			if(contiene(n, buscado)){
    				return true;
    			}
    		}
    	}
    	return false;
    }
	
}
