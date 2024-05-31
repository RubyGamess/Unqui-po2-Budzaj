package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Iterator;


public class Counter {

	private ArrayList<Integer> numbers  = new ArrayList<Integer>();
	
	public void addNumber(Integer n) {
	numbers.add(n);	
	}
	public int cantPares(){
		int pares = 0;
		for(int n = 0; n < numbers.size(); n++){
			if (numbers.get(n) % 2 == 0){
				pares ++;
			}
		}
		return pares;
	}
	public int cantImpares(){
		int impares = 0;
		for(int n = 0; n < numbers.size(); n++){
			if (numbers.get(n) % 2 == 1){
				impares ++;
			}
		}
		return impares;
	}
	public int cantMultiplos(Integer n){
		int multi = 0;
		for(int i = 0; i < numbers.size(); i++){
			if (numbers.get(i) % n == 0){
				multi ++;
			}
		}
		return multi;
	}
	
	
	public ArrayList<Integer> getNumbers() {
		return numbers;
	}
	public int mayorDigitosPares(ArrayList<Integer> numeros) {
		
		int mayorPares = 0;
		for (int n = 0; n< numbers.size(); n++) {
		mayorPares = Math.max(mayorPares, contarPares(numeros.get(n)));
		}
		
		
		return mayorPares;
	}
	
	public int contarPares(int n) {
		int count = 0;
		
		while ( n != 0 ) {
			int digito = n % 10;
			if(digito % 2 == 0) {
				count ++ ;
			}
			n = n/10;
		}
		return count;
	}
	
	public int maxMultiplo(int x, int y) {
			for(int i = 1000; i>= 0; i--) {
				if(i % x == 0 && i % y == 0) {
					return i;
				}
			}
			return -1;
	}
}
