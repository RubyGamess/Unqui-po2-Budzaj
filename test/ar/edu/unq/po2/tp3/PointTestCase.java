package ar.edu.unq.po2.tp3;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {

	private Point point;
	private Point pointB;
	private Rectangulo rectangulo;
	private Rectangulo rectangulo2;
	private Cuadrado cuadrado;
	@BeforeEach
	void setUp() throws Exception {
		point = new Point(8,8);
		pointB = new Point(10,10);
		rectangulo = new Rectangulo(8, 5);
		rectangulo2 = new Rectangulo(5,9);
		cuadrado = new Cuadrado(8);
		}

	@Test
	void lugarTest() {
		
	
		assertEquals(point.getX(), 8);
		assertEquals(point.getY(), 8);
	}

	@Test
	void sumarPuntosTest() {
		
		point.sumarPuntos(pointB);
		assertEquals(point.getX(),18);
		assertEquals(point.getY(), 18);
	}
	
	@Test
	void moverPuntoTest() {
		
		point.moverPunto(18, 8);
		assertEquals(point.getX(), 18);
		assertEquals(point.getY(), 8);
	}

	@Test
	void testRectanguloHorizontal() {
		 assertEquals(rectangulo.esHorizontal(),true);
	}
	@Test
	void testRectangulo() {
		 assertEquals(rectangulo2.esVertical(),true);
	}
	
	@Test
	void testRectanguloArea() {
		 assertEquals(rectangulo.getArea(), 40);
	}
	
	@Test
	void testRectanguloPerimetro() {
		 assertEquals(rectangulo.getPerimetro(), 26);
	}
	@Test
	void testCuadradoTamañoYArea() {
		assertEquals(cuadrado.tamaño(),8);
		assertEquals(cuadrado.getArea(),64);
	}
}
