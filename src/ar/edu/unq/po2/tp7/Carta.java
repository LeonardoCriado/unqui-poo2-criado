package ar.edu.unq.po2.tp7;

public class Carta {

	private String valor;
	private String palo;

	public Carta(String valor, String palo) {
		//if (valor.length() == 1) this.valor = "0"+valor; else this.valor = valor;
		this.valor = valor;
		this.palo = palo;
	}

	public String getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	public boolean esSuperior(Carta carta2) {
		if (this.valor.compareTo(carta2.getValor()) == 1 ) return true; else return false;
		
	}

	public boolean mismoPalo(Carta carta2) {
		return this.palo.equals(carta2.getPalo());
	}

	
}
