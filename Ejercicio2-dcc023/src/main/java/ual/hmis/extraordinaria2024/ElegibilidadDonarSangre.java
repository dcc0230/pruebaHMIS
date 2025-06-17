package ual.hmis.extraordinaria2024;

public class ElegibilidadDonarSangre {

	public boolean puedeDonarSangre(int edad, double peso, String pais) {
		if (edad < 0 || peso < 0) {
			return false;
		}

		switch (pais) {
		case "España":
			return edad >= 18 && edad <= 65 && peso >= 45;
		case "Alemania":
			return edad >= 17 && edad <= 60 && peso >= 50;
		case "Polonia":
			return edad >= 17 && edad <= 70 && peso >= 55;
		case "Japón":
			return edad >= 16 && edad <= 69 && peso >= 50;
		default:
			return false; // Para países no listados
		}
	}
}
