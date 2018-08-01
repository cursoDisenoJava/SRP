package code.gfalbarracinr.srp;

public class Producto {

	
	public Producto(double precio, String nombre, int id) {
		this.precio = precio;
		this.nombre = nombre;
		this.Id = id;
	}

	public double obtenerPrecio() {
		return this.precio;
	}

	public String obtenerNombre() {
		return this.nombre;
	}
	
	public int obtenerId() {
		return this.Id;
	}
	
	
	private double precio;
	private String nombre;
	private int Id;
	
}
