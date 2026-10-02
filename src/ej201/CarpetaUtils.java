package ej201;

public class CarpetaUtils {

	public static double calcularPesoTotal(Carpeta inicio) {
		if(inicio==null) {
			return 0.0;
		}
		
		double pesoTotal = 0.0;
		
		if(inicio.getArchivos()!=null) {
			for(Archivo a : inicio.getArchivos()) {
				pesoTotal += a.getPesoB();
			}
		}
		
		if(inicio.getSubcarpetas()!=null) {
			for(Carpeta sub : inicio.getSubcarpetas()) {
				pesoTotal += calcularPesoTotal(sub);
			}
		}
		
		return pesoTotal;
	}
	
}
