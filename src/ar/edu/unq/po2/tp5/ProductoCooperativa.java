package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{
	
	protected double porcentajeDescuento;

	public ProductoCooperativa(double precioBase, int stock, double porcentajeDesc) {
		super(precioBase, stock);
		this.porcentajeDescuento = porcentajeDesc;
	}
	
	protected double precio() {
		return precioBase * (1 - porcentajeDescuento);
	}

}
