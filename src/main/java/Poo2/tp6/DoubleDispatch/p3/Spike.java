package Poo2.tp6.DoubleDispatch.p3;

public class Spike implements TipoTarea {

	@Override
	public void admitirContenido(TipoTarea tipoContenido) {
		throw new RuntimeException("Los Spikes no pueden contener subtareas");
	}

	@Override
	public void serAdmitidoPorHistoria() {
		throw new RuntimeException(TareaCompleja.VALIDA_HISTORIA);
	}

	@Override
	public void serAdmitidoPorEpica() {
		//No hace nada
	}
}