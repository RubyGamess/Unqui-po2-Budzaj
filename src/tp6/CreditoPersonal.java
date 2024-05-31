package tp6;

public class CreditoPersonal implements Credito {

	private int montoMensual(int monto, int plazoMeses) {
		return monto / plazoMeses;
	}
	
	@Override
	public Boolean evaluarCredito(Cliente cliente, int monto, int plazoMeses) {
		 //credito hipotecario
		Boolean	evaluacion = (cliente.netoAnual()  >=  15000 && montoMensual(monto, plazoMeses) < (cliente.getNetoMensual() * 70) / 100)  ;
		return evaluacion;
	}

}
