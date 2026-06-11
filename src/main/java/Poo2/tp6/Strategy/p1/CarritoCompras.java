package Poo2.tp6.Strategy.p1;

import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
	private List<Producto> productos;
	private EstrategiaEnvio estrategiaEnvio;
	private String destino;
	private int kilometrosDestino;

	public CarritoCompras(String destino, int kilometrosDestino) {
		this.productos = new ArrayList<>();
		this.destino = destino;
		this.kilometrosDestino = kilometrosDestino;
	}

	public void setEstrategiaEnvio(EstrategiaEnvio estrategiaEnvio) {
		this.estrategiaEnvio = estrategiaEnvio;
	}

	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
	}

	private float calcularSubtotalProductos() {
		float subtotal = 0;
		for (Producto p : productos) {
			subtotal += p.getPrecio();
		}
		return subtotal;
	}

	private int calcularPesoTotal() {
		int pesoTotal = 0;
		for (Producto p : productos) {
			pesoTotal += p.getPeso();
		}
		return pesoTotal;
	}

	public float calcularCostoTotal() {
		if (estrategiaEnvio == null) {
			throw new IllegalStateException("Debe seleccionar una forma de envio antes de calcular el total");
		}

		float costoProductos = calcularSubtotalProductos();
		int pesoTotal = calcularPesoTotal();
		float costoEnvio = estrategiaEnvio.calcularCosto(pesoTotal, this.destino, this.kilometrosDestino);

		return costoProductos + costoEnvio;
	}
}