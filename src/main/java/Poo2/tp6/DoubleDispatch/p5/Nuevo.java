package Poo2.tp6.DoubleDispatch.p5;

public class Nuevo implements Condicion {
	@Override
	public int calcularDias(Libro libro) {
		return (int) Math.ceil(libro.getPaginas() / 100.0);
	}

	@Override
	public int calcularDias(Disco disco) {
		return disco.getAnioBanda() < 1980 ? 3 : 5;
	}

	@Override
	public int calcularDias(Revista revista) {
		return revista.getPaginas() < 100 ? 2 : 3;
	}
}