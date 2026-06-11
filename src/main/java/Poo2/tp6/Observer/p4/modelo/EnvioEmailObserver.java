package Poo2.tp6.Observer.p4.modelo;

public class EnvioEmailObserver implements ObserverInscripcion {
	@Override
	public void notificarInscripcion(Participante participante) {
		System.out.println("ENVIANDO EMAIL DE CONFIRMACION");
		System.out.println("Para: " + participante.getEmail());
		System.out.println("Estimado/a " + participante.getNombre() + ",");
		System.out.println("Confirmamos que tu inscripcion ha sido procesada con exito.");
	}
}
