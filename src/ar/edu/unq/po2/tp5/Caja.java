package ar.edu.unq.po2.tp5;

public class Caja {
	protected double montoTotalAPagar;

	public double getMontoTotalAPagar() {
		return montoTotalAPagar;
	}

	protected void setMontoTotalAPagar(double montoTotalAPagar) {
		this.montoTotalAPagar = montoTotalAPagar;
	}
	
	
	public void incrementarMontoTotalAPagar(double monto) { //ver si es publico o privado
		this.setMontoTotalAPagar(getMontoTotalAPagar() + monto);
	}
	
	public void registrarProducto(Facturable producto) throws Exception {
		producto.registrarseEnCaja(this);
	}
}
