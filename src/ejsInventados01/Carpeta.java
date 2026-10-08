package ejsInventados01;

import java.util.List;

public class Carpeta {

	private String nombre;
    private List<Archivo> archivos;
    private List<Carpeta> subcarpetas;

    public List<Archivo> getArchivos() {
        return archivos;
    }

    public List<Carpeta> getSubcarpetas() {
        return subcarpetas;
    }
    
    public static double calcularTamano(Carpeta carpeta) {
    	if(carpeta==null) {
    		return 0.0;
    	}
    	
    	double tamano = 0.0;
    	
    	if(carpeta.getArchivos()!=null) {
	    	for(Archivo a : carpeta.getArchivos()) {
	    		tamano += a.getTamano();
	    	}
    	}
    	
    	if(carpeta.getSubcarpetas()!=null) {
			for(Carpeta c : carpeta.getSubcarpetas()) {
				tamano += calcularTamano(c);
			}
    	}
    	
    	return tamano;
    }
    
}
