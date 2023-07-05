package prg.es09;

import java.util.Scanner;

public class TestComplex{
	public static void main(String[] args){
		try{
			Scanner input = new Scanner(System.in);
			Complex c1 = new Complex();
			Complex c2 = new Complex(2.0,3.0);
			double in1, in2;
		
			System.out.println("Inserisci parte reale: ");
			in1 = input.nextDouble();
			c1.setReale(in1);
			System.out.println("Inserisci parte immaginaria: ");
			in2 = input.nextDouble();
			c1.setReale(in2);
			System.out.println("Somma: " + c1.somma(c2));
			System.out.println("Sottrazione: " + c1.sottrai(c2));
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
	}
}