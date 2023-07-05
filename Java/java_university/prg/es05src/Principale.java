package prg.es05;

public class Principale{
	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = persona1;
		System.out.println(persona3.toString());
		System.out.println(" ");

		persona1.setNome("Marco");
		persona1.setCognome("Bonanno");
		persona1.setEta(14);
		persona2.setNome("Mattia");
		persona2.setCognome("Messina Denaro");
		persona2.setEta(50);
		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());



	}
}