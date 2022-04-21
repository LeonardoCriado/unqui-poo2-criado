/**
 * 
 */
package ar.edu.unq.po2.tp4;

/**
 * @author Le0
 *
 */
public class ProductoPrimeraNecesidad extends Producto {
	
	public ProductoPrimeraNecesidad() {

	}	
	
	public ProductoPrimeraNecesidad(String nombre, double precio) {
		super();
		setNombre(nombre);
		setPrecio(precio);
		setPreciosCuidados(false);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super();
		setNombre(nombre);
		setPrecio(precio);
		setPreciosCuidados(esPrecioCuidado);
	}
	
	
	public double getPrecio() {
		return precio * 0.9;
	}

}
