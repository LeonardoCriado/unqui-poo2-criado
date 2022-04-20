package ar.edu.unq.po2.tp3;

import java.time.*;


public class Persona {

	private String nombre;
	private LocalDate fechaNacimiento;
	
	
	public Persona() {
		
	}
	
	public Persona(String nombre, LocalDate fechaNacimiento) {
		super();
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
	}
	
	protected String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	protected void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public int edad() {
		LocalDate fechaActual = LocalDate.now(); 
		Period edad = Period.between(this.getFechaNacimiento(),fechaActual);
		return edad.getYears();
	}
	
	public boolean menorQue(Persona persona) {
		return this.edad() < persona.edad();
	}
	
}

/*

Si un bjeto le pide la edad a Persona no conoce cómo se obtiene el valor. Esto se llama encapsulamiento.

*/
