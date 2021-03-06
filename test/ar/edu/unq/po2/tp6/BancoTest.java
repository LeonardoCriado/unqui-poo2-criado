package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {
	protected Banco banco;
	protected ICliente persona;
	protected IPropiedad propiedadGarantia;
	protected ISolicitudDeCredito solCreditoPersonal;
	protected ISolicitudDeCredito solCreditoHipotecario;
	
	
	
	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco();
		persona = new Persona("Leonardo", "Criado","Venezuela 2183", 33, 90000d);
		propiedadGarantia = new Propiedad("Casa de familia","Venezuela 2183", 1500000d);
		solCreditoPersonal = new SolicitudDeCreditoPersonal((ISolicitante) persona, 30000, 12); 			//Est? ok esto?
		solCreditoHipotecario = new SolicitudDeCreditoHipotecario((ISolicitante) persona, 3000000, 60, propiedadGarantia);
	}

	@Test
	void testPrestamoPersonal() {
		banco.addCliente(persona);
		banco.addSolicitudDeCreditoPersonal(persona, 30000d, 12);
		banco.addSolicitudDeCreditoPersonal(persona, 70000d, 24);
		assertEquals(100000d, banco.montoTotalADesembolsar());
	}
	
	@Test
	void testPrestamoHipotecario() {
		banco.addCliente(persona);
		banco.addSolicitudDeCreditoHipotecario(persona, 300000d, 60, propiedadGarantia);
		assertEquals(300000d, banco.montoTotalADesembolsar());
	}
	
	@Test
	void testPrestamos() {
		banco.addCliente(persona);
		banco.addSolicitudDeCreditoHipotecario(persona, 300000d, 60, propiedadGarantia);
		banco.addSolicitudDeCreditoPersonal(persona, 70000d, 24);
		assertEquals(370000d, banco.montoTotalADesembolsar());
	}
	
	@Test	
	void testPersona() {
		assertEquals(90000d*12, persona.sueldoNetoAnual());
		assertEquals(90000d, persona.getSueldoNetoMensual());
	}

}
