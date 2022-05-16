package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {
	
	
	protected JuegoStatus validadorPoker; //SUT
	public Carta carta1;
	public Carta carta2;
	public Carta carta3;
	public Carta carta4;
	private Carta carta5;

	@BeforeEach
	void setUp() throws Exception {
		//SETUP
		validadorPoker = new JuegoStatus();
		carta1 = new Carta("10","P");
		carta2 = new Carta("10","C");
		carta3 = new Carta("J","P");
		carta4 = new Carta("Q","P");
		carta5 = new Carta("K","P");
	}

	@Test
	void testPokerTrueNumeros2Cifras() {
		carta3 = new Carta("10","T");
		carta4 = new Carta("10","D");
		//EXERCISE
		String resultado = validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5);
		//VERIFY
		assertEquals("Poquer",resultado);
	}
	
	@Test
	void testPokerTrueFiguras() {
		carta2 = new Carta("J","T");
		carta5 = new Carta("J","D");
		carta4 = new Carta("J","C");
		assertEquals("Poquer",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testPokerTrueNumeros() {
		carta2 = new Carta("9","T");
		carta3 = new Carta("9","D");
		carta4 = new Carta("9","C");
		carta5 = new Carta("9","P");
		assertEquals("Poquer",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testPokerFalseCon3ok() {
		carta3 = new Carta("10","D");
		assertNotEquals("Poquer",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testPokerFalseCon2ok() {
		assertNotEquals("Poquer",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testPokerFalseConTodasDistintas() {
		assertNotEquals("Poquer",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorOk() {
		carta2 = new Carta("2","P");
		assertEquals("Color",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testColorNotOk() {
		assertNotEquals("Color",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioOk() {
		carta3 = new Carta("10","T");
		assertEquals("Trio",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testTrioNotOk() {
		assertNotEquals("Trio",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testNadaOk() {
		assertEquals("Nada",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}
	
	@Test
	void testNadaNotOk() {
		carta3 = new Carta("10","T");
		assertNotEquals("Nada",validadorPoker.verificar(carta1,carta2,carta3,carta4,carta5));
	}

}
