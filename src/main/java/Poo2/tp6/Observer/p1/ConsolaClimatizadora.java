package Poo2.tp6.Observer.p1;

public class ConsolaClimatizadora implements ObserverTemperatura {

	@Override
	public void actualizar(String temperatura) {
		System.out.println("LOG CONSOLA: Se leyo una temperatura de " + temperatura);

		try {
			String soloNumero = temperatura.replace(" c", "").trim();
			double valorTemp = Double.parseDouble(soloNumero);

			if (valorTemp < 12.0) {
				System.out.println(" Hace frio, se encendera la caldera");
			} else if (valorTemp > 17.0) {
				System.out.println(" Hace calor, se encendera el aire acondicionado");
			}

		} catch (NumberFormatException e) {
			System.err.println("Error No se pudo parsear el valor numerico de la temperatura.");
		}
	}
}
