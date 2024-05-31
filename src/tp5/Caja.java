package tp5;

import java.util.ArrayList;

public class Caja implements Agencia {

	private Float iva = (float) 1.21;
	private ArrayList<Producto> stock = new ArrayList<Producto>(); 
	private ArrayList<Producto> clienteProductos = new ArrayList<Producto>();
	
	private Empresa cooperativa = new Cooperativa();
	private Empresa tradicional = new Tradicional();
	public void registrarProducto(Producto producto) {
		//agrega producto a lista de cliente
		clienteProductos.add(producto);
	}
	
	public float cobrarCliente() {
		//Retorna precio total
		float total = 0;
		for (int i = 0; i < clienteProductos.size(); i++) {
			//total = total + clienteProductos.get(i).getPrecio();
		//	stock.remove(1);
			Producto p = clienteProductos.get(i);
			if (p.getEmpresa()== "Cooperativa") {
				//total = total + ((float) (p.getPrecio() * 0.9)) * iva;
				total = total + ( cooperativa.precio(p)* iva);
			}else if(p.getEmpresa()=="Tradicional") {
				total = total + (tradicional.precio(p) * iva);
			}else if (p.getEmpresa() == "Agencia") {
				total = total + p.getPrecio();
			}
			stock.remove(p);
		}
		return total;
	}
	
	public void reponerStock(Producto producto,int cant){
		//añade procuctos a el stock
		while(cant > 0) {
			Producto p = producto;
			stock.add(p);		
			cant--;
		}
	}
	public int getStock() {
		return stock.size();
	}
	public Caja() {
		super();
	}

	@Override
	public void registrarPago(Factura factura) {
		// TODO Auto-generated method stub
		Producto p = new Producto(factura.montoTotal(),"Agencia"); 
		clienteProductos.add(p);
	}
	
}
