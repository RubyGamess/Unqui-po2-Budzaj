package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	private Float precio;
	private Boolean preciosCuidados = false;
	public Float descuento;
	public String getNombre() {
		return nombre;
	}
	public Float getPrecio() {

		if (!this.preciosCuidados) {
			return precio;
			
		}else {
			return precio * this.descuento;
		}
		
	}
	public Boolean getPreciosCuidados() {
		return preciosCuidados;
	}
	public Producto(String nombre, Float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public Producto(String nombre, Float precio, Boolean preciosCuidados, Float descuento) {
		super();
		this.descuento = descuento;
		this.nombre = nombre;
		this.precio = precio;
		this.preciosCuidados = preciosCuidados;
	}
	
	
}
