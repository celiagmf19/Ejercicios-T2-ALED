package ejsInventados03;

import java.util.List;

public class Categoria {
	
	private String nombre;
    private List<Categoria> subcategorias;

    public List<Categoria> getSubcategorias() {
        return subcategorias;
    }
	
    public static int contarCategorias(Categoria raiz) {
    	if(raiz==null) {
    		return 0;
    	}
    	
    	int categorias = 1;
    	
    	if(raiz.getSubcategorias()!=null) {
    		for(Categoria c : raiz.getSubcategorias()) {
    			categorias += contarCategorias(c);
    		}
    	}
    	
    	return categorias;
    }
    
}
