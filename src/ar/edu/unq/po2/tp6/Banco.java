package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
	
	public void addSolicitudDeCreditoHipotecario(ICliente cliente, double montoSolicitado, int plazoEnMeses, IPropiedad garantia){
		ISolicitudDeCredito nuevaSolicitudH = new SolicitudDeCreditoHipotecario(cliente, montoSolicitado, plazoEnMeses, garantia);
		this.solicitudes.add(nuevaSolicitudH);
	}
	
	
	public double montoTotalADesembolsar(){
		/*List<ISolicitudDeCredito> solicitudesAceptadas = solicitudes 									//Para validar
																.stream()
																.filter(soli -> soli.esAceptable())
																.collect(Collectors.toList());*/
		return solicitudes
					.stream()							  	//Filtrando solicitudes aceptables
					.filter(soli -> soli.esAceptable())
					.collect(Collectors.toList())
						.stream()							//Sumando monto solicitado
						.mapToDouble(ISolicitudDeCredito::getMontoSolicitado)
						.sum();								
	}
	
	

}
