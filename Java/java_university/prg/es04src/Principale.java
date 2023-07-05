package prg.es04;
import java.util.ArrayList;
import java.util.Scanner;

public class Principale{
	public static void main(String[] args) {
		ArrayList<Persona> miaLista = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String choose = "";
		/*
		Persona p1 = new Persona("Luca ", "Sabatino ", 20);
        Persona p2 = new Persona("Dario ", "Bongiorno ", 19);
        Persona p3 = new Persona("Leonardo ", "Rinaldi ", 18);
		
		miaLista.add(p1);
		miaLista.add(p2);
		miaLista.add(p3);

		*/
		

		label:
		while(choose != "e"){
			System.out.println("a. Inserire una nuova persona nella lista con dati Inseriti dall'utente");
			System.out.println("b. Cercare una persona nella lista in base al nome");
			System.out.println("c. Stampare intera lista");
			System.out.println("d. Cancellare l'intera lista");
			System.out.println("e. Esci");		
			
			switch(choose = input.next()){
			case "a":
				String n = input.next();
				String cognome = input.next();
				int eta = input.nextInt();
				Persona p1 = new Persona(n, cognome, eta);
				miaLista.add(p1);
				System.out.println(" ");
				break;
			case "b":
				String nome = input.next();
				boolean state = false;
				for(Persona tmp : miaLista){
					if(tmp.getNome().equals(nome)){
						state = true;
						System.out.println(tmp.toString());
					}
					if(state == false){
						System.out.println("Non é presente nessuno con quel nome!");
					}
				}
				break;
			case "c":
				for(int i = 0;i<miaLista.size();++i){
					System.out.println(miaLista.get(i));
				}
				break;
			case "d":
				miaLista.clear();
				break;
			case "e":
				break label;

			default:
				System.out.println("OPZIONE NON VALIDA. Inserire 'a', 'b', 'c', 'd' o 'e'");
				break;

			}
		}

		
	
		/*
		System.out.println(miaLista.size());
		System.out.println(miaLista.get(miaLista.size()-1));
		miaLista.remove(miaLista.size()-1);

		for(int i = 0;i<miaLista.size();++i){
			System.out.println(miaLista.get(i));
		}

		miaLista.clear();
		System.out.println(miaLista.size());
		*/

	}
}