package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {

	private ICliente cliente;
	private double montoSolicitado;
	private int plazoEnMeses;

	public SolicitudDeCreditoPersonal(ICliente cliente, double montoSolicitado, int plazoEnMeses) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}

	@Override
	public boolean esAceptable() {
		/*Las solicitudes para los créditos personales requieren que el solicitante tenga ingresos anuales por al menos
		$15000, y que el monto de la cuota no supere el 70% de sus ingresos mensuales.*/
		return (cliente.sueldoNetoAnual() >= 15000d) & ((this.montoCuota()/cliente.getSueldoNetoMensual()) < 0.7)  ;
	}

	private double montoCuota() {
		return montoSolicitado/plazoEnMeses;
	}



}
