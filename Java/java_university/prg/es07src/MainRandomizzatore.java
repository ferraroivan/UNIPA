package prg.es07;

public class MainRandomizzatore{
	public static void main(String[] args){
		Dado d1 = new Dado();
		Moneta m1 = new Moneta();
		
		System.out.println("Dado:");
		d1.lancia();
		System.out.println("\nMoneta:");
		m1.lancia();
	}
}