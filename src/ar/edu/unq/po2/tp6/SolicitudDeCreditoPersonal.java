package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoPersonal extends SolicitudDeCredito {



	public SolicitudDeCreditoPersonal(ISolicitante solicitante, double montoSolicitado, int plazoEnMeses) {
		super(solicitante, montoSolicitado, plazoEnMeses);
	}

	@Override
	public boolean esAceptable() {
		/*Las solicitudes para los créditos personales requieren que el solicitante tenga ingresos anuales por al menos
		$15000, y que el monto de la cuota no supere el 70% de sus ingresos mensuales.*/
		return (solicitante.sueldoNetoAnual() >= 15000d) & 
				((this.montoCuota()/solicitante.getSueldoNetoMensual()) < 0.7)  ;
	}

	




}
