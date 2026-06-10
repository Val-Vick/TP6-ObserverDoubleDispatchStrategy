package Poo2.tp6.Observer.p1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ArchivadorTemperatura implements ObserverTemperatura {
	private String rutaArchivo;

	public ArchivadorTemperatura(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	@Override
	public void actualizar(String temperatura) {
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String fechaFormateada = ahora.format(formateador);

		try (FileWriter fw = new FileWriter(this.rutaArchivo, true);
			 PrintWriter pw = new PrintWriter(fw)) {

			pw.println("Fecha: " + fechaFormateada + " - Temperatura: " + temperatura);

		} catch (IOException e) {
			System.err.println("No se pudo guardar la temperatura en el archivo: " + e.getMessage());
		}
	}
}