package prg.es01;
import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int numeroInt;
        for(int i = 0;i<args.length;i++){
            numeroInt = Integer.parseInt(args[i]);
            sum += numeroInt;
        }
        System.out.println("The sum is: " + sum);
    }
}
