package prg.es08;
import java.util.Scanner;


public class TestStack{
	public static void main(String[] args){
		try {
			Stack<String> stack = new Stack<String>();
			Scanner input = new Scanner(System.in);
			int choose = 0;
			String res = "";
		
			label:
			while(choose != 6){
				System.out.println("MENU");
				System.out.println("1. Add element");
				System.out.println("2. Remove last element");
				System.out.println("3. Check if empty");
				System.out.println("4. Check if full");
				System.out.println("5. Display Stack");
				System.out.println("6. Quit");
			
				switch(choose = input.nextInt()){
					case 1:
						System.out.print("Enter element: ");
						res = input.next();
						stack.push(res);
						System.out.println("Element added!");
						break;
					case 2:
						stack.pop();
						System.out.println("Element removed!");
						break;
					case 3:
						if(stack.isEmpty() == true){
							System.out.println("The stack is empty!");
						} else {
							System.out.println("The stack isn't empty!");
						}
						break;
					case 4:
						if(stack.isFull() == true){
							System.out.println("The stack is full!");
						} else {
							System.out.println("The stack isn't full!");
						}
						break;
					case 5:
						System.out.println(stack.toString());
						break;
					case 6:
						break label;
					default:
						System.out.println("Invalid input, try to input 1,2,3,4,5,6");
						break;
				}
			}
			//System.out.println("Program ended!");
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}	
	}
}