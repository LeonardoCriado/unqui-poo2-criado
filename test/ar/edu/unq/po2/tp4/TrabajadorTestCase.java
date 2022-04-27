package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	
	Ingreso primerIngreso;
	IngresoPorHorasExtra segundoIngreso;
	Ingreso tercerIngreso;
	Trabajador leo;

	@BeforeEach
	void setUp() throws Exception {
		leo = new Trabajador();
		primerIngreso = new Ingreso("Enero", "Sueldo", 50000d);
		segundoIngreso = new IngresoPorHorasExtra("Enero", "Adicional Semana Santa", 15000d);
		tercerIngreso = new Ingreso("Febrero", "Sueldo", 50000d);
	}

	@Test
	void testTotalPercibido() {
		assertThat(115000d,leo.getTotalPercibido());	
	}
	
	@Test
	void testMontoImponible() {
		assertThat(100000d,leo.getMontoImponible());	
	}
	
	@Test
	void testImpuestoAPagar() {
		assertThat(2000d,leo.getImpuestoAPagar());	
	}

}
