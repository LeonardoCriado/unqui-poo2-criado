package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PokerStatus {
	
	

	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		List<String> numeroDeCartas = new ArrayList<String>();	
		Collections.addAll(numeroDeCartas, 
										this.numero(carta1), 
										this.numero(carta2),
										this.numero(carta3),
										this.numero(carta4),
										this.numero(carta5));
		if(this.tieneCantidadDeOcurrencias(numeroDeCartas,4)) {return "Poquer";} 
			else {return "Nada";}
	}

	
	private boolean tieneCantidadDeOcurrencias(List<String> lista, int cantidad) {
		Long cartasIguales = (long) cantidad;
		Map<Object, Long> counts =
				lista
					.stream()
					.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		return counts.containsValue(cartasIguales);
	}

	private String numero(String carta) {
		return carta.substring(0, carta.length()-1);
	}


}
