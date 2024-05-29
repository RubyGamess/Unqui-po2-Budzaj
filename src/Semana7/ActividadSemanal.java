package Semana7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ActividadSemanal {

	
	public DiaDeLaSemana dia;
	public int horaDeInicio;
	public int duracion;
	public Deporte  deporte;
	//		List<ActividadSemanal> listActividadesSem =  Arrays.asList();

	public ActividadSemanal(DiaDeLaSemana dia, int horaInicio, int duracion, Deporte deporte) {
        this.dia = dia;
        this.horaDeInicio = horaInicio;
        this.duracion = duracion;
        this.deporte = deporte;
    }
	
	public DiaDeLaSemana getDia() {
		return dia;
	}

	public int getHoraDeInicio() {
		return horaDeInicio;
	}

	public int getDuracion() {
		return duracion;
	}

	public Deporte getDeporte() {
		return deporte;
	}
	public int calcularCosto() {
		int costoPorHora = (dia == DiaDeLaSemana.LUNES || dia == DiaDeLaSemana.MARTES || dia == DiaDeLaSemana.MIERCOLES) ? 500 : 1000;
		int costoBase = this.getDuracion() * costoPorHora;
		int costoPorComplejidad = this.deporte.getComplejidad();
		return costoBase + costoPorComplejidad;
	}
	public static ActividadSemanal menorCosto(List<ActividadSemanal> acts) {
		return acts.stream().min((a, b) -> Integer.compare(a.calcularCosto(), b.calcularCosto())).orElse(null);
	}

	private  int getCosto() {
		DiaDeLaSemana diaB =  this.dia;
		int costo = 0;
		if (diaB == dia.LUNES ||diaB ==  dia.MARTES ||diaB ==  dia.MIERCOLES) {
			costo = 
		}
	}
	
	public static List<ActividadSemanal> todaslasDeFutbol(List<ActividadSemanal> dias){

		return dias.stream().filter(a -> a.getDeporte()== Deporte.FUTBOL).toList();
	 }

	public static List<ActividadSemanal> porComplejidad(List<ActividadSemanal> actvs, int i) {
		// TODO Auto-generated method stub
		return actvs.stream().filter(a -> a.getDeporte().complejidad == i).toList();
	}

	public static int cantHoras(List<ActividadSemanal> listActividadesSem) {
		// TODO Auto-generated method stub
		return listActividadesSem.stream().mapToInt(a -> a.getDuracion()).sum();
	}
}
