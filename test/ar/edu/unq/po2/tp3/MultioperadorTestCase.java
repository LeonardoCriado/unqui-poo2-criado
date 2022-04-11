package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MultioperadorTestCase {
	
    Multioperador multi = new Multioperador();
    List<Integer> listaEnteros;
    
    @BeforeEach
    public void setUp() {
    	listaEnteros = new ArrayList<Integer>();
    	listaEnteros.add(1); 
    	listaEnteros.add(2); 
    	listaEnteros.add(3); 
    	listaEnteros.add(4); 
    	listaEnteros.add(1); 
       
    }
    
	
	@Test
    void testSuma() {
        assertEquals(multi.sumar(listaEnteros),11);
    }
	@Test
	void testResta() {
        assertEquals(multi.restar(listaEnteros),-9);
	}
	@Test
	void testMult() {
        assertEquals(multi.multiplicar(listaEnteros),24);
	}
	
	

}
