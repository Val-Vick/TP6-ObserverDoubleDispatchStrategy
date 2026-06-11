package Poo2.tp6.DoubleDispatch.p4;

public class ServicioDigital implements Producto {
	private float precio;
	private String nombre;
	private float iva;

	public ServicioDigital(String nombre, float precio, float iva) {
		this.precio = precio;
		this.nombre = nombre;
		this.iva = iva;
	}

	@Override
	public float precio() {
		return this.precio;
	}

	@Override
	public float costoEnvio(TipoCliente tipo) {
		return tipo.calcularCostoEnvio(this);
	}

	@Override
	public float impuesto(TipoCliente tipo) {
		return tipo.calcularImpuesto(this);
	}

	public float getIva() {
		return this.iva;
	}
}