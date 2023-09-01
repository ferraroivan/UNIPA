package prg.es11;
import java.util.Scanner;

public class TestRubrica{
	public static void main(String[] args){
		Rubrica lista = new Rubrica();
		Scanner input = new Scanner(System.in);
		String choose = "";
		String nome,cognome,telefono,indirizzo,qualifica;
		
		label:
		while(choose != "h"){
			System.out.println("a) inserisci un nuovo amico");
			System.out.println("b) inserisci un nuovo collega");
			System.out.println("c) stampa lista degli amici in ordine alfabetico");
			System.out.println("d) stampa lista dei colleghi in ordine alfabetico");
			System.out.println("e) stampa lista dei contatti in ordine alfabetico ");
			System.out.println("f) ricerca del numero telefonico del contatto a partire dal cognome e nome");
			System.out.println("g) cancella tutto");
			System.out.println("h) esci");
			
			switch(choose = input.nextLine()){
				case "a":
					System.out.print("Inserisci nome: ");
					nome = input.nextLine();
					System.out.print("Inserisci cognome: ");
					cognome = input.nextLine();
					System.out.print("Inserisci telefono: ");
					telefono = input.nextLine();
					System.out.print("Inserisci indirizzo: ");
					indirizzo = input.nextLine();
					Amico a = new Amico(nome,cognome,telefono,indirizzo);
					lista.aggiungi(a);
					System.out.println("Amico aggiungo!");
					break;
				case "b":
					System.out.print("Inserisci nome: ");
					nome = input.nextLine();
					System.out.print("Inserisci cognome: ");
					cognome = input.nextLine();
					System.out.print("Inserisci telefono: ");
					telefono = input.nextLine();
					System.out.print("Inserisci qualifica: ");
					qualifica = input.nextLine();
					Collega b = new Collega(nome,cognome,telefono,qualifica);
					lista.aggiungi(b);
					System.out.println("Collega aggiungo!");
					break;
				case "c":
					lista.stampaAmici();
					break;
				case "d":
					lista.stampaColleghi(); 
					break;
				case "e":
					lista.stampaContatti();
					break;
				case "f":
					System.out.print("Inserisci nome: ");
					nome = input.nextLine();
					System.out.print("Inserisci cognome: ");
					cognome = input.nextLine();
					lista.trova(nome,cognome);
					break;
				case "g":
					lista.cancella();
					System.out.println("Rubrica cancellata!");
					break;
				case "h":
					break label;
			}

		}
	}
}
