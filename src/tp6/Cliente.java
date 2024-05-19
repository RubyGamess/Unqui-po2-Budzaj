package tp6;

public class Cliente {

	
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private int netoMensual;
	private Credito credito;
	private Propiedad propiedad;
	public Boolean informe;
	public int montoARecibir = 0;
	public Boolean getInforme() {
		return informe;
	}
	public int netoAnual() {
		return netoMensual * 12;
	}
	public Cliente(String nombre, String apellido, String direccion, int edad, int netoMensual, Propiedad propiedad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.netoMensual = netoMensual;
		this.propiedad = propiedad;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getEdad() {
		return edad;
	}
	public int getNetoMensual() {
		return netoMensual;
	}
	public void creditoASolicitar(Credito c) {
		this.credito = c;
	}
	public Credito getCredito() {
		return credito;
	}
	public int getValorFiscalDePopiedad() {
		return propiedad.getValorFiscal();
	}
	public void solicitarCredito(Banco banco, int sumaDinero,int plazoMeses) {
		 banco.recibirSolicitud(this ,sumaDinero, plazoMeses);
	}
}
