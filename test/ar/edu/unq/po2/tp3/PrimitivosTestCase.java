package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PrimitivosTestCase {
		
	Primitivos pmt = new Primitivos();
	
	@Test
    void test() {
        assertEquals(0,pmt.i);
        assertEquals(null,pmt.inte);
    }
	
	
}
/*
 * 
1. ¿Qué son los tipos de datos primitivos?
Son aquellos que vienen predefinidos por el lenguaje. En el caso de Java son:
.byte
.short
.int
.long
.float
.double
.boolean
.char

2. ¿Cuál es la diferencia entre un int y un Integer?



3. ¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado?
Su valor predeterminado es 0. 
¿Y si se define una de tipo Integer? Haga la prueba en Eclipse.
Su valor predeterminado es null.

4. Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una variable de
instancia se define una variable de método.
No es posible utilizar variables de método sin inicializar.

 * 
 * 
 */
 