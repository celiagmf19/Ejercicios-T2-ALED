package ejsInventados02;

import java.util.List;

public class Empleado {
	
	private String nombre;
    private double salario;
    private List<Empleado> subordinados;

    public double getSalario() {
        return salario;
    }

    public List<Empleado> getSubordinados() {
        return subordinados;
    }
    
    public static double calcularCoste(Empleado empleado) {
    	if(empleado==null) {
    		return 0.0;
    	}
    	
    	double coste = 0.0;
    	
    	coste += empleado.getSalario();
    	
    	if(empleado.getSubordinados()!=null) {
	    	for(Empleado e : empleado.getSubordinados()) {
	    		coste += calcularCoste(e);
	    	}
    	}
    	
    	return coste;
    }
    
}
