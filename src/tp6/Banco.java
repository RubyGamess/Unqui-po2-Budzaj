package tp6;

import java.util.ArrayList;
//Link top UML: https://drive.google.com/file/d/1v2z1Wo-9At2TiRPaqE-rfESHYCxnnNl3/view?usp=sharing
public class Banco {

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void recibirSolicitud(Cliente cliente, int sumaDinero,int plazoMeses) {
	
		if (clientes.contains(cliente)) {
			Credito c = cliente.getCredito();
			Boolean evaluacion = c.evaluarCredito(cliente, sumaDinero, plazoMeses);

			if(evaluacion) {
				this.otorgarCredito( cliente,  sumaDinero);
			}else {
				this.rechazarCredito(cliente, sumaDinero);
			}
		}else this.rechazarCredito(cliente, sumaDinero);

	}
	private void rechazarCredito(Cliente cliente, int sumaDinero) {
		//Informar rechazo al cliente
		cliente.informe = false;
	} 

	//hacerlo en interfaz
	//private Boolean evaluarSolicitud(Cliente cliente, int sumaDinero) {
		// credito hipotecario
	//Boolean	evauacion = (cliente.getNetoMensual() / 2 <   sumaDinero) && cliente.getEdad() < 65 && ;
	//}

	private void otorgarCredito(Cliente c, int plata) {
		//Darle la plata al cliente.
		c.informe = true;

	}
}
