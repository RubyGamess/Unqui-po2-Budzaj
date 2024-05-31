package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
public class Supermercado {

	public String nombre;
	public String direccion;
	public Float descuento= (float) 0.9;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	

	public void addProducto(Producto p) {
		productos.add(p);
	}
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public float precioProducto(Producto p) {
		//Descuetno delegado al producto, ya no se encarga el supermercado
		return p.getPrecio();
	}
	
//	private float precioConDescuento(Producto p) {
	//	return p.getPrecio() * this.descuento;
	//}
	public Integer cantProductos(){
		return productos.size();
	}
	
	public float totalSumaDePrecios() {
		float sumaTotal = 0;
		for (int p = 0; p < productos.size(); p++) {
			sumaTotal = sumaTotal + productos.get(p).getPrecio();
			
		}
		return sumaTotal;
	}
}
