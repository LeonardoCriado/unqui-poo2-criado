package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;



class JugadaTestCase {
	//SUT
	public Jugada jugada1;
	
	//DOCs
	@Mock public JuegoStatus status1;		
	public Mano mano1;
	public Mano mano2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		//SETUP
		jugada1 = new Jugada();
		mano1 = mock(Mano.class);
		mano2 = mock(Mano.class);
		
	}

	@Test
	void testPoquerLeGanaAColor() {
		//Test Double Configuration
		when(mano1.verificarJugada()).thenReturn("Poker");
		when(mano2.verificarJugada()).thenReturn("Color");
		jugada1.addMano(mano1);
		jugada1.addMano(mano2);
		
		//Exercise
		Mano manoResultado = jugada1.manoGanadora();
		
				
		//Verify
		assertEquals(mano1, manoResultado);
		verify(mano1, times(4)).verificarJugada();
		verify(mano2, times(2)).verificarJugada();

	}
	 /*
	@Test
	void testColorLeGanaATrio() {
		mock();
	}
	
	@Test
	void testPoquerLeGanaATrio() {
		mock();
	}
	
	@Test
	void testTrioNoLeGanaAPoker() {
		mock();
	}
	
	@Test
	void testTrioNoLeGanaAColor() {
		mock();
	}
	
	@Test
	void testColorNoLeGanaAPoker() {
		mock();
	}
	
	@Test
	void testPokerYGanaPorValorDeCartas() {
		mock();
	}
	*/
}
