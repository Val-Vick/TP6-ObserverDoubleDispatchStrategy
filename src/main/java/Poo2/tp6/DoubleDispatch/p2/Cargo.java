package Poo2.tp6.DoubleDispatch.p2;

public interface Cargo {
	void admitirSubordinado(Cargo cargoSubordinado);
	void serAdmitidoPorDirector();
	void serAdmitidoPorMandoMedio();
}