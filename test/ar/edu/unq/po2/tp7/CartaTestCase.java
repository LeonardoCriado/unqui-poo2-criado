package ar.edu.unq.po2.tp7;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartaTestCase {

	public Carta carta1;
	public Carta carta2;
	public Carta carta3;
	public Carta carta4;
	//private Carta carta5;
	
	@BeforeEach
	void setUp() throws Exception {
		carta1 = new Carta("10","P");
		carta2 = new Carta("1","C");
		carta3 = new Carta("J","P");
		carta4 = new Carta("Q","P");
		//carta5 = new Carta("K","P");
	}

	@Test
	void testPalo() {
		assertEquals("P", carta1.getPalo());
		assertEquals("C", carta2.getPalo());
		assertEquals("P", carta3.getPalo());
	}
	
	@Test
	void testValor() {
		assertEquals("10", carta1.getValor());
		assertEquals("1", carta2.getValor());
		assertEquals("J", carta3.getValor());
	}
	
	@Test
	void testValorSuperior() {
		assertEquals(true, carta1.esSuperior(carta2));
		assertEquals(false, carta2.esSuperior(carta3));
		assertEquals(false, carta3.esSuperior(carta4));
	}
	
	@Test
	void testMismoPalo() {
		assertEquals(false, carta1.mismoPalo(carta2));
		assertEquals(false, carta2.mismoPalo(carta3));
		assertEquals(true, carta3.mismoPalo(carta4));
	}

}
