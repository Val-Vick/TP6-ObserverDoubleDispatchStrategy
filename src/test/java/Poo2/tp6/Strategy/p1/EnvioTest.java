package Poo2.tp6.Strategy.p1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvioTest {

	@Test
	public void testEnvioColectivosSurCapitalPocoPeso() {
		var carrito = new CarritoCompras("Capital Federal", 0);
		carrito.agregarProducto(new Producto("Teclado", 5000, 2));

		carrito.setEstrategiaEnvio(new EnvioColectivosSur());

		assertEquals(6000f, carrito.calcularCostoTotal());
	}

	@Test
	public void testEnvioColectivosSurInteriorMuchoPeso() {
		var carrito = new CarritoCompras("Bariloche", 1600);
		carrito.agregarProducto(new Producto("Monitor", 40000, 8));

		carrito.setEstrategiaEnvio(new EnvioColectivosSur());

		assertEquals(43500f, carrito.calcularCostoTotal());
	}

	@Test
	public void testEnvioCorreoArgentinoProvincia() {
		var carrito = new CarritoCompras("La Plata", 60);
		carrito.agregarProducto(new Producto("Gabinete", 12000, 6));

		carrito.setEstrategiaEnvio(new EnvioCorreoArgentino());

		assertEquals(13100f, carrito.calcularCostoTotal());
	}
}