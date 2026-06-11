package Poo2.tp6.DoubleDispatch.p2;

public class MandoMedio implements Cargo {

	@Override
	public void admitirSubordinado(Cargo cargoSubordinado) {
		cargoSubordinado.serAdmitidoPorMandoMedio();
	}

	@Override
	public void serAdmitidoPorDirector() {
		// No hace nada
	}

	@Override
	public void serAdmitidoPorMandoMedio() {
		throw new RuntimeException(EmpleadoJerarquico.ASIGNACION_EMPLEADO_INVALIDA);
	}
}