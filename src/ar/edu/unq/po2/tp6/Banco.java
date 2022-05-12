package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	protected List<ICliente> clientes;
	protected List<ISolicitudDeCredito> solicitudes;
	

	
	public Banco() {
		super();
		this.clientes = new ArrayList<ICliente>();
		this.solicitudes = new ArrayList<ISolicitudDeCredito>();;
	}



	public void addCliente(ICliente cliente){
		this.clientes.add(cliente);
	}
	
	public void addSolicitudDeCreditoPersonal(ICliente cliente, double montoSolicitado, int plazoEnMeses){
		ISolicitudDeCredito nuevaSolicitudP = new SolicitudDeCreditoPersonal(cliente, montoSolicitado, plazoEnMeses);
		this.solicitudes.add(nuevaSolicitudP);
	}
	
	public void addSolicitudDeCreditoHipotecario(ICliente cliente, double montoSolicitado, int plazoEnMeses){
		ISolicitudDeCredito nuevaSolicitudH = new SolicitudDeCreditoHipotecario(cliente, montoSolicitado, plazoEnMeses);
		this.solicitudes.add(nuevaSolicitudH);
	}
	
	protected void evaluarSolicitudDeCredito(ISolicitudDeCredito solicitud) {
		if (solicitud.esAceptable()) {
			// TODO: entregar dinero al cliente
		}
	}
	
	

}
