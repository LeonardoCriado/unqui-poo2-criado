package ar.edu.unq.po2.tp7;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class JugadaTestCase {
	//SUT
	public Jugada jugada1;
	
	//DOCs
	public JuegoStatus status1;		
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
	
	@Test
	void testColorLeGanaATrio() {
		//Test Double Configuration
		when(mano1.verificarJugada()).thenReturn("Color");
		when(mano2.verificarJugada()).thenReturn("Trio");
		jugada1.addMano(mano1);
		jugada1.addMano(mano2);
		
		//Exercise
		Mano manoResultado = jugada1.manoGanadora();
		
				
		//Verify
		assertEquals(mano1, manoResultado);
		verify(mano1, times(3)).verificarJugada();
		verify(mano2, times(2)).verificarJugada();

	}
	
	
	@Test
	void testPoquerLeGanaATrio() {
		//Test Double Configuration
		when(mano1.verificarJugada()).thenReturn("Poker");
		when(mano2.verificarJugada()).thenReturn("Trio");
		jugada1.addMano(mano1);
		jugada1.addMano(mano2);
		
		//Exercise
		Mano manoResultado = jugada1.manoGanadora();
		
				
		//Verify
		assertEquals(mano1, manoResultado);
		verify(mano1, times(3)).verificarJugada();
		verify(mano2, times(2)).verificarJugada();
	}
	
	
	
	@Test
	void testTrioNoLeGanaAPoker() {
		//Test Double Configuration
		when(mano1.verificarJugada()).thenReturn("Trio");
		when(mano2.verificarJugada()).thenReturn("Poker");
		jugada1.addMano(mano1);
		jugada1.addMano(mano2);
		
		//Exercise
		Mano manoResultado = jugada1.manoGanadora();
		
				
		//Verify
		assertEquals(mano2, manoResultado);
		verify(mano1, times(3)).verificarJugada();
		verify(mano2, times(2)).verificarJugada();
	}
	
	@Test
	void testTrioNoLeGanaAColor() {
		//Test Double Configuration
		when(mano1.verificarJugada()).thenReturn("Trio");
		when(mano2.verificarJugada()).thenReturn("Color");
		jugada1.addMano(mano1);
		jugada1.addMano(mano2);
		
		//Exercise
		Mano manoResultado = jugada1.manoGanadora();
		
				
		//Verify
		assertEquals(mano2, manoResultado);
		verify(mano1, times(4)).verificarJugada();
		verify(mano2, times(2)).verificarJugada();
	}
	
	@Test
	void testColorNoLeGanaAPoker() {
		//Test Double Configuration
		when(mano1.verificarJugada()).thenReturn("Color");
		when(mano2.verificarJugada()).thenReturn("Poker");
		jugada1.addMano(mano1);
		jugada1.addMano(mano2);
		
		//Exercise
		Mano manoResultado = jugada1.manoGanadora();
		
				
		//Verify
		assertEquals(mano2, manoResultado);
		verify(mano1, times(3)).verificarJugada();
		verify(mano2, times(2)).verificarJugada();
	}
	
	
	/*
	@Test
	void testPokerYGanaPorValorDeCartas() {
		mock();
	}
	*/
}
