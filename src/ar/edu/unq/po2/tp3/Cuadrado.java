package ar.edu.unq.po2.tp3;

public class Cuadrado extends Point{

	 private Point puntoSupIzq; // Punto superior izquierdo
	 private Point puntoInfDer; // Punto inferior derecho
	 
	 
	 public Cuadrado(Integer tamaño) {
	       this.puntoSupIzq = new Point(tamaño-tamaño, tamaño);
	       this.puntoInfDer = new Point(tamaño,tamaño - tamaño);	 }
	 
	 
	 public int tamaño() {
		 return this.puntoInfDer.getX();
	 }
	 public int getArea() {
	     int base = puntoInfDer.getX();
	     int altura = puntoSupIzq.getY();
	     return base * altura;
	  
	}
	 public int getPerimetro() {
		 
		 int base = puntoInfDer.getX();
		 int altura = puntoSupIzq.getY();
		 return  (base + altura) * 2;
	 }
	 
}
