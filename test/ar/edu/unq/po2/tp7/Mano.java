package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mano {
	protected List<Carta> cartas;
	protected JuegoStatus status;
	
	public Mano(Carta carta1,Carta carta2, Carta carta3,Carta carta4, Carta carta5) {
		cartas = new ArrayList<Carta>(); 
		Collections.addAll(cartas,
							carta1,
							carta2,
							carta3,
							carta4,
							carta5);	
	}
	
	public String verificarJugada() {
		status = new JuegoStatus();
		return status.verificar(cartas.get(0), 
								cartas.get(1), 
								cartas.get(2), 
								cartas.get(3), 
								cartas.get(4));
	}
}
