package Poo2.tp6.DoubleDispatch.p3;

public class TareaDesarrollo implements TipoTarea {

	@Override
	public void admitirContenido(TipoTarea tipoContenido) {
		throw new RuntimeException("Las tareas de desarrollo no pueden contener subtareas");
	}

	@Override
	public void serAdmitidoPorHistoria() {
		//No hace nada
	}

	@Override
	public void serAdmitidoPorEpica() {
		throw new RuntimeException(TareaCompleja.VALIDA_EPICA);
	}
}