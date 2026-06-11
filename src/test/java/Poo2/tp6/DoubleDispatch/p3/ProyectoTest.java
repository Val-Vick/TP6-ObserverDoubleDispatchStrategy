package Poo2.tp6.DoubleDispatch.p3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProyectoTest {

	@Test
	public void hitoriaNoPuedeContenerAHistoria() {
		var tareaCompleja = new TareaCompleja(10, new HistoriaUsuario());
		var tareaCompleja2 = new TareaCompleja(20, new HistoriaUsuario());
		var e = assertThrows(RuntimeException.class, () -> {
			tareaCompleja.agregarItem(tareaCompleja2);
		});

		assertEquals(TareaCompleja.VALIDA_HISTORIA, e.getMessage());
	}

	@Test
	public void hitoriaNoPuedeContenerASpike() {
		var tareaCompleja = new TareaCompleja(10, new HistoriaUsuario());
		var spike = new Tarea(20, new Spike());
		var e = assertThrows(RuntimeException.class, () -> {
			tareaCompleja.agregarItem(spike);
		});
		assertEquals(TareaCompleja.VALIDA_HISTORIA, e.getMessage());
	}

	@Test
	public void epicaNoPuedeContenerTareaDesarrollo() {
		var tareaCompleja = new TareaCompleja(10, new Epica());
		var td = new Tarea(20, new TareaDesarrollo());
		var e = assertThrows(RuntimeException.class, () -> {
			tareaCompleja.agregarItem(td);
		});
		assertEquals(TareaCompleja.VALIDA_EPICA, e.getMessage());
	}

	@Test
	public void noPuedoCrearUnaEpicaComoTareaSimple() {
		var e = assertThrows(RuntimeException.class, () -> {
			new Tarea(20, new Epica());
		});
		assertEquals(Tarea.VALIDA_TAREA_SIMPLE, e.getMessage());
	}

	@Test
	public void noPuedoCrearUnaHSComoTareaSimple() {
		var e = assertThrows(RuntimeException.class, () -> {
			new Tarea(20, new HistoriaUsuario());
		});
		assertEquals(Tarea.VALIDA_TAREA_SIMPLE, e.getMessage());
	}

	@Test
	public void noPuedoCrearUnSpikeComoTareaCompleja() {
		var e = assertThrows(RuntimeException.class, () -> {
			new TareaCompleja(20, new Spike());
		});
		assertEquals(TareaCompleja.VALIDA_TAREA_COMPLEJA, e.getMessage());
	}

	@Test
	public void historiaPuedeContenerTareaDesarrollo() {
		var historia = new TareaCompleja(10, new HistoriaUsuario());
		var desarrollo = new Tarea(20, new TareaDesarrollo());

		historia.agregarItem(desarrollo);
		assertTrue(historia.tieneItem(desarrollo));
	}

	@Test
	public void epicaPuedeContenerSpike() {
		var epica = new TareaCompleja(15, new Epica());
		var spike = new Tarea(30, new Spike());

		epica.agregarItem(spike);
		assertTrue(epica.tieneItem(spike));
	}

	@Test
	public void calcularHorasTotalesCorrectamente() {
		var epica = new TareaCompleja(10, new Epica());
		var spike1 = new Tarea(20, new Spike());
		var spike2 = new Tarea(5, new Spike());

		epica.agregarItem(spike1);
		epica.agregarItem(spike2);

		assertEquals(35, epica.horasTotales());
	}
}