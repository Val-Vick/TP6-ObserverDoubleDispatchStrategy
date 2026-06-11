package Poo2.tp6.Strategy.p1;

public class EnvioCorreoArgentino implements EstrategiaEnvio {

	@Override
	public float calcularCosto(int pesoTotal, String destino, int kilometros) {
		if (destino.equalsIgnoreCase("Capital Federal")) {
			return 500;
		} else {
			return 800 + (5 * kilometros);
		}
	}
}