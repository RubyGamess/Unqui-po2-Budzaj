package tp6;

public class Propiedad {

	private String descripcion;
	private String direccion;
	private int valorFiscal;
	public String getDescripcion() {
		return descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getValorFiscal() {
		return valorFiscal;
	}
	public Propiedad(String descripcion, String direccion, int valorFiscal) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}
	
}
