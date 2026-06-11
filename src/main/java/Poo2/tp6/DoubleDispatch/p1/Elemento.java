package Poo2.tp6.DoubleDispatch.p1;

public interface Elemento {
	String competirContra(Elemento otro);
	String contraPiedra(Piedra piedra);
	String contraPapel(Papel papel);
	String contraTijera(Tijera tijera);
}
