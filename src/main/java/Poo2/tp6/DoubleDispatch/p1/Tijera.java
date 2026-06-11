package Poo2.tp6.DoubleDispatch.p1;

public class Tijera implements Elemento {

	@Override
	public String competirContra(Elemento otro) {
		return otro.contraTijera(this);
	}

	@Override
	public String contraPiedra(Piedra piedra) {
		return Jugada.GANASTE;
	}

	@Override
	public String contraPapel(Papel papel) {
		return Jugada.PERDISTE;
	}

	@Override
	public String contraTijera(Tijera tijera) {
		return Jugada.EMPATE;
	}

	@Override
	public String toString() {
		return "tijera";
	}
}