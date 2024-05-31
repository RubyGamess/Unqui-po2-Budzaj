package Semana6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {

	Carta Asdr;
	Carta Aspr;
	Carta Astr;
	Carta Ascr;
	Carta Sietetr;
	Carta diezcn;
	PokerStatus status;
	@BeforeEach
	void setUp() throws Exception {
		status = new PokerStatus();
		Asdr = new Carta(1,"Diamante","Rojo");
		Aspr = new Carta(1,"Pica","Rojo");
		Astr = new Carta(1,"Trebol","Rojo");
		Ascr = new Carta(1,"Corazones","Rojo");
		Sietetr = new Carta(1,"Trebol","Rojo");
		diezcn = new Carta(10,"Corazones","Negro");
	}

	@Test
	void testEsPoker() {
		assertEquals("Poker", status.verificar(new Carta(1,"Diamante","Rojo"),
				new Carta(1,"Corazones","Rojo"),
				new Carta(1,"Pica","Rojo"),
				new Carta(1,"Trebol","Rojo"),
				new Carta(7,"Diamante","Rojo")));
	}
	@Test
	void testEsTrio() {
		assertEquals("Trio",status.verificar(new Carta(1,"Diamante","Rojo"),
				new Carta(1,"Corazones","Rojo"),
				new Carta(1,"Pica","Rojo"),
				new Carta(9,"Trebol","Rojo"),
				new Carta(7,"Diamante","Rojo")));
	}
	@Test
	void testEsNada() {
		assertEquals("Nada",status.verificar(new Carta(9,"Diamante","Rojo"),
				new Carta(8,"Corazones","Negro"),
				new Carta(5,"Pica","Rojo"),
				new Carta(1,"Trebol","Rojo"),
				new Carta(7,"Diamante","Rojo")));
	}
	@Test
	void testEsColor() {
		assertEquals("Color",status.verificar(new Carta(1,"Diamante","Rojo"),
				new Carta(10,"Corazones","Rojo"),
				new Carta(12,"Pica","Rojo"),
				new Carta(13,"Trebol","Rojo"),
				new Carta(7,"Diamante","Rojo")));
	}
	@Test
	void testCartas() {
		assertEquals(Asdr.esMayor(Sietetr),false);
		assertEquals(Ascr.mismoPalo(diezcn),true);
	}
}
