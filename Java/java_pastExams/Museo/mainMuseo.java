package museo.prg;
import java.util.Scanner;

public class mainMuseo{
	public static void main(String[] args){
		Museo louvre = new Museo("Louvre", "Via Condotti");
		Scanner input = new Scanner(System.in);
		String titolo = "";
		
		louvre.addScultura("Discobolo", "Myron", "460 BC", "Bronzo", 190);
		louvre.addDipinto("Notte Stellata", "Monet", "1889", 74, 92, "olio");
		louvre.addOperaDArte("Estintore", "Jones", "2023");
		
		louvre.stampa();
		
		System.out.println("Quale opera vuoi eliminare?");
		titolo = input.nextLine();
		louvre.removeOpera(titolo);
		louvre.stampa();
		
		
		
	}
}