package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	private ProductoPrimeraNecesidad polenta;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		arroz = new ProductoPrimeraNecesidad("Arroz", 10d, false, 0.08d);
		polenta = new ProductoPrimeraNecesidad("Polenta", 20d, false, 0.15d);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2d, leche.getPrecio());
		assertEquals(9.200000000000001d, arroz.getPrecio());
		assertEquals(17d, polenta.getPrecio());
	}
}
