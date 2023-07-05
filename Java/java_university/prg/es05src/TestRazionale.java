package prg.es05;
import java.util.Scanner;

public class TestRazionale{
	public static void main(String[] args) {
		try{
			Scanner input = new Scanner(System.in);
			Razionale r1 = new Razionale();
			Razionale r2 = new Razionale();

			int n1,n2,d1,d2;
			System.out.println("First Fraction");
			System.out.print("To enter the numerator: ");
			r1.setNumeratore(n1 = input.nextInt());
			System.out.print("To enter the denominator: ");
			r1.setDenominatore(d1 = input.nextInt());
			System.out.println("\nSecond Fraction");
			System.out.print("To enter the numerator: ");
			r2.setNumeratore(n2 = input.nextInt());
			System.out.print("To enter the denominator: ");
			r2.setDenominatore(d2 = input.nextInt());

			System.out.println("\nThe sum is: " + r1.somma(r2));
			System.out.println("The subctraction is: " + r1.sottrai(r2));
			System.out.println("The multiplication is: " + r1.moltiplica(r2));
			System.out.println("The division is: " + r1.dividi(r2));
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}catch (ArithmeticException e){
			e.printStackTrace();
		}
		
	}
	
}