package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {


	private Persona persona;
	private Persona persona2;

	@BeforeEach
	void setUp() throws Exception {
		persona = new Persona("Juan", new Date(6),7);
		persona2 = new Persona("Samira",new Date(3),45);

	}

	@Test
	void testMenorQue() {
		assertEquals(persona.menorQue(persona2),true);
	}

}
