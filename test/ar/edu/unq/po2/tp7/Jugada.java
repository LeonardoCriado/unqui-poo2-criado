package ar.edu.unq.po2.tp7;

import java.util.ArrayList;
import java.util.List;

public class Jugada {
	protected List<Mano> manos;
	
	public Jugada() {
		manos = new ArrayList<Mano>();
	}

	public void addMano(Mano mano1) {
		this.manos.add(mano1);
	}

	public Mano manoGanadora() {
		Mano ganador = manos.get(0);
		for (Mano mano : this.manos) {
			ganador = this.ganador(mano,ganador);
		};		
		return ganador;
	}

	private Mano ganador(Mano mano, Mano ganador) {
		if(this.hayJugadaGanadora(mano.verificarJugada(),ganador.verificarJugada())) {
			return this.ganadorJugada(mano,ganador);
		}
		else {
			return this.ganadorCartas(mano,ganador);
		}
	}

	private Mano ganadorCartas(Mano mano, Mano ganador) {
		// TODO agregar lógica correcta
		return mano;
	}

	private Mano ganadorJugada(Mano mano, Mano ganador) { //Poker > Color > Trio
		switch(mano.verificarJugada()) {
			case "Poker":
				return mano;
			case "Color":
				if (ganador.verificarJugada().equals("Poker")) return ganador; else return mano;
			case "Trio":
				return mano;
			default:
				return ganador;
		}
	}

	private boolean hayJugadaGanadora(String verificarJugada, String verificarJugada2) {
		return !verificarJugada.equals(verificarJugada2);
	}
	
	
}
