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
		boolean resultado = validadorPoker.verificar("10D","10P","10C","10T","5D");
		//VERIFY
		assertEquals(true,resultado);
	}
	
	@Test
	void testPokerTrueFiguras() {
		assertEquals(true,validadorPoker.verificar("AD","AP","AC","10T","AT"));
	}
	
	@Test
	void testPokerTrueNumeros() {
		assertEquals(true,validadorPoker.verificar("5D","5P","5C","10T","5T"));
	}
	
	@Test
	void testPokerFalseCon3ok() {
		assertEquals(false,validadorPoker.verificar("5D","5P","5C","10T","10D"));
	}
	
	@Test
	void testPokerFalseCon2ok() {
		assertEquals(false,validadorPoker.verificar("5D","5P","6C","10T","10D"));
	}
	
	@Test
	void testPokerFalseConTodasDistintas() {
		assertEquals(false,validadorPoker.verificar("5D","7P","6C","9T","10D"));
	}

}
