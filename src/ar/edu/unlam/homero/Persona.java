package ar.edu.unlam.homero;

import java.util.Comparator;

public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private Integer edad;
	
	public Persona(String nombre, Integer edad){
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona otra) {
		return this.nombre.compareTo(otra.nombre);
		
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}
	
	public String compararClientes(Persona p2) {
		if(this.edad.compareTo(p2.edad)!=0) 
			if(this.edad.compareTo(p2.edad)==1)		
				return this.getNombre()+ " es mayor que " +p2.getNombre();
		return p2.getNombre()+ " es mayor que " +this.getNombre();
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	/*@Override
	public int compare(Persona p1,Persona p2) {
		return (p1.getEdad().compareTo(p2.getEdad()));
	}*/
	

}
