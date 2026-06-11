package Poo2.tp6.DoubleDispatch.p5;

public class Disco implements Articulo {
	private String titulo;
	private int anioBanda;
	private Condicion condicion;

	public Disco(String titulo, int anioBanda, Condicion condicion) {
		this.titulo = titulo;
		this.anioBanda = anioBanda;
		this.condicion = condicion;
	}

	@Override
	public int calcularDiasPrestamo() {
		return this.condicion.calcularDias(this);
	}

	@Override
	public Condicion getCondicion() {
		return this.condicion;
	}

	public int getAnioBanda() {
		return anioBanda;
	}
}