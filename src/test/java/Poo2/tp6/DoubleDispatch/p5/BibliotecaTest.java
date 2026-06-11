package Poo2.tp6.DoubleDispatch.p5;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BibliotecaTest {

	@Test
	public void testPrestamoLibroRedondeo() {
		var juan = new Persona("Juan", "123");
		var libro = new Libro("Java Avanzado", 250, new Nuevo());

		var prestamo = new Prestamo(libro, juan, LocalDate.of(2026, 6, 1));

		assertEquals(LocalDate.of(2026, 6, 4), prestamo.getFechaDevolucion());
	}

	@Test
	public void testDiscoDeterioradoAnterior1980NoSePresta() {
		var discoViejo = new Disco("Pink Floyd - Wall", 1979, new Deteriorado());
		var juan = new Persona("Juan", "123");

		assertThrows(RuntimeException.class, () -> {
			new Prestamo(discoViejo, juan, LocalDate.now());
		});
	}

	@Test
	public void testDiscoDeterioradoPosterior1980RestaUnDia() {
		var discoNuevo = new Disco("Iron Maiden", 1982, new Deteriorado());
		var juan = new Persona("Juan", "123");

		var prestamo = new Prestamo(discoNuevo, juan, LocalDate.of(2026, 6, 1));
		assertEquals(LocalDate.of(2026, 6, 5), prestamo.getFechaDevolucion());
	}

	@Test
	public void testRevistaDeterioradaAntiguaReduceDias() {
		var revistaAntigua = new Revista("Gamer PC", 150, LocalDate.of(2011, 1, 1), new Deteriorado());

		var juan = new Persona("Juan", "123");
		var prestamo = new Prestamo(revistaAntigua, juan, LocalDate.of(2026, 6, 1));

		assertEquals(LocalDate.of(2026, 6, 2), prestamo.getFechaDevolucion());
	}
}