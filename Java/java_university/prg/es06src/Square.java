package prg.es06;

public class Square extends Rectangle{
	
	public Square(){
		
	}
	
	public Square(double w, double l){
		super.setWidth(w);
		super.setLength(l);
		
	}
	public double area(){
		return super.getWidth() * super.getLength();
	}
	
	public double perimeter(){
		return super.getLength() * 4;
	}
	
	public String toString(){
		return "SQUARE" + "\n" + "Area: " + this.area() + "\n" + "Perimeter: " + 
				this.perimeter()+ "\n";
	}
}
