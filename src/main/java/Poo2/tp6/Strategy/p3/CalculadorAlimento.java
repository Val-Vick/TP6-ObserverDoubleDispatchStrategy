package Poo2.tp6.Strategy.p3;

public class CalculadorAlimento implements CalculadorPrecio {
	@Override
	public double calcular(double precioBase) {
		double impuestos = 0.05;
		double descuentos = (precioBase > 100) ? 0.15 : 0.0;
		boolean envioGratis = (precioBase > 200);

		double total = precioBase * (1 + impuestos) * (1 - descuentos);
		if (envioGratis) {
			total -= 10;
		}
		return total;
	}
}