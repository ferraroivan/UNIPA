package prg.es07;
import java.util.Scanner;

public class TestAbbonato{
	public static void main(String[] args){
		Servizio sky = new Servizio();
		Scanner input = new Scanner(System.in);
		
		sky.aggiungiAbbonato(new Abbonato("Mattia", "Miraglio",28));
		sky.aggiungiAbbonato(new Abbonato("Ivan", "Ferraro",22));
		sky.aggiungiAbbonato(new Abbonato("Rossa", "Barba",25));
		
		sky.aggiungiAbbonatoPremium(new AbbonatoPremium("Matteo", "Cataldo",89));
		sky.aggiungiAbbonatoPremium(new AbbonatoPremium("Messina", "Denaro",29));
		sky.aggiungiAbbonatoPremium(new AbbonatoPremium("Matteo", "Bullara",15));
		
		String choose = "> ";
		String nome,cognome;
		int eta;
		
		loop:
		while(!(choose.equals("e"))){
			System.out.println("a. Aggiungi nuovo abbonato");
			System.out.println("b. Aggiungi nuovo abbonato premium");
			System.out.println("c. Acquista");
			System.out.println("d. Stampa lista abbonati");
			System.out.println("e. Esci\n");
			
			switch(choose = input.next()){
				case "a":
					System.out.print("Nome: ");
					nome = input.next();
					System.out.print("Cognome: ");
					cognome = input.next();
					System.out.print("Eta: ");
					eta = input.nextInt();
					sky.aggiungiAbbonato(new Abbonato(nome,cognome,eta));
					System.out.println("Nuovo abbonato aggiunto!\n");
					break;
				case "b":
					System.out.print("Nome: ");
					nome = input.next();
					System.out.print("Cognome: ");
					cognome = input.next();
					System.out.print("Eta: ");
					eta = input.nextInt();
					sky.aggiungiAbbonatoPremium(new AbbonatoPremium(nome,cognome,eta));
					System.out.println("Nuovo abbonato premium aggiunto!\n");
					break;
				case "c":
					System.out.println("Inserisci 1 per abbonato, 2 per abbonato premium");
					String tipo = input.nextLine();
					if(tipo.equals("1")){
						sky.stampaAbbonati();
						System.out.print("Inserisci id ed importo: ");
						int id = input.nextInt();
						int importo = input.nextInt();
						System.out.println("Pagare " + sky.getAbbonato(id).acquista(importo));
					} else {
						sky.stampaAbbonatiPremium();
						System.out.print("Inserisci id ed importo: ");
						int id = input.nextInt();
						int importo = input.nextInt();
						System.out.println("Pagare " + sky.getAbbonatoPremium(id).acquista(importo));
					}
					break;
				case "d":
					sky.stampaAbbonati();
					sky.stampaAbbonatiPremium();
					break;
				case "e":
					break loop;
				default:
				System.out.println("L'opzione non è disponibile, reinserire opzione disponibile.");
			}
		}
		
		
	}
}