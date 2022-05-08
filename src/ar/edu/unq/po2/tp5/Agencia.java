package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Agencia implements iAgencia{
	
	private List<Factura> pagosRegistrados;
	
	
	public Agencia() {
		super();
		this.pagosRegistrados = new ArrayList<Factura>();
	}


	@Override
	public void registrarPago(Factura factura) {
		pagosRegistrados.add(factura);		
	}
	
	
}
