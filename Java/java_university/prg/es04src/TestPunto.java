package prg.es04;
import java.util.Scanner;

public class TestPunto{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Punto p1 = new Punto();
		Punto p2 = new Punto();

		double x1,x2,y1,y2;

		System.out.println("Enter x1: ");
		p1.x = input.nextDouble();
		System.out.println("Enter x2: ");
		p2.x = input.nextDouble();
		System.out.println("Enter y1: ");
		p1.y = input.nextDouble();
		System.out.println("Enter y2: ");
		p2.y = input.nextDouble();

		System.out.println("The distance is: " + p1.distance(p2));
		System.out.println("The middle point is: " + "(" + (p1.x + p2.x)/2 + " , " + (p1.y+p2.y)/2+")");
		if(p1.equals(p2)){
			System.out.println("The points are equal");
		} else {
			System.out.println("The points are different");
		}
		





	}
}