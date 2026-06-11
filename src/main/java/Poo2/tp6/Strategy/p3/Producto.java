package Poo2.tp6.Strategy.p3;

public class Producto {
	private double precioBase;
	private CalculadorPrecio calculador;

	public Producto(double precioBase, CalculadorPrecio calculador) {
		this.precioBase = precioBase;
		this.calculador = calculador;
	}

	public double precioFinal() {
		return this.calculador.calcular(this.precioBase);
	}
}