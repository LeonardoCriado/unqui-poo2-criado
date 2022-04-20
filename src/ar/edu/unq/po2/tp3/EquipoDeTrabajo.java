package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombre;
	private List<Persona> integrantes;
	private int sumaEdades;
	
	
	public EquipoDeTrabajo(String nombre) {
		super();
		setNombre(nombre);
		setIntegrantes(new ArrayList<Persona>());
	}


	protected void setIntegrantes(List<Persona> integrantes) {
		this.integrantes = integrantes;
	}


	public String nombre() {
		return nombre;
	}
	
	
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	protected List<Persona> getIntegrantes() {
		return integrantes;
	}
	
	
	public void addPersona(Persona persona) {
		this.getIntegrantes().add(persona);
		this.sumaEdades += persona.edad();
	}
	
	public int promedioEdadIntegrantes() {
		int sumaEdades = 0;
		for (Persona persona : this.getIntegrantes()) {
			sumaEdades += persona.edad();
		}
		return sumaEdades/this.getIntegrantes().size();
	}
	
	public int promedioEdadIntegrantesC() {
		return sumaEdades/this.getIntegrantes().size();
	}
	
}
