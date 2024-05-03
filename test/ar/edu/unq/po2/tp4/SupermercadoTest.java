package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTest {
	private Supermercado superM;
	private Producto producto;
	private Producto producto2;
	private Producto producto3;
	private Producto producto4;
	@BeforeEach
	void setUp() throws Exception {
		superM = new Supermercado("El Japo","14,2399");
		producto = new Producto("Coca",(float) 1000,true,(float) 0.5);
		producto2 = new Producto("CocaPremium",(float) 5000);
		producto3= new Producto("Chacha",(float) 3000);
		producto4 = new Producto("Uno",(float) 1);
		
		superM.addProducto(producto);
		superM.addProducto(producto2);
		superM.addProducto(producto3);
		superM.addProducto(producto4);
	}

	@Test
	void testSumaTotal() {
		assertEquals(superM.totalSumaDePrecios(), 8501);
	}
	@Test
	void testProductoConDescuento() {
		assertEquals(superM.precioProducto(producto),500); 
	}
	@Test
	void testCantidadProductos() {
		assertEquals(superM.cantProductos(), 4);
	}

	
}
