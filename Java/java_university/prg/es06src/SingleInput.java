package prg.es06;
import java.util.Scanner;

public class SingleInput{
	// Singleton
	private static SingleInput instance;

	private SingleInput(){
		scanner = new Scanner(System.in);
	}

	public static SingleInput getInstance(){
		if(instance == null){
			instance = new SingleInput();
		}
		return instance;
	}

	// Methods
	private Scanner scanner;

	public String readString(String p){
		System.out.print(p);
		return scanner.next();
	}

	public int readInt(String p){
		System.out.print(p);
		return scanner.nextInt();
	}

}