package prg.es08;

public class Square extends Rectangle implements Scalable,Drawable{
	
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
		return "SQUARE" + "\n" + "Side: " + this.getLength() + "\n" + "Area: " + 
				this.area() + "\n" + "Perimeter: " + this.perimeter()+ "\n";
	}

	// interfaces methods
	public void scale(double factor){
		setWidth(this.getWidth()*factor);
		setLength(this.getLength() * factor);
	}
	
	public String draw(){
		return toString();
	}
}
