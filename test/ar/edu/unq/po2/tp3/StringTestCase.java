package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class StringTestCase {
	
	Strings str = new Strings();
	
	@Test
    void test() {
        assertEquals(3,str.s.length());
        //assertEquals(str.t.length(),3);
        assertEquals("1abc", 1 + str.a);
        assertEquals("ABC", str.a.toUpperCase());
        assertEquals(4, "Libertad".indexOf("r"));
        assertEquals(7, "Universidad".lastIndexOf('i'));
        assertEquals("il", "Quilmes".substring(2,4));
        assertEquals(false , (str.a.length() + str.a).startsWith("a"));
        assertEquals(true , str.s == str.a);
        assertEquals(true , str.a.substring(1,3).equals("bc"));
    }
	
}



/*
 * 
EXPRESION:							RESPUESTA:
s.length(); 						retorna 3
t.length(); 						da error porque t es nulo
1 + a;								concatena y el resultado es 1abc
a.toUpperCase();					ABC
"Libertad".indexOf("r");			4
"Universidad".lastIndexOf('i');		7
"Quilmes".substring(2,4);			"il"
(a.length() + a).startsWith("a");	false
s == a;								true
a.substring(1,3).equals("bc")		true
 * 
 * */
 