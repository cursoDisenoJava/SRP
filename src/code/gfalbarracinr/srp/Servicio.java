package code.gfalbarracinr.srp;

import java.util.List;
import java.util.Objects;

public class Servicio {
	
	private BaseDeDatos baseDeDatos;
	
	public Servicio() {
		
		baseDeDatos = new BaseDeDatos();
	}
	
	public double calcularImpuestos (final Producto producto) {
		
		Objects.requireNonNull(producto);
		double impuesto = 1.19;
		return producto.obtenerPrecio() * impuesto;
		
	}
	
	public boolean guardarProducto (final Producto producto) {
		Objects.requireNonNull(producto);
		
		if ( producto.obtenerId() < 0 || producto.obtenerNombre().length() == 0 ) {
			return false;
		}
		baseDeDatos.guardar(producto);
		return true;
	}
	
	public List<Producto> obtenerProductos (){
		
		List<Producto> listaDeProductos = baseDeDatos.listar();
		return listaDeProductos;
		
	}
	
}
