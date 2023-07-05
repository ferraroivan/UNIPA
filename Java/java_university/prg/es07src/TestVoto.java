package prg.es07;
import java.util.Scanner;

public class TestVoto{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Voto voto = new Voto();
		int choose = 0;
		int id,a,b;
		
		voto.aggiungiVoto(2,90);
		voto.aggiungiVoto(5,90);
		voto.aggiungiVoto(2,90);
		voto.aggiungiVoto(7,90);
		voto.aggiungiVoto(2,90);
		voto.aggiungiVoto(9,90);
		voto.aggiungiVoto(2,90);
		voto.aggiungiVoto(4,90);
		voto.aggiungiVoto(1,90);
		voto.aggiungiVoto(13,90);
		
		
		label:
		while(choose != 4){
			System.out.println("1. Vota");
			System.out.println("2. Stampa Classifica");
			System.out.println("3. Stampa numero voti per cantante");
			System.out.println("4. Esci\n");
			
			switch(choose = input.nextInt()){
				case 1:
					System.out.println("Quante volte vuoi votare? (max 5)");
					a = input.nextInt();
					System.out.println("\nCantanti:");
					voto.stampaCantanti();
					if(a > 5){ 
						break;
					} else {
						for(int i = 0;i<a;++i){
							System.out.print("Cantante: ");
							b=input.nextInt();
							System.out.print("Numero di telefono: ");
							id=input.nextInt();
							System.out.println();
							voto.aggiungiVoto(b,id);
						}
					}
					System.out.println("Il voto é stato effettuato!\n");
					break;
				case 2:
					voto.stampaClassifica();
					break;
				case 3:
					voto.stampaVotiPerCantante();
					break;
				case 4:
					break label;
			}
		}
	}
}