package Poo2.tp6.Strategy.p1;

public class EnvioColectivosSur implements EstrategiaEnvio {

	@Override
	public float calcularCosto(int pesoTotal, String destino, int kilometros) {
		float costoBase = 0;

		if (destino.equalsIgnoreCase("Capital Federal")) {
			costoBase = 1000;
		} else if (destino.equalsIgnoreCase("Gran Buenos Aires")) {
			costoBase = 1500;
		} else {
			costoBase = 3000;
		}

		float adicionalPeso = 0;
		if (pesoTotal > 5 && pesoTotal <= 30) {
			adicionalPeso = 500;
		} else if (pesoTotal > 30) {
			adicionalPeso = 2000;
		}

		return costoBase + adicionalPeso;
	}
}