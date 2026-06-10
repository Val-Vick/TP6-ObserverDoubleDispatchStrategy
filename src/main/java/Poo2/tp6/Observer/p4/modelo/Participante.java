package Poo2.tp6.Observer.p4.modelo;

import java.util.List;

public class Participante {
	private String nombre;
	private String telefono;
	private String region;
	private String email;

	public Participante(String nombre, String telefono, String region, String email) {
		if (nombre == null || nombre.isEmpty()) {
			throw new RuntimeException("debe cargar un nombre");
		}
		if (telefono == null || !validarTelefono(telefono)) {
			throw new RuntimeException("el telefono debe ingresarse de la forma: NNNN-NNNNNN");
		}
		if (!esRegionValida(region)) {
			throw new RuntimeException("region desconocida");
		}
		if (email == null || email.isEmpty() || !email.contains("@")) {
			throw new RuntimeException("debe cargar un email válido");
		}
		this.nombre = nombre;
		this.telefono = telefono;
		this.region = region;
		this.email = email;
	}

	private boolean validarTelefono(String telefono) {
		return telefono.matches("\\d{4}-\\d{6}");
	}

	private boolean esRegionValida(String region) {
		return List.of("China", "US", "Europa").contains(region);
	}

	public String getNombre(){
		return nombre;
	}

	public String getTelefono(){
		return telefono;
	}

	public String getRegion(){
		return region;
	}

	public String getEmail() {
		return email;
	}
}