package ar.edu.unq.po2.tp6;

public class Persona implements ICliente, ISolicitante {
	
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected int edad;
	protected ISalario salario;

	public Persona(String nombre, String apellido, String direccion, int edad, double salarioMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.salario = new Salario(salarioMensual);
	}

	@Override
	public double sueldoNetoAnual() {
		return salario.sueldoNetoAnual();
	}

	@Override
	public double getSueldoNetoMensual() {
		return salario.sueldoNetoMensual();
	}

	@Override
	public int getEdad() {
		return this.edad;
	}
	
	
}
