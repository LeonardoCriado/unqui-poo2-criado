package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {
	
	
	protected PokerStatus validadorPoker; //SUT

	@BeforeEach
	void setUp() throws Exception {
		//SETUP
		validadorPoker = new PokerStatus();
	}

	@Test
	void testPokerTrueNumeros2Cifras() {
		//EXERCISE
		String resultado = validadorPoker.verificar("10D","10P","10C","10T","5D");
		//VERIFY
		assertEquals("Poquer",resultado);
	}
	
	@Test
	void testPokerTrueFiguras() {
		assertEquals("Poquer",validadorPoker.verificar("QD","QP","QC","10T","QT"));
	}
	
	@Test
	void testPokerTrueNumeros() {
		assertEquals("Poquer",validadorPoker.verificar("5D","5P","5C","10T","5T"));
	}
	
	@Test
	void testPokerFalseCon3ok() {
		assertNotEquals("Poquer",validadorPoker.verificar("5D","5P","5C","10T","10D"));
	}
	
	@Test
	void testPokerFalseCon2ok() {
		assertNotEquals("Poquer",validadorPoker.verificar("5D","5P","6C","10T","10D"));
	}
	
	@Test
	void testPokerFalseConTodasDistintas() {
		assertNotEquals("Poquer",validadorPoker.verificar("5D","7P","6C","9T","10D"));
	}

}
