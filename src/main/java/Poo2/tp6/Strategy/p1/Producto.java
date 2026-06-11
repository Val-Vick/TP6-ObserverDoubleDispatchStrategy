package Poo2.tp6.Strategy.p1;

public class Producto {
	private String nombre;
	private float precio;
	private int peso;

	public Producto(String nombre, float precio, int peso) {
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
	}

	public float getPrecio() {
		return precio;
	}

	public int getPeso() {
		return peso;
	}
}