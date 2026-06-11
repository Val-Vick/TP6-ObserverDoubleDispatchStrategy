package Poo2.tp6.DoubleDispatch.p4;

public class ProductoFisico implements Producto {
	private float precio;
	private float iva;
	private String nombre;
	private int peso;

	public ProductoFisico(String nombre, float precio, int peso) {
		this.precio = precio;
		this.nombre = nombre;
		this.peso = peso;
		this.iva = 0.21f;
	}

	@Override
	public float precio() {
		return precio;
	}

	@Override
	public float costoEnvio(TipoCliente tipo) {
		// DOUBLE DISPATCH: Le pasamos 'this' (instancia de ProductoFisico) al tipo de cliente
		return tipo.calcularCostoEnvio(this);
	}

	@Override
	public float impuesto(TipoCliente tipo) {
		return tipo.calcularImpuesto(this);
	}

	// Getters necesarios para que TipoCliente pueda calcular los valores
	public int getPeso() {
		return this.peso;
	}

	public float getIva() {
		return this.iva;
	}
}