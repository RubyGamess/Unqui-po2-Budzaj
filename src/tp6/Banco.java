package tp6;

import java.util.ArrayList;
//Link top UML: https://drive.google.com/file/d/1v2z1Wo-9At2TiRPaqE-rfESHYCxnnNl3/view?usp=sharing
public class Banco implements SistemaInformatico{

	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	@Override
	public void agregarCliente(Cliente cliente) {
		
		this.clientes.add(cliente);
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

	@Override
	public int desembolsoTotal() {
		int desembolso = 0;
		for (int i = 0; i < clientes.size(); i++) {
			Cliente c = clientes.get(i);
			if (c.informe) desembolso = desembolso + c.montoARecibir;
		}
		return desembolso;
	}

	private void otorgarCredito(Cliente c, int plata) {
		//Darle la plata al cliente.
		c.montoARecibir = plata;
		c.informe = true;

	}
}
