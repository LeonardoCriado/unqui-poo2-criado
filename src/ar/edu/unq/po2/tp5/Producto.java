package ar.edu.unq.po2.tp5;

public class Producto {
	
	protected double precioBase;
	protected int stock;
	
	

	public Producto(double precioBase, int stock) {
		super();
		this.precioBase = precioBase;
		this.stock = stock;
	}


	protected int getStock() {
		return stock;
	}



	protected void setStock(int stock) {
		this.stock = stock;
	}



	protected double getPrecioBase() {
		return precioBase;
	}

	protected double precio() {
		return precioBase;
	}
	
	protected void disminuirStock(int cantidad) throws Exception {
		this.validarStock(cantidad);
		this.setStock(getStock()-cantidad);
	}

	private void validarStock(int cantidad) throws Exception {
		if(this.getStock() < cantidad) throw new Exception("No hay stock suficiente de este producto");
		
	}


	public void registrarseEnCaja(Caja caja) {
		// TODO Auto-generated method stub
		
	}

}
