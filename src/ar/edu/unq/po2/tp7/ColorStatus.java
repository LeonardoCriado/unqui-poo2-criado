package ar.edu.unq.po2.tp7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ColorStatus {
	
	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		Set<String> colorDeCartas = new HashSet<String>();	
		Collections.addAll(colorDeCartas, 
										this.color(carta1), 
										this.color(carta2),
										this.color(carta3),
										this.color(carta4),
										this.color(carta5));
		return colorDeCartas.size()==1;
	}

	
	private String color(String carta) {
		return carta.substring(carta.length()-1);
	}

}





