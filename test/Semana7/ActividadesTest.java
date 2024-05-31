package Semana7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ActividadesTest {

	public ActividadSemanal actividadSemanal1;
	public ActividadSemanal actividadSemanal2;
	public ActividadSemanal actividadSemanal3;
	public DiaDeLaSemana lunes = DiaDeLaSemana.LUNES;
	public DiaDeLaSemana martes = DiaDeLaSemana.MARTES;
	public DiaDeLaSemana miercoles = DiaDeLaSemana.MIERCOLES;
	public DiaDeLaSemana jueves = DiaDeLaSemana.JUEVES;
	public DiaDeLaSemana viernes = DiaDeLaSemana.VIERNES;
	public DiaDeLaSemana sabado = DiaDeLaSemana.SABADO;
	public DiaDeLaSemana domingo = DiaDeLaSemana.DOMINGO;
	public Deporte fulbo = Deporte.FUTBOL;
	public Deporte basket = Deporte.BASKET;
	public Deporte tennis = Deporte.TENNIS;
	public List<ActividadSemanal> listActividadesSem; 
	//public List<ActividadSemanal> listActividadesSem =  Arrays.asList(new ActividadSemanal(lunes, 3, 2, fulbo),new ActividadSemanal(lunes, 3, 2, basket),new ActividadSemanal(lunes, 3, 2, tennis));

	@BeforeEach
	void setUp() throws Exception {
		actividadSemanal1 = new ActividadSemanal(lunes, 3, 2, fulbo);
		actividadSemanal2 = new ActividadSemanal(jueves, 6, 5, basket);
		actividadSemanal3 = new ActividadSemanal(viernes, 9, 2, tennis);
		listActividadesSem =  Arrays.asList(actividadSemanal1,actividadSemanal2,actividadSemanal3);
	}

	@Test
	void testFiltroFutbol() {
		List<ActividadSemanal> filtrada = ActividadSemanal.todaslasDeFutbol(listActividadesSem);
		assertEquals(1, filtrada.size());
	}
	@Test
	void testFlitroPorComplejidad() {
		List<ActividadSemanal> filtrado = ActividadSemanal.porComplejidad(listActividadesSem, 3);
		assertEquals(1, filtrado.size());

	}
	@Test
	void testTotalHoras() {
		int filtrada = ActividadSemanal.cantHoras(listActividadesSem);
		assertEquals(9,filtrada);
	}
	@Test
	void testMenorCosto() {
		ActividadSemanal s = ActividadSemanal.menorCosto(listActividadesSem);
		assertEquals(s,actividadSemanal1);
	}
	@Test
	void testMenorCostoParaCadaDeporte() {
		//Map<Deporte, ActividadSemanal> s = ActividadSemanal.laEconomicaDeCadaActividad(listActividadesSem);
		Map<Deporte, ActividadSemanal> s = ActividadSemanal.laMasEconomicaDeCadaActividad(listActividadesSem);

		assertEquals(true,s.containsValue(actividadSemanal1));
		assertEquals(actividadSemanal1,s.get(fulbo));
		
	}
	@Test
	void testTodasLasDelMuni() {
		Municipio m = new Municipio();
		m.createListFromList(listActividadesSem);
		m.imprimirTodos(listActividadesSem);
	}
}
