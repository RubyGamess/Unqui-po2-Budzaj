package ar.edu.unq.po2.tp3;

public class Point {

	
	public Integer x;
	public Integer y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(Integer a, Integer b) {
		
		this.x = a;
		this.y = b;
	}
	
	public void moverPunto(Integer a,Integer b) {
		 
			this.x = a;
			this.y = b;
		
	}
	
	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}
	
	public void sumarPuntos(Point p) {
		this.x = this.x + p.getX();
		this.y = this.y + p.getY();
	}
	
	
	//rectangulo
	
	
}
