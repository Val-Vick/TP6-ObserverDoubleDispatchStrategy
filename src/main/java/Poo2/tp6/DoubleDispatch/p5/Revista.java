package Poo2.tp6.DoubleDispatch.p5;

import java.time.LocalDate;

public class Revista implements Articulo {
	private String nombre;
	private int paginas;
	private LocalDate fechaPublicacion;
	private Condicion condicion;

	public Revista(String nombre, int paginas, LocalDate fechaPublicacion, Condicion condicion) {
		this.nombre = nombre;
		this.paginas = paginas;
		this.fechaPublicacion = fechaPublicacion;
		this.condicion = condicion;
	}

	@Override
	public int calcularDiasPrestamo() {
		return this.condicion.calcularDias(this);
	}

	@Override
	public Condicion getCondicion() {
		return this.condicion;
	}

	public int getPaginas() {
		return paginas;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}
}