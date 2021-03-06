package ar.edu.unq.po2.tp5;

public abstract class Factura implements Facturable {
	
	protected iAgencia agencia;
	
		
	public Factura(iAgencia agencia) {
		super();
		this.agencia = agencia;
	}
	
	
	protected abstract double montoAPagar();
	public void registrarseEnCaja(Caja caja) {
		caja.incrementarMontoTotalAPagar(this.montoAPagar());
		this.agencia.registrarPago(this);
	};
	
}
