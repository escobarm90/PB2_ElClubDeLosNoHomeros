package ar.edu.unlam.homero;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClienteTest {
	
	@Test
	public void queDosPersonasConElMismoNombreSeanIguales() {
		
		Persona p1 = new Persona("Agustin",15);
		Persona p2 = new Persona("Agustin",22);
		
		assertEquals(p1,p2);
	
	}
}
