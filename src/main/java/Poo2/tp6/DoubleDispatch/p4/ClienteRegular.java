package Poo2.tp6.DoubleDispatch.p4;

public class ClienteRegular implements TipoCliente {
	@Override
	public float calcularCostoEnvio(ProductoFisico producto) {
		return producto.precio() * producto.getPeso();
	}

	@Override
	public float calcularCostoEnvio(ServicioDigital producto) {
		return 0;
	}

	@Override
	public float calcularImpuesto(ProductoFisico producto) {
		return producto.precio() * producto.getIva();
	}

	@Override
	public float calcularImpuesto(ServicioDigital producto) {
		return producto.precio() * 0.10f;
	}
}