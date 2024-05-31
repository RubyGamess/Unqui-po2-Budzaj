package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Iterator;

public class EquipoDeTrabajo {

	private String nombre;
	private ArrayList<Persona2> integrantes = new ArrayList<Persona2>();
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Persona2> getIntegrantes() {
		return integrantes;
	}
	public EquipoDeTrabajo(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void addIntegrante(Persona2 persona){
		integrantes.add(persona);
	}
	
	public int promedioEdad() {
		int edad = 0;
		for (int i = 0; i < integrantes.size(); i++) {
			edad = edad + integrantes.get(i).getEdad();
		}
		return edad / integrantes.size();
	}

}
