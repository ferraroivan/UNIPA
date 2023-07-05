package prg.es09;

import java.util.Scanner;
import prg.es07.Abbonato;
import prg.es07.AbbonatoPremium;

public class TestAbbonato{
	public static void main(String[] args){
		Servizio sky = new Servizio();
		Scanner input = new Scanner(System.in);
		
		String choose = "> ";
		String nome,cognome;
		int eta;
		
		loop:
		while(!(choose.equals("f"))){
			System.out.println("a. Aggiungi nuovo abbonato");
			System.out.println("b. Aggiungi nuovo abbonato premium");
			System.out.println("c. Rimuovi abbonato");
			System.out.println("d. Acquista");
			System.out.println("e. Stampa lista abbonati");
			System.out.println("f. Esci\n");
			
			switch(choose = input.next()){
				case "a":
					System.out.print("Nome: ");
					nome = input.next();
					System.out.print("Cognome: ");
					cognome = input.next();
					System.out.print("Eta: ");
					eta = input.nextInt();
					sky.addAbbonato(nome,cognome,eta,false);
					System.out.println("Nuovo abbonato aggiunto!\n");
					break;
				case "b":
					System.out.print("Nome: ");
					nome = input.next();
					System.out.print("Cognome: ");
					cognome = input.next();
					System.out.print("Eta: ");
					eta = input.nextInt();
					sky.addAbbonato(nome,cognome,eta,true);
					System.out.println("Nuovo abbonato premium aggiunto!\n");
					break;
				case "c":
					sky.printAbbonati();
					sky.printAbbonatiPremium();
					System.out.print("Enter the id: ");
					int id = input.nextInt();
					sky.deleteAbbonato(id);
					System.out.println("Abbonato eliminato!");
					break;
				case "d":
					sky.printAbbonati();
					sky.printAbbonatiPremium();
					System.out.print("Inserisci id ed importo: ");
					int identity = input.nextInt();
					int importo = input.nextInt();
					System.out.println("Pagare " + sky.getAbbonato(identity).acquista(importo));
					break;
				case "e":
					sky.printAbbonati();
					sky.printAbbonatiPremium();
					break;
				case "f":
					break loop;
				default:
				System.out.println("L'opzione non è disponibile, reinserire opzione disponibile.");
			}
		}
		
		
	}
}