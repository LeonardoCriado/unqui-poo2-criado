package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito implements ISolicitudDeCredito {
	
	protected ISolicitante solicitante;
	protected double montoSolicitado;
	protected int plazoEnMeses;
	
	
	public SolicitudDeCredito(ISolicitante cliente, double montoSolicitado, int plazoEnMeses) {
		this.solicitante = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public double getMontoSolicitado() {
		return montoSolicitado;
	}
	
	protected double montoCuota() {
		return this.montoSolicitado/this.plazoEnMeses;
	}

}
