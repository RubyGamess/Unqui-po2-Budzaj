package Semana7;

import java.util.Arrays;
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

	public static List<ActividadSemanal> todaslasDeFutbol(List<ActividadSemanal> dias){

		return dias.stream().filter(a -> a.getDeporte()== Deporte.FUTBOL).toList();
	 }

	public static List<ActividadSemanal> porComplejidad(List<ActividadSemanal> actvs, int i) {
		// TODO Auto-generated method stub
		return actvs.stream().filter(a -> a.getDeporte().complejidad == i).toList();
	}
}
