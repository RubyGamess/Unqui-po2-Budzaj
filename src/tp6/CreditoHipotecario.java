package tp6;

public class CreditoHipotecario implements Credito{

	private int montoMensual(int monto, int plazoMeses) {
		return monto / plazoMeses;
	}
	@Override													//cambiar pro casa
	public Boolean evaluarCredito(Cliente cliente, int monto, int plazoMeses) {
		 //credito hipotecario
		Boolean	evaluacion = (cliente.getNetoMensual() / 2 > montoMensual(monto, plazoMeses)
				&& monto < ((cliente.getValorFiscalDePopiedad() * 70) / 100)
				&& cliente.getEdad() < 65) ;
		return evaluacion;
	}
	
}
