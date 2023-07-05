package prg.es01;
import java.util.Scanner;

public class ContaParola{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = "Ciao";
        int count = 0;
        for(String argument : args){
            if(s1.equals(argument)){
                count++;
            }
        }
        System.out.print("Hai inserito " + count + " argomenti uguali alla parola " + s1);

    }
}
