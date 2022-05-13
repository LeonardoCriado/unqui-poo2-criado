package ar.edu.unq.po2.tp6;

public class Salario implements ISalario {
	
	private double salarioMensual;

	public Salario(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	@Override
	public double sueldoNetoAnual() {
		return this.sueldoNetoMensual()*12;
	}

	@Override
	public double sueldoNetoMensual() {
		return this.salarioMensual;
	}
	
	

}
