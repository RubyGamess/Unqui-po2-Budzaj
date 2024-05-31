package Semana7;

public class LesionesDermatologicas {

	Color dolorDermatologico;
	
	public String descripcionDeColor(Color color) {
		return color.descripcion();
	}
	public int riesgoColor(Color color) {
		return color.riesgo();
	}
	public Color siguienteDe(Color color) {
		return color.siguiente(color);
	}
}
