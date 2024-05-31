package Semana6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Semana6.Color;
import Semana6.LesionesDermatologicas;

class tpLesiones {

	public LesionesDermatologicas lesion;
	public Color rojo = Color.ROJO;
	public Color amarillo = Color.AMARILLO;
	public Color miel = Color.MIEL;
	@BeforeEach
	void setUp() throws Exception {
		lesion = new LesionesDermatologicas();
	}

	@Test
	void test() {
		assertEquals("es color Rojo",lesion.descripcionDeColor(rojo));
		assertEquals("es el color amarillo",lesion.descripcionDeColor(amarillo));
		assertEquals(1,lesion.riesgoColor(rojo));
		assertEquals(3,lesion.riesgoColor(amarillo));
		assertTrue(lesion.siguienteDe(amarillo) == miel );
}

}
