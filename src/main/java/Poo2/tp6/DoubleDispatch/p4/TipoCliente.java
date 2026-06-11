package Poo2.tp6.DoubleDispatch.p4;

public interface TipoCliente {
	float calcularCostoEnvio(ProductoFisico producto);
	float calcularCostoEnvio(ServicioDigital producto);

	float calcularImpuesto(ProductoFisico producto);
	float calcularImpuesto(ServicioDigital producto);
}