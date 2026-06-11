package Poo2.tp6.DoubleDispatch.p1;

public class Jugada {
	public static final String PIEDRA = "piedra";
	public static final String TIJERA = "tijera";
	public static final String PAPEL = "papel";
	public static final String GANASTE = "¡Ganaste!";
	public static final String PERDISTE = "¡Perdiste!";
	public static final String EMPATE = "¡Es un empate!";

	public String jugar(String eleccionUsuario, String eleccionComputadora) {
		Elemento usuario = crearElemento(eleccionUsuario);
		Elemento computadora = crearElemento(eleccionComputadora);

		return usuario.competirContra(computadora);
	}

	public Elemento crearElemento(String eleccion) {
		switch (eleccion.toLowerCase()) {
			case PIEDRA: return new Piedra();
			case PAPEL: return new Papel();
			case TIJERA: return new Tijera();
			default: throw new IllegalArgumentException("Opcion invalida: " + eleccion);
		}
	}

}
