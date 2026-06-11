package Poo2.tp6.DoubleDispatch.p2;

public class Junior implements Cargo {

	@Override
	public void admitirSubordinado(Cargo cargoSubordinado) {
		throw new RuntimeException("Un junior no puede tener empleados a cargo");
	}

	@Override
	public void serAdmitidoPorDirector() {
		throw new RuntimeException(EmpleadoJerarquico.ASIGNACION_EMPLEADO_INVALIDA);
	}

	@Override
	public void serAdmitidoPorMandoMedio() {
		// No hace nada.
	}
}