package code.gfalbarracinr.srp;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Servicio miServicio = new Servicio();
		
		Producto miProducto = new Producto(15.34, "mi producto", 2);
		
		System.out.println("El valor del producto es: " 
				+ Double.toString(miServicio.calcularImpuestos(miProducto)));
		
		miServicio.guardarProducto(miProducto);
		
		List <Producto> miLista = miServicio.obtenerProductos();
		
		for (Producto producto : miLista) {
			
			System.out.println(producto.obtenerId());
			System.out.println(producto.obtenerNombre());
			System.out.println(producto.obtenerPrecio());
		}
	}

}
