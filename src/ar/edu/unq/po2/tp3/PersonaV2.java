package ar.edu.unq.po2.tp3;

import java.time.*;

public class PersonaV2 extends Persona {
	private String apellido;
	
	

	public PersonaV2(String nombre, String apellido, LocalDate fechaNacimiento) {
		super();
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setFechaNacimiento(fechaNacimiento);
	}

	protected String getApellido() {
		return apellido;
	}

	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
