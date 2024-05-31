package Semana6;

import java.util.HashMap;
import java.util.List;

public class PokerStatus {

	public String verificar(Carta carta,Carta carta2,Carta carta3,Carta carta4,Carta carta5) {
		//HashMap<String, Integer> contadorValores = new HashMap<>();
		List<Carta> mano = 	List.of(carta,
				carta2,carta3,carta4,carta5);
		
		if(esPoker(mano)) {
			return "Poker";
		}else if (esTrio(mano)) {
			return "Trio";
		}else if (esColor(mano)) {
			return "Color";
		}else {
			return "Nada";
		}
		
		//return  string.substring(0, string.length() - 1);
	}

	private Boolean esColor(List<Carta> mano) {
		HashMap<String, Integer> contadorValores = new HashMap<>();
		for (Carta carta : mano) {
		//String valor =	esFigura(carta) ? carta.substring(3) : carta.substring(2);
			String valor = carta.getColor();
		contadorValores.put(valor,contadorValores.getOrDefault(valor,0)+1);
		}
		for (int cantidad : contadorValores.values()) {
			return cantidad == 5;
		}
		return false;
	}
	
	
	
	private Boolean esTrio(List<Carta> mano) {
		HashMap<Integer, Integer> contadorValores = new HashMap<>();
		for (Carta carta : mano) {
			int valor = carta.getValor();
			contadorValores.put(valor,contadorValores.getOrDefault(valor,0)+1);
		}
		
		for (int cantidad : contadorValores.values()) {
			return cantidad == 3;
		}
		return false;
	}
	
	
	private Boolean esPoker(List<Carta> mano) {
		HashMap<Integer, Integer> contadorValores = new HashMap<>();
		
		for (Carta carta : mano) {
			int valor = carta.getValor();
			contadorValores.put(valor,contadorValores.getOrDefault(valor,0)+1);
		}
		
		for (int cantidad : contadorValores.values()) {
			return cantidad == 4;
		}
		return false;
	}
}
