/**
 * 
 */
package ar.edu.unq.po2.tp4;

/**
 * @author Le0
 *
 */
public class ProductoPrimeraNecesidad extends Producto {
	
	protected double descuento = 0.1;
	
	protected double getDescuento() {
		return descuento;
	}

	protected void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad() {

	}	
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPreciosCuidados(false);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPreciosCuidados(esPrecioCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, double descuento) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPreciosCuidados(false);
		this.setDescuento(descuento);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double descuento) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPreciosCuidados(esPrecioCuidado);
		this.setDescuento(descuento);
	}
	
	
	public double getPrecio() {
		return precio * (1-this.getDescuento());
	}

}
