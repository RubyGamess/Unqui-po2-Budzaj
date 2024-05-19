package tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp6.Cliente;

class tp6Test {

	public Banco banco;
	public Cliente cliente1;
	public Propiedad casaDeJuan;
	public Cliente cliente2;
	public Propiedad casaDeElPrimoDeJuan;
	public CreditoPersonal creditoPersonal;
	public CreditoHipotecario creditoHipotecario;

	@BeforeEach
	void setUp() throws Exception {
		 creditoPersonal = new CreditoPersonal();
		 creditoHipotecario = new CreditoHipotecario();
		banco = new Banco();
		casaDeJuan = new Propiedad("Es la casa de Juan", "12", 2000000);
		cliente1 = new Cliente("Juan","Carlos","12",56,200000,casaDeJuan);
		casaDeElPrimoDeJuan = new Propiedad("Es la casa de el Primo de Juan", "17", 1500000);
		cliente2 = new Cliente("Primo","DeJuan","17",30,150000,casaDeElPrimoDeJuan);
		
	}

	@Test
	void testJuanPidePrestamoPersonal() {
		cliente1.creditoASolicitar(creditoPersonal);
		banco.agregarCliente(cliente1);
		cliente1.solicitarCredito(banco, 500000, 16);
		assertTrue(cliente1.getInforme());
		
	}
 
	@Test
	void testPrimoDeJuanPidePrestamoPersonalYFalla() {
		cliente2.creditoASolicitar( creditoPersonal);
		banco.agregarCliente(cliente2);
		cliente2.solicitarCredito(banco, 80000000, 3);
		assertFalse(cliente2.getInforme());
		
	}

	@Test
	void testJuanPideCreditoHipotecario() {
		cliente1.creditoASolicitar(creditoHipotecario);
		banco.agregarCliente(cliente1);
		cliente1.solicitarCredito(banco, 200000, 26);
		assertTrue(cliente1.getInforme());
		
	}
	@Test
	void testJuanPideCreditoHipotecarioYFalla() {
		cliente1.creditoASolicitar(creditoHipotecario);
		banco.agregarCliente(cliente1);
		cliente1.solicitarCredito(banco, 2000000, 26);
		assertFalse(cliente1.getInforme());
		
	}
}
