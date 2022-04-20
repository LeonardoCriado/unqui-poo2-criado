package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {

	@BeforeEach
	void setUp() throws Exception {
		Persona leo;
	}

	@Test
	void test() {
		Persona leo = new Persona("Leonardo",LocalDate.of(1988, 9, 16));
		assertEquals(33,leo.edad());
	}

}
