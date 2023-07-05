package prg.es03;

public class Principale{
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = persona1;
		System.out.println(persona3.toString());
		System.out.println(" ");

		persona1.nome = "Marco";
		persona1.cognome = "Bonanno";
		persona1.eta = 14;
		persona2.nome = "Mattia";
		persona2.cognome = "Messina Denaro";
		persona2.eta = 50;
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());



	}
}