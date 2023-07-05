package prg.es04;

public class Punto{
	public double x;
	public double y;

	public Punto(){}
	/*
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	*/
	public String toString(){
		return "X: " + x + ", Y: " + y;
	}
	public boolean equals(Punto p){
		if(Math.abs(this.distance(p))<1E-5){
			return true;
		} else {
			return false;
		}
	}
	public double distance(Punto p){
		return Math.sqrt(Math.pow(x-p.x, 2) + Math.pow(y-p.y, 2));
	}
	
}