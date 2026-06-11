package Poo2.tp6.DoubleDispatch.p4;

public interface Producto {
	float precio();
	float costoEnvio(TipoCliente tipo);
	float impuesto(TipoCliente tipo);
}