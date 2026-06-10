package Poo2.tp6.Observer.p4.UI;

import Poo2.tp6.Observer.p4.modelo.JdbcParticipanteRepositorio;
import Poo2.tp6.Observer.p4.modelo.ParticipanteRepositorio;
import Poo2.tp6.Observer.p4.modelo.InscripcionService;
import Poo2.tp6.Observer.p4.modelo.EnvioEmailObserver;

import java.awt.EventQueue;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParticipanteRepositorio repositorio = new JdbcParticipanteRepositorio();
					InscripcionService servicio = new InscripcionService(repositorio);
					servicio.agregarObservador(new EnvioEmailObserver());
					new Vista(servicio);
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		});
	}
}