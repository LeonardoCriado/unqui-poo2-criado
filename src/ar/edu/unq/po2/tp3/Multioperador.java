package ar.edu.unq.po2.tp3;

import java.util.List;

public class Multioperador {
	
 	
	public int sumar(List<Integer> arregloEnteros) {		
		return calcularListaEntera(arregloEnteros, new SumarEnteros());
	}
	
	public int restar(List<Integer> arregloEnteros) {		
		return calcularListaEntera(arregloEnteros, new RestarEnteros());
	}
	
	public int multiplicar(List<Integer> arregloEnteros) {		
		return calcularListaEntera(arregloEnteros, new MultiplicarEnteros());
	}
	

	private int calcularListaEntera(List<Integer> arregloEnteros, Operacion operador) {
		Integer resultado = arregloEnteros.get(0);
		for (int i = 1; i < arregloEnteros.size(); i++) {
			resultado = operador.calcular(resultado, arregloEnteros.get(i));			
		} 
		return resultado;
	}


}
