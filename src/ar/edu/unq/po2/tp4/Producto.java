package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	protected double precio;
	private boolean esPrecioCuidado;
	
	public Producto() {

	}	
	
	public Producto(String nombre, double precio) {
		super();
		setNombre(nombre);
		setPrecio(precio);
		setPreciosCuidados(false);
	}
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		super();
		setNombre(nombre);
		setPrecio(precio);
		setPreciosCuidados(esPrecioCuidado);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	protected void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	protected void setPreciosCuidados(boolean preciosCuidados) {
		this.esPrecioCuidado = preciosCuidados;
	}
	
	public void aumentarPrecio(double aumento) {
		this.setPrecio(this.getPrecio() + aumento);
	}

}
