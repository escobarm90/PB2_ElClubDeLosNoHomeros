package ar.edu.unlam.homero;

import java.util.Set;
import java.util.TreeSet;



public class Bar {

	private String nombre;
	private TreeSet<Persona> clientes;
	private Boolean abierto;
	
	public Bar(String nombre) {
		this.nombre = nombre;
		this.clientes = new TreeSet<Persona>();
	}
	
	public void abrirBar() {
		this.abierto=true;
	}
	
	public void CerrarBar() {
		this.abierto=false;
	}
	
	public Boolean getBarAbierto() {
		return abierto;
	}
	
	public Integer getCantidadDePersonasPresentes() {
		return this.clientes.size();
	}
	
	public void agregarCliente(Persona cliente) {
		this.clientes.add(cliente);
	}
	
	public TreeSet<Persona> presentarClientesPorNombre(){
		
		return this.clientes;
		
	}
	
	public TreeSet<Persona> presentarClientesPorEdad(){		
		OrdenPorEdad orden = new OrdenPorEdad();
		TreeSet<Persona> ordenados = new TreeSet<Persona>(orden);
		ordenados.addAll(clientes);
		if(this.abierto)
		return ordenados;
		else return null;
	}
	 
	
}
