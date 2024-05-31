package Semana6;

public class Carta {

	private int valor;
	private String palo;
	private String color;
	public String getColor() {
		return color;
	}
	public Carta(int valor, String palo,String color) {
		super();
		this.valor = valor;
		this.palo = palo;
		this.color = color;
	}
	public int getValor() {
		return valor;
	}
	public String getPalo() {
		return palo;
	}
	public Boolean esMayor(Carta carta) {
		return this.valor < carta.getValor();	
	}
	public Boolean mismoPalo(Carta carta) {
		return this.palo == carta.getPalo();
	}
}
