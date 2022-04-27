package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	protected List<Ingreso> IngresosPercibidos;
	
	public Trabajador() {
		IngresosPercibidos = new ArrayList<Ingreso>();
	}
	
	public void addIngreso(Ingreso i) {
		IngresosPercibidos.add(i);
	}

	public double getTotalPercibido() {
		return IngresosPercibidos
				.stream()
				.mapToDouble(Ingreso::montoPercibido)
				.sum();
	}
	
	public double getMontoImponible() {
		return IngresosPercibidos
				.stream()
				.mapToDouble(Ingreso::montoImponible)
				.sum();
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible()*0.02d;
	}

}
