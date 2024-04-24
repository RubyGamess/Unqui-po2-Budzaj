package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiOperadorTestCase {

	
	
	private Multioperador multiOperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		multiOperador = new Multioperador();
		
		multiOperador.addNumber(2);
		multiOperador.addNumber(4);
	}
	
	
	
	
	
	@Test
	void testSuma() {
		int amount = multiOperador.sumarNumeros();
		assertEquals(amount, 6);
	}

	@Test
	void testResta() {
		int amount = multiOperador.restarNumeros();
		assertEquals(amount, -6);
	}
	
	@Test
	void testMultiplicador() {
		int amount = multiOperador.multiEntreSi();
		assertEquals(amount, 8);
	}
}
