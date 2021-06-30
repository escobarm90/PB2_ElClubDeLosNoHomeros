package ar.edu.unlam.homero;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BarTest {
	
	
	@Test
	public void queSePuedaAbrirElBarSinPersonas() {
		Bar bar = new Bar("Bar De Homero");
		bar.abrirBar();
		assertEquals(bar.getCantidadDePersonasPresentes(),0,0.1);
		assertEquals(bar.getBarAbierto(),true);
	}
	

	@Test
	public void queNoSePuedanAgregarDosPersonasConElMismoNombre() {
		Bar bar = new Bar("Bar De Homero");
		Persona p1 = new Persona("Agustin",25);
		Persona p2 = new Persona("Agustin",22);
		Persona p3 = new Persona ("Benjamin",24);
		
		bar.agregarCliente(p1);
		bar.agregarCliente(p2);
		bar.agregarCliente(p3);
		
		Integer personasEsperadas = 2;
		
		assertEquals(personasEsperadas,bar.getCantidadDePersonasPresentes(),0.1);
	}
	
	@Test
	public void queSePresentenAlfabeticamente() {
		Bar bar = new Bar("Bar De Homero");
		Persona p1 = new Persona("Agustin",25);
		Persona p2 = new Persona("Polaco",25);
		Persona p3 = new Persona("Julian",25);
		Persona p4 = new Persona("Pablo",25);
		
		bar.agregarCliente(p3);
		bar.agregarCliente(p2);
		bar.agregarCliente(p4);
		bar.agregarCliente(p1);
		
		
		
		assertEquals(bar.presentarClientesPorNombre().first(),p1);
		assertEquals(bar.presentarClientesPorNombre().last(),p2);
		
	
	}
			
	
	
	@Test
	public void queLosClientesSePresentenOrdenadosPorEdad() {
		Bar bar = new Bar("Bar De Homero");
		Persona p1 = new Persona("Agustin",30);
		Persona p2 = new Persona("Ernesto",30);
		Persona p3 = new Persona("Julian",33);
		Persona p4 = new Persona("Pablo",18);
		
		bar.agregarCliente(p1);
		bar.agregarCliente(p2);
		bar.agregarCliente(p3);
		bar.agregarCliente(p4);
		
		bar.abrirBar();
		
		assertEquals(bar.presentarClientesPorEdad().size(),3);
		assertEquals(bar.getCantidadDePersonasPresentes(),4,0.1);
		assertEquals(bar.presentarClientesPorEdad().first(),p4);
		assertEquals(bar.presentarClientesPorEdad().last(),p3);
		
		
	}
	
}
