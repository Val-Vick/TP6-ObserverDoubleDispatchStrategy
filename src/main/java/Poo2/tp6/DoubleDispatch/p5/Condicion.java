package Poo2.tp6.DoubleDispatch.p5;

import java.time.LocalDate;

public interface Condicion {
	int calcularDias(Libro libro);
	int calcularDias(Disco disco);
	int calcularDias(Revista revista);
}