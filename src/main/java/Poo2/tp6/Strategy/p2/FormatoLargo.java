package Poo2.tp6.Strategy.p2;

import java.time.LocalDate;
import java.util.Locale;
import java.time.format.DateTimeFormatter;

public class FormatoLargo implements FormatoFechaStrategy {
	@Override
	public String formatear(LocalDate fecha) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy", new Locale("es", "AR"));

		String resultado = fecha.format(formatter);
		return resultado.substring(0, 5) + resultado.substring(5, 6).toUpperCase() + resultado.substring(6);
	}
}