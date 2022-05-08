package ar.edu.unq.po2.tp5;

public class FacturaImpuesto extends Factura {

	private double tasaServicio;



	public FacturaImpuesto(iAgencia agencia, double tasaServicio) {
		super(agencia);
		this.tasaServicio = tasaServicio;
	}



	@Override
	protected double montoAPagar() {
		return tasaServicio;
	}

}
