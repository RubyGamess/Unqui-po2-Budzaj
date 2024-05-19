package tp5;


public class Cooperativa implements Empresa {

	public Cooperativa() {
		super();
	}


	private float descuento = (float) 0.9;

	@Override
	public  float precio(Producto p) {
		// TODO Auto-generated method stub
		return p.getPrecio() * descuento;
	}
	
	
}
