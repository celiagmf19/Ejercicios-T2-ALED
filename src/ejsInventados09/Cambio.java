package ejsInventados09;

public class Cambio {

	public static int contarFormas(int objetivo, int[] monedas) {
		if(objetivo==0) {
			return 1;
		}
		
		if(monedas==null) {
			return 0;
		}
		
		int formas = 0;;
		
		int[] cantidades = {1, 3, 4};
		
		for(int i=0; i<monedas.length;i++) {
			for(int cantidad= 0; cantidad<=monedas[i]; cantidad++) {
				int valor = cantidad*cantidades[i];
				if(valor<=objetivo) {
					formas += contarFormas(objetivo-valor, monedas);
				}
			}
		}
		
		return formas;
	}
	
}

// En este ejercicio no se tienen en cuenta la redundancia de 1+2 
// y 2+1, se cuentan dos veces
