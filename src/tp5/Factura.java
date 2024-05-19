package tp5;

public class Factura {

	private int unidadConsumida;
	private int unidadesConsumidas;
	public int tasaImpuesto;
	public Factura(int unidadConsumida, int unidadesConsumidas, int tasaImpuesto) {
		super();
		this.unidadConsumida = unidadConsumida;
		this.unidadesConsumidas = unidadesConsumidas;
		this.tasaImpuesto = tasaImpuesto;
	}
	private int valorConsumido() {
		return unidadConsumida * unidadesConsumidas;
	}
	public int montoTotal() {
		return valorConsumido() + tasaImpuesto; 
	}
}
