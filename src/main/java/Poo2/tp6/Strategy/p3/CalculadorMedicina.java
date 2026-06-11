package Poo2.tp6.Strategy.p3;

public class CalculadorMedicina implements CalculadorPrecio {
	@Override
	public double calcular(double precioBase) {
		double impuestos = 0.0;
		double descuentos = (precioBase > 50) ? 0.1 : 0.0;
		boolean envioGratis = (precioBase > 100);

		double total = precioBase * (1 + impuestos) * (1 - descuentos);
		if (envioGratis) {
			total -= 10;
		}
		return total;
	}
}