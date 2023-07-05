package prg.es05;

public class TestStudente {
	public static void main(String[] args) {
		Studente studente1 = new Studente("Marco","Bonafede",15,12,1998);
		Studente studente2 = new Studente("Ivan","Ferraro",16,10,2000);
		Studente studente3 = new Studente("Carlotta","Ferraro",14,5,2016);

		System.out.println(studente1.toString());
		System.out.println(studente2.toString());
		System.out.println(studente3.toString());
		System.out.println("Studente 1 e 3 sono uguali? " + studente1.equals(studente3));
		studente1 = studente3;
		System.out.println("\nStudente 1 e 3 sono uguali? " + studente1.equals(studente3));
		System.out.println(studente1.toString());

	}
}