package Poo2.tp6.DoubleDispatch.p5;

import java.time.LocalDate;

public class Prestamo {
	private Articulo articulo;
	private Persona persona;
	private LocalDate fechaInicio;
	private LocalDate fechaDevolucion;

	public Prestamo(Articulo articulo, Persona persona, LocalDate fechaInicio) {
		this.articulo = articulo;
		this.persona = persona;
		this.fechaInicio = fechaInicio;
		int dias = articulo.calcularDiasPrestamo();
		this.fechaDevolucion = fechaInicio.plusDays(dias);
	}

	public LocalDate getFechaDevolucion() {
		return this.fechaDevolucion;
	}
}