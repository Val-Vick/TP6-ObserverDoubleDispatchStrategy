package Poo2.tp6.Strategy.p3;

public class Main {
	public static void main(String[] args) {
		var p1 = new Producto(30, new CalculadorLibro());
		var p2 = new Producto(120, new CalculadorAlimento());
		var p3 = new Producto(60, new CalculadorMedicina());
		var p4 = new Producto(40, new CalculadorOtro());

		System.out.println("Precio final Producto 1 (Libro): " + p1.precioFinal());
		System.out.println("Precio final Producto 2 (Alimento): " + p2.precioFinal());
		System.out.println("Precio final Producto 3 (Medicina): " + p3.precioFinal());
		System.out.println("Precio final Producto 4 (Otros): " + p4.precioFinal());
	}
}