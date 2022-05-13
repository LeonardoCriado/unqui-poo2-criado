package ar.edu.unq.po2.tp6;

public class Salario implements ISalario {
	
	private double salarioMensual;

	public Salario(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	@Override
	public double sueldoNetoAnual() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double sueldoNetoMensual() {
		return this.salarioMensual;
	}
	
	

}
