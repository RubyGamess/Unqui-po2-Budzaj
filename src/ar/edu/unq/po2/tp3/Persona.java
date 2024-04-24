package ar.edu.unq.po2.tp3;

import java.sql.Date;

public class Persona {

	private String nombre;
	private Date fechaDeNacimiento;
	private Integer edad;
	public Persona(String nombre, Date fechaDeNacimiento, Integer edad) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.edad = edad;
	}
	public Persona(String nombre, Date fechaNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaNacimiento;
	}
	public Integer getEdad() {
		return edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public boolean menorQue(Persona persona1) {
		return persona1.getEdad() > this.getEdad();
	}
	
	
}

