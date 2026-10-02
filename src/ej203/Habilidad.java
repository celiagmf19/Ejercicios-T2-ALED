package ej203;

import java.util.List;

public class Habilidad {

	private String id;
	private int costePuntos;
	private List<Habilidad> desbloqueables;
	
	public int getCoste() {
		return this.costePuntos;
	}
	
	public List<Habilidad> getDesbloqueables(){
		return this.desbloqueables;
	}
	
	public static int costeRamaCompleta(Habilidad raiz) {
		if(raiz.getDesbloqueables()==null) {
			return 0;
		}
		
		int coste = raiz.getCoste();
		
		for(Habilidad h : raiz.getDesbloqueables()) {
			coste += costeRamaCompleta(h);;
		
		}
		return coste;
	}
	
}
