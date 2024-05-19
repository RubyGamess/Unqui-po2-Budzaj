package tp5;

public class Tradicional  implements Empresa{

	public Tradicional() {
		super();
	}

	@Override
	public  float precio(Producto p) {
		return p.getPrecio() ;
	}
	
}
