package Poo2.tp6.DoubleDispatch.p1;

import java.util.Random;
import java.util.Scanner;

public class Juego {
	private String[] opciones = {"piedra", "papel", "tijera"};
	private Scanner scanner = new Scanner(System.in);

	public void iniciar() {
		boolean continuar = true;
		while (continuar) {
			String eleccionUsuario = elegirElementoUsuario(scanner);
			String eleccionComputadora = elegirElementoComputadora(opciones);

			System.out.println("Tu eleccion: " + eleccionUsuario);
			System.out.println("Elección de la computadora: " + eleccionComputadora);

			System.out.println(new Jugada().jugar(eleccionUsuario, eleccionComputadora));

			continuar = preguntarSiQueremosContinuar();
		}

		System.out.println("Hasta pronto");
		scanner.close();
	}

	private String elegirElementoUsuario(Scanner scanner) {
		System.out.println("Elige una opcion: piedra, papel o tijera");
		return scanner.nextLine().toLowerCase().trim();
	}

	private String elegirElementoComputadora(String[] opciones) {
		Random random = new Random();
		int indice = random.nextInt(3);
		return opciones[indice];
	}

	private boolean preguntarSiQueremosContinuar() {
		System.out.println("¿Desea continuar? s/n");
		String respuesta = this.scanner.nextLine();
		return !respuesta.isEmpty() && respuesta.toLowerCase().charAt(0) == 's';
	}
}
