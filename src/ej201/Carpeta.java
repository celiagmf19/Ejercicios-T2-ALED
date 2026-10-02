package ej201;

import java.util.List;

public class Carpeta {

	private String nombre;
	private List<Archivo> archivos;
	private List<Carpeta> subcarpetas;
	
	public Carpeta(String nombre) {
		
	}
	
	public List<Archivo> getArchivos(){
		return this.archivos;
	}
	
	public List<Carpeta> getSubcarpetas(){
		return this.subcarpetas;
	}
	
}
