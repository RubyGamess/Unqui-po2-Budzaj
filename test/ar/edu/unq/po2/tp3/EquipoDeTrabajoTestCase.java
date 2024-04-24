package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {

	private Persona2 persona;
	private Persona2 persona2;
	private Persona2 persona3;
	private Persona2 persona4;
	private Persona2 persona5;
	private EquipoDeTrabajo equipo;
	
	@BeforeEach
	void setUp() throws Exception {
		persona = new Persona2("Tomas","Villavicencio",21);
		persona2 = new Persona2("Jose","Nover",25);
		persona3 = new Persona2("Javier","Apellido",18);
		persona4 = new Persona2("Josh","Garrapata",21);
		persona5 = new Persona2("Samanta","Blem",27);
		
		equipo = new EquipoDeTrabajo("GigaTeam");
		equipo.addIntegrante(persona);
		equipo.addIntegrante(persona2);
		equipo.addIntegrante(persona3);
		equipo.addIntegrante(persona4);
		equipo.addIntegrante(persona5);

	}

	@Test
	void promedioEquipoTest() {
		assertEquals(equipo.promedioEdad(),22);
		System.out.println("El promedio es: " + equipo.promedioEdad());
	}

}
