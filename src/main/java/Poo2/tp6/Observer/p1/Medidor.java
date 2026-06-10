package Poo2.tp6.Observer.p1;

import java.util.ArrayList;
import java.util.List;

public class Medidor {
	private String temperatura;
	private ClimaOnline clima;
	private List<ObserverTemperatura> observadores;

	public Medidor(ClimaOnline clima) {
		this.clima = clima;
		this.observadores = new ArrayList<>();
	}

	public void agregarObservador(ObserverTemperatura observador) {
		this.observadores.add(observador);
	}

	public String leerTemperatura() {
		this.temperatura = this.clima.temperatura();
		this.notificarObservadores(this.temperatura);
		return this.temperatura;
	}

	private void notificarObservadores(String temp) {
		for (ObserverTemperatura obs : this.observadores) {
			obs.actualizar(temp);
		}
	}
}