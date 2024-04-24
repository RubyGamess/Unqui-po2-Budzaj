package ar.edu.unq.po2.tp3;

public class Rectangulo extends Point {

	 private Point puntoSupIzq; // Punto superior izquierdo
	 private Point puntoInfDer; // Punto inferior derecho
	 
	 
	 public Rectangulo(Integer largo, Integer alto) {
	       this.puntoSupIzq = new Point(largo - largo, alto);
	       this.puntoInfDer = new Point(largo, alto - alto);
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
	 
	 
	 public boolean esHorizontal() {
		
	        return puntoSupIzq.getY() < (puntoInfDer.getX());
	    }

	 public boolean esVertical() {
			
	        return puntoSupIzq.getY() > (puntoInfDer.getX());
	    }

}
