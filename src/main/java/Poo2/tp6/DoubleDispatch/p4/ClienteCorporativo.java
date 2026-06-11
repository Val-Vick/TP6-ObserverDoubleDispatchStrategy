package Poo2.tp6.DoubleDispatch.p4;

public class ClienteCorporativo implements TipoCliente {

	@Override
	public float calcularCostoEnvio(ProductoFisico producto) {
		float costoSugerido = producto.precio() * producto.getPeso();
		return costoSugerido - (costoSugerido * 0.5f);
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
		return 0;
	}
}