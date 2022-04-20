package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	
	EquipoDeTrabajo equipo;
	
	@BeforeEach
	void setUp() throws Exception {
		equipo = new EquipoDeTrabajo("Tiburones");
		equipo.addPersona(new PersonaV2("Leonardo","Criado",LocalDate.of(1988, 9, 16))); 	//33
		equipo.addPersona(new PersonaV2("Tano","Pasman",LocalDate.of(1938, 9, 16)));  		//83
		equipo.addPersona(new PersonaV2("Bart","Simpson",LocalDate.of(1978, 9, 16)));		//43
		equipo.addPersona(new PersonaV2("Tanga","Langa",LocalDate.of(1998, 9, 16)));		//23
		equipo.addPersona(new PersonaV2("Aquiles","Brinco",LocalDate.of(2002, 9, 16)));		//20
	}

	@Test
	void testPromedioLista() {
		assertEquals(40, equipo.promedioEdadIntegrantes());
	}
	
	@Test
	void testPromedioConstante() {
		assertEquals(40, equipo.promedioEdadIntegrantesC());
	}

}
