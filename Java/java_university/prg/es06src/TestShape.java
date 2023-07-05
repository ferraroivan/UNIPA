package prg.es06;

public class TestShape{
	public static void main(String[] args){
		Circle c1 = new Circle(4.0);
		Rectangle r1 = new Rectangle(3.0,2.0);
		Square s1 = new Square(5.0,5.0);
		
		c1.area();
		c1.circumference();
		r1.area();
		r1.perimeter();
		s1.area();
		s1.perimeter();
		
		System.out.println(c1.toString());
		System.out.println(r1.toString());
		System.out.println(s1.toString());
	}
}