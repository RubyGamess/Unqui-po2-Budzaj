package ar.edu.unq.po2.tp3;

public class Persona2 {

	private String nombre;
	private String apellido;
	private Integer edad;
	public Persona2(String nombre, String apellido, Integer edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	
}
