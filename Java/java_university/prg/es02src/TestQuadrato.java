package prg.es02;
import java.util.Scanner;

public class TestQuadrato{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quadrato q1 = new Quadrato();
        q1.side = 5;
        System.out.println("The area is "+ q1.area());
        System.out.println("The perimeter is " + q1.perimetro());

    }
}
