package Poo2.tp6.DoubleDispatch.p3;

public class HistoriaUsuario implements TipoTarea {

	@Override
	public void admitirContenido(TipoTarea tipoContenido) {
		tipoContenido.serAdmitidoPorHistoria();
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