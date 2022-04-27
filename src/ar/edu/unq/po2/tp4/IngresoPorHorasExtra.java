package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtra extends Ingreso {

	public IngresoPorHorasExtra(String mesDePercepcion, String concepto, double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	

	public double montoImponible() {
		return 0;
	}
	

}
