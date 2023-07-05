package prg.es05;
import java.util.InputMismatchException;
 
// import java.util.Scanner;

public class TestPunto{
	public static void main(String[] args) {
		
		try{
			//Scanner input = new Scanner(System.in);
			Punto p1 = new Punto();
			Punto p2 = new Punto();
			System.out.println("First Point");
			double x1 = p1.inputValidator();
			p1.setX(x1);
			double y1 = p1.inputValidator();
			p1.setY(y1);
			
			System.out.println("\nSecond Point");
			double x2 = p2.inputValidator();
			p2.setX(x2);
			double y2 = p2.inputValidator();
			p2.setY(y2);
			System.out.println("\nThe distance is: " + p1.distance(p2));
			System.out.println("The middle point is: " + "(" + (p1.getX() + p2.getX())/2 + " , " + (p1.getY()+p2.getY())/2+")");
			if(p1.equals(p2)){
				System.out.println("The points are equal");
			} else {
				System.out.println("The points are different");
			}
		} catch (InputMismatchException e){
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		}


		
		
	}
}