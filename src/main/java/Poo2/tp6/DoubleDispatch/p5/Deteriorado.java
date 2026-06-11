package Poo2.tp6.DoubleDispatch.p5;

import java.time.LocalDate;

public class Deteriorado implements Condicion {
	@Override
	public int calcularDias(Libro libro) {
		return (int) Math.ceil(libro.getPaginas() / 100.0);
	}

	@Override
	public int calcularDias(Disco disco) {
		if (disco.getAnioBanda() < 1980) {
			throw new RuntimeException("No se puede prestar un disco deteriorado de una banda anterior a 1980");
		}
		int diasNormales = 5;
		return Math.max(1, diasNormales - 1);
	}

	@Override
	public int calcularDias(Revista revista) {
		int antiguedad = LocalDate.now().getYear() - revista.getFechaPublicacion().getYear();

		int diasBase = revista.getPaginas() < 100 ? 2 : 3;

		if (antiguedad > 10) {
			return Math.max(1, diasBase - 3);
		} else {
			return Math.max(1, diasBase - 1);
		}
	}
}