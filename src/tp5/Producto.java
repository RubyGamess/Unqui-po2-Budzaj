package tp5;

public class Producto {

	
	private float precio;

	public String empresa;
	public Producto(float precio,String empresa) {
		super();
		this.precio = precio;
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public float getPrecio() {
		return precio;
	}
	
}
