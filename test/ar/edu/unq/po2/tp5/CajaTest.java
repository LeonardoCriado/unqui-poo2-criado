package ar.edu.unq.po2.tp5;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	
	//SUT
	 private Caja cajaSut;
	 private Facturable productoDoc1;
	 private Facturable productoDoc2;
	 private Facturable servicioDoc3;
	 private Facturable impuestoDoc4;
	 private iAgencia agenciaRecaudadora;

	@BeforeEach
	void setUp() throws Exception {
		cajaSut = new Caja();
		productoDoc1 = new Producto(500d, 10);
		productoDoc2 = new ProductoCooperativa(500d, 10, 0.1d);
		agenciaRecaudadora = new Agencia();
		servicioDoc3 = new FacturaServicio(agenciaRecaudadora,50d, 10);
		impuestoDoc4 = new FacturaImpuesto(agenciaRecaudadora,2000d);

	}

	@Test
	void testCajaProductoNormal() throws Exception {
		cajaSut.registrarProducto(productoDoc1);
		cajaSut.registrarProducto(productoDoc1);
		assertEquals(1000d, cajaSut.getMontoTotalAPagar());
		assertEquals(8, ((Producto)productoDoc1).getStock()); 				//consultar!!
	}
	
	@Test
	void testCajaProductoCooperativa() throws Exception {
		cajaSut.registrarProducto(productoDoc2);
		cajaSut.registrarProducto(productoDoc2);
		assertEquals(900d, cajaSut.getMontoTotalAPagar());
		assertEquals(8, ((ProductoCooperativa) productoDoc2).getStock());  //consultar!!				
	}
	
	@Test
	void testCajaProductosMix() throws Exception {
		cajaSut.registrarProducto(productoDoc1);
		cajaSut.registrarProducto(productoDoc2);
		assertEquals(950d, cajaSut.getMontoTotalAPagar());
		//assertEquals(9, productoDoc1.getStock());
		//assertEquals(9, productoDoc2.getStock());
	}
	
	@Test
	void testCajaServicios() throws Exception {
		cajaSut.registrarProducto(servicioDoc3);
		assertEquals(500d, cajaSut.getMontoTotalAPagar());
	}
	
	
	@Test
	void testCajaImpuestos() throws Exception {
		cajaSut.registrarProducto(impuestoDoc4);
		assertEquals(2000d, cajaSut.getMontoTotalAPagar());
	}
	
	@Test
	void testCajaProdServImp() throws Exception {
		cajaSut.registrarProducto(productoDoc1);
		cajaSut.registrarProducto(productoDoc2);
		cajaSut.registrarProducto(servicioDoc3);
		cajaSut.registrarProducto(impuestoDoc4);
		assertEquals(3450d, cajaSut.getMontoTotalAPagar());
	}
	

}
