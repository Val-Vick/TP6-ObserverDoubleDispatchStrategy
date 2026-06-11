package Poo2.tp6.Strategy.p2;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonaFechaTest {

	@Test
	public void testFechaFormatoCorto() {
		LocalDate fecha = LocalDate.of(1986, 6, 3);
		var persona = new Persona("Diego", fecha, new FormatoCorto());

		assertEquals("3-06-1986", persona.fechaNacimiento());
	}

	@Test
	public void testFechaFormatoLargo() {
		LocalDate fecha = LocalDate.of(1986, 6, 3);
		var persona = new Persona("Diego", fecha, new FormatoLargo());

		assertEquals("3 de Junio de 1986", persona.fechaNacimiento());
	}
}