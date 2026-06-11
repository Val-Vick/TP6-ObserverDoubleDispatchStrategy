package Poo2.tp6.Strategy.p3;

public class CalculadorLibro implements CalculadorPrecio {
	@Override
	public double calcular(double precioBase) {
		double impuestos = 0.1;
		double descuentos = (precioBase > 100) ? 0.1 : 0.0;

		double total = precioBase * (1 + impuestos) * (1 - descuentos);
		return total - 10; // Envío gratis resta 10 pesos siempre
	}
}