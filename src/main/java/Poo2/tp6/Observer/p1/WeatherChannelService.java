package Poo2.tp6.Observer.p1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class WeatherChannelService implements ClimaOnline {
	private static final String API_KEY = "2eca0f166c7c4756b58cf92bc0139885";
	private static final String URL_API = "https://api.openweathermap.org/data/2.5/weather?q=Viedma,Argentina&units=metric&APPID=" + API_KEY;

	@Override
	public String temperatura() {
		try {
			URL url = new URL(URL_API);
			HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
			conexion.setRequestMethod("GET");

			if (conexion.getResponseCode() != 200) {
				throw new RuntimeException("Error HTTP: " + conexion.getResponseCode());
			}

			BufferedReader in = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
			StringBuilder respuestaString = new StringBuilder();
			String linea;
			while ((linea = in.readLine()) != null) {
				respuestaString.append(linea);
			}
			in.close();
			conexion.disconnect();

			JsonObject jsonCompleto = JsonParser.parseString(respuestaString.toString()).getAsJsonObject();
			JsonObject objetoMain = jsonCompleto.getAsJsonObject("main");
			double temp = objetoMain.get("temp").getAsDouble();

			return temp + " c";

		} catch (Exception e) {
			throw new RuntimeException("Error al obtener la temperatura", e);
		}
	}
}