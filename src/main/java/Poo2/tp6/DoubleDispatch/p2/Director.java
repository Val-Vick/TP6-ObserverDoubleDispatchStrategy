package Poo2.tp6.DoubleDispatch.p2;

public class Director implements Cargo {

	@Override
	public void admitirSubordinado(Cargo cargoSubordinado) {
		cargoSubordinado.serAdmitidoPorDirector();
	}

	@Override
	public void serAdmitidoPorDirector() {
		throw new RuntimeException(EmpleadoJerarquico.ASIGNACION_EMPLEADO_INVALIDA);
	}

	@Override
	public void serAdmitidoPorMandoMedio() {
		throw new RuntimeException(EmpleadoJerarquico.ASIGNACION_EMPLEADO_INVALIDA);
	}
}