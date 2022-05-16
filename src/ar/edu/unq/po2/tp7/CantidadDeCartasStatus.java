package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CantidadDeCartasStatus {
	
	protected ContadorOcurrencias contador;
	protected int cantidad;
	
	public CantidadDeCartasStatus(int cantidad) {
		this.contador = new ContadorOcurrencias();
		this.cantidad = cantidad;
	}

	public boolean verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		List<String> numeroDeCartas = new ArrayList<String>();	
		Collections.addAll(numeroDeCartas, 
										this.numero(carta1), 
										this.numero(carta2),
										this.numero(carta3),
										this.numero(carta4),
										this.numero(carta5));
		return contador.tieneCantidadDeOcurrencias(numeroDeCartas,cantidad);
	}

	
	private String numero(Carta carta1) {
		return carta1.getValor();
	}


}
