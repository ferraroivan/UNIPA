package prg.es08;

public class Point2D{
	private double x;
	private double y;
	
	public Point2D(){}
		
	public Point2D(double x, double y){
		setX(x);
		setY(y);
	}
	
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
	
	public String toString(){
		return "X: " + this.x + " Y: " + this.y;
	}
	
	
}