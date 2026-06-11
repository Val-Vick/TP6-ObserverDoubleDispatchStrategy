package Poo2.tp6.DoubleDispatch.p4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarritoComprasTest {

	@Test
	public void testClienteRegular() {
		var cliente = new Cliente("Jose", new ClienteRegular());
		var producto1 = new ServicioDigital("Hosting", 100, 0.10f);
		var producto2 = new ProductoFisico("Libro", 100, 15);
		var carrito = new CarritoCompras(cliente);
		carrito.agregarProducto(producto1);
		carrito.agregarProducto(producto2);

		// El test mantiene exactamente el mismo resultado esperado del enunciado original
		assertEquals(1731.0F, carrito.calcularPrecio());
	}

	@Test
	public void testClienteCorportivo() {
		var cliente = new Cliente("Jose", new ClienteCorporativo());
		var producto1 = new ServicioDigital("Hosting", 100, 0.10f);
		var producto2 = new ProductoFisico("Libro", 100, 15);
		var carrito = new CarritoCompras(cliente);
		carrito.agregarProducto(producto1);
		carrito.agregarProducto(producto2);

		assertEquals(971.0F, carrito.calcularPrecio());
	}
}