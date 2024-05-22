package Semana7;

public enum Color {

	ROJO("es color Rojo",1),GRIS("Es el color gris", 2), AMARILLO("es el color amarillo",3),MIEL("PELIGROSO",4);
	public String descripcion;
	public int riesgo;
	private Color(String descripcion, int riesgo) {
		this.descripcion = descripcion;
		this.riesgo = riesgo;
	}
	public String descripcion() {
		return descripcion;
	}
	public int riesgo() {
		return riesgo;
	}	
	

	public Color siguiente(Color c) {
		Color toReturn = null;
		switch (c) {
		case ROJO: {
			toReturn = GRIS;
			break;
		}
	
		case GRIS: {
			toReturn = AMARILLO;
			break;
		}
		case AMARILLO: {
			toReturn = MIEL;
			break;
		}
		case MIEL: {
			toReturn = ROJO;
			break;
		}
		}
		return toReturn;
	}
 }