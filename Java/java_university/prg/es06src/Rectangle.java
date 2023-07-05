package prg.es06;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(){}
	
	public Rectangle(double w, double l){
		setWidth(w);
		setLength(l);
	}
	
	// Setters
	public void setWidth(double width){
		this.width = width;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	// Getters
	public double getWidth(){
		return width;
	}
	
	public double getLength(){
		return length;
	}
	
	public double area(){
		return getWidth() * getLength();
	}
	
	public double perimeter(){
		return (getWidth() * 2) + (getLength() + 2);
	}
	
	public String toString(){
		return "RECTANGLE" + "\n" + "Area: " + this.area() + "\n" + "Perimeter: " + 
				this.perimeter() + "\n";
	}
	
}