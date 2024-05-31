package Semana7;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
	private List<ActividadSemanal> actividades = new ArrayList<ActividadSemanal>();

	public void createListFromList(List<ActividadSemanal> actividades) {
		this.actividades = actividades;
	}
	public List<ActividadSemanal> getActividades(){
		return actividades;
	}
	
	public void imprimirTodos(List<ActividadSemanal> actividades) {
		
		actividades.stream().forEach(s -> System.out.println(s.toString()));
	}
}
