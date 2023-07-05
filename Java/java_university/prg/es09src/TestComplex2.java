package prg.es09;

import java.util.Scanner;

public class TestComplex2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Complex c1 = new Complex();
		Complex c2 = new Complex(2.0,3.0);
		Razionale r1 = new Razionale(14,2);
		Razionale r2 = new Razionale(18,5);
		double in1, in2;
		
		System.out.println("Primo numero Complesso");
		System.out.print("Inserisci parte reale: ");
		in1 = input.nextDouble();
		c1.setReale(in1);
		System.out.print("Inserisci parte immaginaria: ");
		in2 = input.nextDouble();
		c1.setReale(in2);
		System.out.println("Somma: " + c1.somma(c2));
		System.out.println("Sottrazione: " + c1.sottrai(c2));
		System.out.println(r1.toString());
		System.out.println(r2.toString());		
		System.out.println(r1.somma(r2));
		System.out.println(r1.sottrai(r2));
		System.out.println(r1.moltiplica(r2));
		System.out.println(r1.dividi(r2));
	}
}