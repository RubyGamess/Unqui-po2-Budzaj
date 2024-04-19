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
			if (numbers.get(n) % 2 == 0){
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


}
