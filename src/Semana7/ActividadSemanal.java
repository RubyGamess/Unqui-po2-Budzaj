package Semana7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

	//public static Map<Deporte, ActividadSemanal> laEconomicaDeCadaActividad(List<ActividadSemanal> listActividadesSem) {
	//return	listActividadesSem.stream().collect(Collectors.groupingBy(ActividadSemanal :: getDeporte,
	//																	Collectors.minBy((a, b) -> 	Integer.compare(a.calcularCosto(), b.calcularCosto())))).entrySet().stream().
	//		filter(a -> a.getValue().isPresent()).collect(Collectors.toMap(Map.Entry :: getKey, a -> a.getValue().get()));
	//	
	//}
public static Map<Deporte, ActividadSemanal> laMasEconomicaDeCadaActividad(List<ActividadSemanal> actividades){
		
		return actividades.stream().collect(Collectors.groupingBy(ActividadSemanal::getDeporte,Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingInt(ActividadSemanal::calcularCosto)),
                Optional::get)));
	}

	@Override
	public String toString() {
		return "Deporte: " + deporte + ". Dia"+ dia + " a las: "+ horaDeInicio + " hora(s).";
 	}
	

}
