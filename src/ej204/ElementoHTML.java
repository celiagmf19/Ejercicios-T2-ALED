package ej204;

import java.util.List;

public class ElementoHTML {

	private String tag;
	private List<ElementoHTML> hijos;
	
	public String getTag() {
		return this.tag;
	}
	public List<ElementoHTML> getHijos(){
		return this.hijos;
	}
	
	public static int contarEtiquetas(ElementoHTML elemento, String tagBuscado) {
		if(elemento==null || tagBuscado==null) {
			return 0;
		}
		
		int total = 0; 
		
		if(tagBuscado.equals(elemento.getTag())) {
			total++;
		}
		
		if(elemento.getHijos()!=null) {
			for(ElementoHTML e : elemento.getHijos()) {
				 total += contarEtiquetas(e, tagBuscado);
			}
		}
		
		return total;
	}
}
