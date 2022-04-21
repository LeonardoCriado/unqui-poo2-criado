/**
 * 
 */
package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LeO
 *
 */
public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> catalogoDeProductos;
	
	
	public Supermercado() {
		
	}
	
	public Supermercado(String nombre, String direccion) {
		super();
		setNombre(nombre);
		setDireccion(direccion);
		setCatalogoDeProductos(new ArrayList<Producto>());
	}

	public String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	protected List<Producto> getCatalogoDeProductos() {
		return catalogoDeProductos;
	}

	protected void setCatalogoDeProductos(List<Producto> catalogoDeProductos) {
		this.catalogoDeProductos = catalogoDeProductos;
	}

	public void agregarProducto(Producto producto) {
		this.getCatalogoDeProductos().add(producto);		
	}

	public int getCantidadDeProductos() {
		return this.getCatalogoDeProductos().size();
	}

	public double getPrecioTotal() {
		double precioTotal = 0;
		for(Producto producto : this.getCatalogoDeProductos()) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}
	
	
	
	
}
