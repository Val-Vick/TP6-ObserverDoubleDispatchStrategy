package Poo2.tp6.DoubleDispatch.p5;

public class Libro implements Articulo {
	private String titulo;
	private int paginas;
	private Condicion condicion;

	public Libro(String titulo, int paginas, Condicion condicion) {
		this.titulo = titulo;
		this.paginas = paginas;
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

	public int getPaginas() {
		return paginas;
	}
}