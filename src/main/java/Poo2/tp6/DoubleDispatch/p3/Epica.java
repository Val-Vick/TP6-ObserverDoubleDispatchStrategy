package Poo2.tp6.DoubleDispatch.p3;

public class Epica implements TipoTarea {
	@Override
	public void admitirContenido(TipoTarea tipoContenido) {
		tipoContenido.serAdmitidoPorEpica();
	}

	@Override
	public void serAdmitidoPorHistoria() {
		throw new RuntimeException(TareaCompleja.VALIDA_HISTORIA);
	}

	@Override
	public void serAdmitidoPorEpica() {
		throw new RuntimeException(TareaCompleja.VALIDA_EPICA);
	}
}