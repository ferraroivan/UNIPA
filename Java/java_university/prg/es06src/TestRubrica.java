package prg.es06;
import prg.es04.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class TestRubrica{
	public static void main(String[] args) {
		ArrayList<Persona> miaLista = new ArrayList<>();
		SingleInput input = SingleInput.getInstance();
		String choose = "";

		label:
		while(choose != "e"){
			System.out.println("a. Inserire una nuova persona nella lista con dati Inseriti dall'utente");
			System.out.println("b. Cercare una persona nella lista in base al nome");
			System.out.println("c. Stampare intera lista");
			System.out.println("d. Cancellare l'intera lista");
			System.out.println("e. Esci");		
			
			switch(choose = input.readString("> ")){
			case "a":
				String n = input.readString("Inserire nome: ");
				String cognome = input.readString("Inserire cognome: ");
				int eta = input.readInt("Inserire eta: ");
				Persona p1 = new Persona(n, cognome, eta);
				miaLista.add(p1);
				System.out.println(" ");
				break;
			case "b":
				String nome = input.readString("Inserire nome: ");
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
				System.out.println("List cleared!");
				break;
			case "e":
				System.out.println("End program!");
				break label;

			default:
				System.out.println("OPZIONE NON VALIDA. Inserire 'a', 'b', 'c', 'd' o 'e'");
				break;

			}
		}
	}
}