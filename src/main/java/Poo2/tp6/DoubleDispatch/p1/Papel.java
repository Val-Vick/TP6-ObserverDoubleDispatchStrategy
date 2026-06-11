package Poo2.tp6.DoubleDispatch.p1;

public class Papel implements Elemento {

	@Override
	public String competirContra(Elemento otro) {
		return otro.contraPapel(this);
	}

	@Override
	public String contraPiedra(Piedra piedra) {
		return Jugada.PERDISTE;
	}

	@Override
	public String contraPapel(Papel papel) {
		return Jugada.EMPATE;
	}

	@Override
	public String contraTijera(Tijera tijera) {
		return Jugada.GANASTE;
	}

	@Override
	public String toString() {
		return "papel";
	}
}