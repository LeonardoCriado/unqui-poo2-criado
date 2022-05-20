package ar.edu.unq.po2.tp7;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ContadorOcurrencias {


	public boolean tieneCantidadDeOcurrencias(List<String> lista, int cantidad) {
		Long cartasIguales = (long) cantidad;
		Map<Object, Long> counts =
				lista
					.stream()
					.collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		return counts.containsValue(cartasIguales);
	}

}