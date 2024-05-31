package tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoTest {

	public Producto producto;
	public Producto producto2;
	public Caja caja;
	public Empresa cop;
	public Empresa tra;
	public Factura factura;
	@BeforeEach
	void setUp() throws Exception {
		caja = new Caja();
		cop = new Cooperativa();
		tra = new Tradicional();
		factura = new Factura(5,170,30);
		producto = new Producto(100, "Cooperativa" );
		producto2 = new Producto(100, "Tradicional" );
		//caja.reponerStock(producto, 1);
		//caja.reponerStock(producto2, 1);

		//caja.registrarProducto(producto);
		//caja.registrarProducto(producto2);

	}

	@Test
	void test() {
		caja.reponerStock(producto, 1);
		caja.reponerStock(producto2, 1);
		caja.registrarProducto(producto);
		caja.registrarProducto(producto2);
		float a = caja.cobrarCliente();
		assertEquals(Math.ceil(a),230);
		assertEquals(caja.getStock(), 0);
	}
	@Test
	void testConMasPrdouctos() {
		caja.reponerStock(producto, 5);
		caja.reponerStock(producto2, 5);
		caja.registrarProducto(producto);
		caja.registrarProducto(producto2);
		caja.registrarProducto(producto2);
		caja.registrarProducto(producto2);
		float a = caja.cobrarCliente();
		assertEquals(Math.ceil(a),472);
		assertEquals(caja.getStock(), 6);
	}

	@Test
	void testProductosYFacturas() {
		caja.reponerStock(producto, 1);
		caja.reponerStock(producto2, 1);
		caja.registrarPago(factura);
		caja.registrarProducto(producto);
		caja.registrarProducto(producto2);
		float a = caja.cobrarCliente();
		assertEquals(Math.ceil(a),1110);
	}
}

