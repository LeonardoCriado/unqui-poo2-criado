package ar.edu.unq.po2.tp7;


public class JuegoStatus {
	protected PokerStatus poker;
	protected TrioStatus trio;
	protected ColorStatus color;
	
	
	
	public JuegoStatus() {
		this.poker = new PokerStatus();
		this.trio = new TrioStatus();
		this.color = new ColorStatus();
	}
	
	
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		if (this.poker.verificar(carta1, carta2, carta3, carta4, carta5)) {return "Poquer";} else 
		{if (this.color.verificar(carta1, carta2, carta3, carta4, carta5)) {return "Color";} else 
		{if (this.trio.verificar(carta1, carta2, carta3, carta4, carta5)) {return "Trio";} else
		{return "Nada";}}}
	}
}


