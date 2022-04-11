package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class counterTestCase {
    
    Counter counter;
    
    @BeforeEach
    public void setUp() {
        counter = new Counter();
        counter.addNumber(1).addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(0);
    }
    
    
    @Test
    void test() {
        assertEquals(counter.contarPares(),1);
    }
    
    @Test
    void test2() {
        assertEquals(counter.contarImpares(),8);
    }

    @Test
    void testMultiplos() {
        assertEquals(counter.contarMultiplos(3),2);
    }

    @Test
    void testMayorCantidadPares() {
    	Counter counter2 = new Counter();
    	counter2.addNumber(122).addNumber(11).addNumber(12);
        assertEquals(counter.mayorCantidadPares(counter2.getNumeros()),122);
    }
}
