package Poo2.tp6.Strategy.p2;

import java.time.LocalDate;

public class Persona {
	private String nombre;
	private LocalDate fechaNacimiento;
	private FormatoFechaStrategy formatoStrategy;

	public Persona(String nombre, LocalDate fechaNacimiento, FormatoFechaStrategy formatoStrategy) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.formatoStrategy = formatoStrategy;
	}

	public void setFormatoStrategy(FormatoFechaStrategy formatoStrategy) {
		this.formatoStrategy = formatoStrategy;
	}

	public String fechaNacimiento() {
		if (formatoStrategy == null) {
			throw new IllegalStateException("No se ha definido una estrategia de formato.");
		}
		return this.formatoStrategy.formatear(this.fechaNacimiento);
	}
}