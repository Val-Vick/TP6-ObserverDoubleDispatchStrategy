package Poo2.tp6.DoubleDispatch.p1;

public class Piedra implements Elemento {

	@Override
	public String competirContra(Elemento otro) {
		return otro.contraPiedra(this);
	}

	@Override
	public String contraPiedra(Piedra piedra) {
		return Jugada.EMPATE;
	}

	@Override
	public String contraPapel(Papel papel) {
		return Jugada.GANASTE;
	}

	@Override
	public String contraTijera(Tijera tijera) {
		return Jugada.PERDISTE;
	}

	@Override
	public String toString() {
		return "piedra";
	}
}