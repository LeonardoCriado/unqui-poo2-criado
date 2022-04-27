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
		leo.addIngreso(primerIngreso);
		leo.addIngreso(segundoIngreso);
		leo.addIngreso(tercerIngreso);
	}

	@Test
	void testTotalPercibido() {
		assertEquals(115000d,leo.getTotalPercibido());	
	}
	
	@Test
	void testMontoImponible() {
		assertEquals(100000d,leo.getMontoImponible());	
	}
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(2000d,leo.getImpuestoAPagar());	
	}

}
