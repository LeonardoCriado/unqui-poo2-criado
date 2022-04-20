package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaV2TestCase {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		PersonaV2 leo = new PersonaV2("Leonardo","Criado",LocalDate.of(1988, 9, 16));
		assertEquals(33,leo.edad());
	}

}
