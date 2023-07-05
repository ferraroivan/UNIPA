package traffico;
import java.util.Scanner;

public class TestPorto{
	public static void main(String[] args){
		Porto p = new Porto();
		Scanner input = new Scanner(System.in);
		int choose = 0, index,direction,passangers;
		String codice;
		double x,y,speed,length,width;
		
		label:
		while(choose != 6){
			System.out.println("Menu");
			System.out.println("1. Inserisci Nave");
			System.out.println("2. Rimuovi Nave");
			System.out.println("3. Avanza navi");
			System.out.println("4. Stampa stato navi");
			System.out.println("5. Controllo collisioni");
			System.out.println("6. Quit\n");
			
			switch(choose = input.nextInt()){
				case 1:
					System.out.print("Inserisci codice univoco: ");
					codice = input.next();
					System.out.println("Inserisci coordinate x: ");
					x = input.nextDouble();
					System.out.println("Inserisci coordinate y: ");
					y = input.nextDouble();
					System.out.println("Inserisci velocita: ");
					speed = input.nextDouble();
					System.out.println("Inserisci lunghezza: ");
					length = input.nextDouble();
					System.out.println("Insersci larghezza: ");
					width = input.nextDouble();
					System.out.println("Inserisci direzione: ");
					direction = input.nextInt();
					System.out.println("Insersci numero passeggeri: ");
					passangers = input.nextInt();
					p.addNave(codice, x, y, speed, length, width, direction, passangers);
					break;
				case 2:
					System.out.println("Inserisci id nave: ");
					index = input.nextInt();
					p.removeNave(index);
					break;
				case 3:
					p.avanza();
					break;
				case 4:
					p.stampa();
					break;
				case 5:
					System.out.println("Inserisci coordinate x: ");
					x = input.nextDouble();
					System.out.println("Inserisci coordinate y: ");
					y = input.nextDouble();
					p.prevenzioneCollisione(x,y);
					break;
				case 6:
					break label;
				default:
					System.out.println("Try again 1,2,3,4,5,6");
					break;
			}
		}
	}
}