package ar.edu.unq.po2.tp5;

public class FacturaServicio extends Factura {
	
	private double costoPorUnidadConsumida;
	private int unidadesConsumidas;
	
	

	public FacturaServicio(iAgencia agencia, double costoPorUnidadConsumida, int unidadesConsumidas) {
		super(agencia);
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.unidadesConsumidas = unidadesConsumidas;
	}


	@Override
	protected double montoAPagar() {
		return costoPorUnidadConsumida * unidadesConsumidas;
	}

}
