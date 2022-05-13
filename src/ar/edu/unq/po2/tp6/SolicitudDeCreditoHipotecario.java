package ar.edu.unq.po2.tp6;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {
	
	protected IPropiedad garantia;

	public SolicitudDeCreditoHipotecario(ISolicitante solicitante, double montoSolicitado, int plazoEnMeses, IPropiedad garantia) {
		super(solicitante, montoSolicitado, plazoEnMeses);
		this.garantia = garantia;
	}

	@Override
	public boolean esAceptable() {
		// TODO Auto-generated method stub
		return ((this.montoCuota()/solicitante.getSueldoNetoMensual()) < 0.5) &
				(this.montoSolicitado/garantia.valorFiscal() < 0.7) &
				((this.solicitante.getEdad()+this.plazoEnMeses/12) < 65);
	}



}
