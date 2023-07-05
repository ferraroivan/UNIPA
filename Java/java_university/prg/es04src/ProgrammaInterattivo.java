package prg.es04;
import java.util.Scanner;
import java.util.ArrayList;

public class ProgrammaInterattivo{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//String[] paroleVietate = {"alfa","beta","gamma","delta","epsilon","kappa","lambda","sigma","omega"};
						  
		ArrayList<String> paroleVietate = new ArrayList<>();
		String stringa;
		paroleVietate.add("alfa");
		paroleVietate.add("beta");
		paroleVietate.add("gamma");
		paroleVietate.add("delta");
		paroleVietate.add("epsilon");
		paroleVietate.add("kappa");
		paroleVietate.add("lambda");
		paroleVietate.add("sigma");
		paroleVietate.add("omega");
		System.out.println("Digita qualcosa e batti enter, oppure " + 
						   "scrivi l'alfabeto greco per terminare " + 
						   "il programma");
		//loop:
		while(!(stringa = scanner.next()).equals("fine")){
			/*
			boolean test = false;
			for(String tmp : paroleVietate){
				if(tmp.equals(stringa)){
					test = true;
					break loop;
				}
			}
			if (test == false){
				System.out.println("Hai digitato " + stringa.toUpperCase() + "!");
			}*/
			if(paroleVietate.contains(stringa)){
				break;
			}
			else{
				System.out.println("Hai digitato " + stringa.toUpperCase() + "!");;
			}
		}			
		System.out.println("Fine programma!");
	}
}