package ar.edu.unq.po2.tp4;

public class Ingreso {
	protected String mesDePercepcion;
	protected String concepto;
	protected double montoPercibido;
	
	protected Ingreso() {
	}

	public Ingreso(String mesDePercepcion, String concepto, double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public double montoImponible() {
		return this.montoPercibido();
	}
	
	public double montoPercibido() {
		return this.montoPercibido;
	}
	
}
