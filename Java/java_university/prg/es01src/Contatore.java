package prg.es01;
import java.util.Scanner;

public class Contatore{
    public static void main(String[] args) {
        //System.out.print("Hai inserito " + args.length + " argomenti");

        /*
        for(int i = 0;i<args.length;i++){
            System.out.print(args[i] + " ");
        }
        */
       
        /*
        int count = args.length;
        for(int i = 0;i<args.length;i++){
            System.out.print(args[count-1] + " ");
            count--;
        }
        */

        for(int i = 0;i<args.length;i++){
            if (i % 2 == 0){
                System.out.print(args[i] + " ");
            } 
        }            
    }
}
