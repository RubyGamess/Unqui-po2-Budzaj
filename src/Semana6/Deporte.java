package Semana6;

public enum Deporte {
	RUNNING(1),FUTBOL(2),BASKET(2),TENNIS(3),JABALINA(4);
	public int getComplejidad() {
		return complejidad;
	}
	int complejidad;
	private Deporte(int complejidad) {
		this.complejidad = complejidad;
	}
}
