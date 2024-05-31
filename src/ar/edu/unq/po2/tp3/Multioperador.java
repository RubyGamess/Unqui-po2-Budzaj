package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

	
	private ArrayList<Integer> numbers  = new ArrayList<Integer>();
	
	public void addNumber(Integer n) {
		numbers.add(n);	
		}
	
	public int sumarNumeros() {
		
		int sumaHastaAhora = 0;
		for(int n = 0; n < numbers.size(); n++) {
			sumaHastaAhora = sumaHastaAhora + numbers.get(n); 
		}
		return sumaHastaAhora;
	}
	
public int restarNumeros() {
		
		int restaHastaAhora = 0;
		for(int n = 0; n < numbers.size(); n++) {
			restaHastaAhora = restaHastaAhora - numbers.get(n); 
		}
		return restaHastaAhora;
	}

public int multiEntreSi() {
	
	int restaHastaAhora = 1;
	for(int n = 0; n < numbers.size(); n++) {
		restaHastaAhora = restaHastaAhora * numbers.get(n); 
	}
	return restaHastaAhora;
}
}
