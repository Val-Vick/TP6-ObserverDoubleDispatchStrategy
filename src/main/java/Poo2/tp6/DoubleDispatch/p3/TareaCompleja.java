package Poo2.tp6.DoubleDispatch.p3;

import java.util.ArrayList;
import java.util.List;

public class TareaCompleja implements ItemDeProyecto {
	public static final String VALIDA_HISTORIA = "Solo tareas de desarrollo se permiten en una historia de usuario";
	public static final String VALIDA_EPICA = "Solo spikes se permiten en una epica";
	public static final String VALIDA_TAREA_COMPLEJA = "No puede crear TS o Spike como Tarea Compleja";
	private List<ItemDeProyecto> items;
	private int horasEstimadas;
	private TipoTarea tipoTarea;

	public TareaCompleja(int horasEstimadas, TipoTarea tipoTarea) {
		if (tipoTarea instanceof TareaDesarrollo || tipoTarea instanceof Spike) {
			throw new RuntimeException(VALIDA_TAREA_COMPLEJA);
		}
		this.horasEstimadas = horasEstimadas;
		this.tipoTarea = tipoTarea;
		this.items = new ArrayList<>();
	}

	public void agregarItem(ItemDeProyecto item) {
		this.tipoTarea.admitirContenido(item.tipoTarea());

		this.items.add(item);
	}

	public boolean tieneItem(ItemDeProyecto item) {
		return this.items.contains(item);
	}

	@Override
	public int horasTotales() {
		int horasTotales = this.horasEstimadas;
		for (ItemDeProyecto item : items) {
			horasTotales += item.horasTotales();
		}
		return horasTotales;
	}

	@Override
	public TipoTarea tipoTarea() {
		return this.tipoTarea;
	}
}