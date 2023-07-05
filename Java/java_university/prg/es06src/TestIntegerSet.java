package prg.es06;
import java.util.Scanner;

public class TestIntegerSet{
    public static void main(String args[]){
		try{
	        IntegerSet a = new IntegerSet();
	        IntegerSet b = new IntegerSet();
			Scanner input = new Scanner(System.in);
        	
			System.out.print("Insert value: ");
			int value1 = input.nextInt();
	        a.insertElement(value1);
			System.out.print("Insert value: ");
			int value2 = input.nextInt();
	        b.insertElement(value2);
        
	        System.out.println("a: " + a);
	        System.out.println("b: " + b);
        
	        IntegerSet res;
        
	        res = a.unionOfIntegerSet(b);
	        System.out.println("a U b: " + res);
	        res = a.intersectionOfIntegerSet(b);
	        System.out.println("a int b: " + res);
        
	        a.deleteElement(10);
	        System.out.println("a: " + a);
		}catch(IllegalArgumentException e){
			e.printStackTrace();
		}
    }
}