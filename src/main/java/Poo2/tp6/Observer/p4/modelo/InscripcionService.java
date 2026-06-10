package Poo2.tp6.Observer.p4.modelo;

import java.util.ArrayList;
import java.util.List;

public class InscripcionService {
	private final ParticipanteRepositorio repositorio;
	private final List<ObserverInscripcion> observadores;

	public InscripcionService(ParticipanteRepositorio repositorio) {
		this.repositorio = repositorio;
		this.observadores = new ArrayList<>();
	}

	public void agregarObservador(ObserverInscripcion observador) {
		this.observadores.add(observador);
	}

	public void registrarParticipante(String nombre, String telefono, String region, String email) {
		Participante nuevo = new Participante(nombre, telefono, region, email);
		this.repositorio.guardar(nuevo);
		this.notificar(nuevo);
	}

	private void notificar(Participante participante) {
		for (ObserverInscripcion obs : this.observadores) {
			obs.notificarInscripcion(participante);
		}
	}
}
