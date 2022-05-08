package ar.edu.unq.po2.tp5;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	//SUT
	 private Caja cajaSut;
	 private Producto productoDoc1;
	 private ProductoCooperativa productoDoc2;

	@BeforeEach
	void setUp() throws Exception {
		cajaSut = new Caja();
		productoDoc1 = new Producto(500d, 10);
		productoDoc2 = new ProductoCooperativa(500d, 10, 0.1d);
	}

	@Test
	void testCajaProductoNormal() throws Exception {
		cajaSut.registrarProducto(productoDoc1);
		cajaSut.registrarProducto(productoDoc1);
		assertEquals(1000d, cajaSut.getMontoTotalAPagar());
		assertEquals(8, productoDoc1.getStock());
	}
	
	@Test
	void testCajaProductoCooperativa() throws Exception {
		cajaSut.registrarProducto(productoDoc2);
		cajaSut.registrarProducto(productoDoc2);
		assertEquals(900d, cajaSut.getMontoTotalAPagar());
		assertEquals(8, productoDoc2.getStock());
	}
	
	@Test
	void testCajaProductosMix() throws Exception {
		cajaSut.registrarProducto(productoDoc1);
		cajaSut.registrarProducto(productoDoc2);
		assertEquals(950d, cajaSut.getMontoTotalAPagar());
		assertEquals(9, productoDoc1.getStock());
		assertEquals(9, productoDoc2.getStock());
	}

}
