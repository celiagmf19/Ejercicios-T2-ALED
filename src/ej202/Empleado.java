package ej202;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	
	private String nombre;
	private double salario;
	private List<Empleado> subordinados;
	
	public Empleado(String nombre, double salario) {
		this.nombre = nombre;
		this.salario = salario;
		this.subordinados = new ArrayList<Empleado>();
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public List<Empleado> getSubordinados(){
		return this.subordinados;
	}
	
	public static double presupuestoEquipo(Empleado jefe) {
		if(jefe==null) {
			return 0.0;
		}
		
		double total = jefe.getSalario();
		
		if(jefe.getSubordinados()!=null) {
			for(Empleado sub : jefe.getSubordinados()) {
				total += presupuestoEquipo(sub);
			}
		}
		
		return total;
	}

}
