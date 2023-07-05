package prg.es05;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Punto{
	private double x;
	private double y;

	public Punto(){}
	
	public void setX(double x){
		this.x = x;
	}
	public void setY(double y){
		this.y = y;
	}
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public String toString(){
		return "X: " + getX() + ", Y: " + getY();
	}
	public boolean equals(Punto p){
		if(Math.abs(this.distance(p))<1E-5){
			return true;
		} else {
			return false;
		}
	}
	public double distance(Punto p){
		return Math.sqrt(Math.pow(this.getX()-p.getX(), 2) + Math.pow(this.getY()-p.getY(), 2));
	}
	
	
	// check validity
	public double inputValidator(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value: ");
		String getData = scanner.next();
		if(getData.length() >= 1){
			if(!Character.isDigit(getData.charAt(0)) && getData.charAt(0) != '-') throw new InputMismatchException();
		}
		for (int i = 1; i < getData.length(); i++) {
		     if(!Character.isDigit(getData.charAt(i))) throw new InputMismatchException();
		}
		return Double.parseDouble(getData);
	}
	
}