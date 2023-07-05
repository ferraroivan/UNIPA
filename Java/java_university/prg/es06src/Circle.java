package prg.es06;

public class Circle extends Shape{
	private final double PI = 3.14;
	private double radius; 
	
	public Circle(double r){
		setRadius(r);
	}
	
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public double area(){
		double radiusSquare = Math.pow(getRadius(),2);
		return 2*radiusSquare*PI;
	}
	
	public double circumference(){
		return 2*getRadius()*PI;
	}
	
	public String toString(){
		return "CIRCLE" + "\n" + "Area: " + this.area() + "\n" + "Circumference: " + this.circumference() + "\n";
	}
}