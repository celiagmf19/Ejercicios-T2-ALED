package ej205;

import java.util.List;

public class Pieza {

	private String nombre;
	private boolean esDefectuosa;
	private List<Pieza> componentes;
	
	public boolean isDefectuosa() {
		return this.esDefectuosa;
	}
	
	public List<Pieza> getComponentes(){
		return this.componentes;
	}
	
	public static boolean contieneDefectos(Pieza piezaPrincipal) {
		if(piezaPrincipal != null) {
			return false;
		}
		
		if(piezaPrincipal.isDefectuosa()) {
			return true;
		}
		
		if(piezaPrincipal.getComponentes() != null) {
			for(Pieza p : piezaPrincipal.getComponentes()) {
				if(contieneDefectos(p)==true) {
					return true;
				}
			}
		}
		
		return false;
	}
	
}
