package ar.edu.unq.po2.tp6;

public class Propiedad implements IPropiedad {

	private String descripcion;
	private String direccion;
	private double valorFiscal;

	public Propiedad(String descripcion, String direccion, double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valorFiscal = valorFiscal;
	}

	@Override
	public double valorFiscal() {
		return this.valorFiscal;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public String getDireccion() {
		return direccion;
	}


}
