package Poo2.tp6.Strategy.p2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatoCorto implements FormatoFechaStrategy {
	@Override
	public String formatear(LocalDate fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
		return fecha.format(formatter);
	}
}