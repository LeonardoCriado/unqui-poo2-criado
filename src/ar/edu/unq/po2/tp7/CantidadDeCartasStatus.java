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

	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> numeroDeCartas = new ArrayList<String>();	
		Collections.addAll(numeroDeCartas, 
										this.numero(carta1), 
										this.numero(carta2),
										this.numero(carta3),
										this.numero(carta4),
										this.numero(carta5));
		return contador.tieneCantidadDeOcurrencias(numeroDeCartas,cantidad);
	}

	
	private String numero(String carta) {
		return carta.substring(0, carta.length()-1);
	}


}
