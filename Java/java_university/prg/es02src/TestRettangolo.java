package prg.es02;

public class TestRettangolo{
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo();
        Rettangolo r2 = new Rettangolo();

        r1.width = 5;
        r1.heigth = 10;
        r2.width = 7;
        r2.heigth = 10;
        System.out.println("The area of the first rectangle is: " + r1.area());
        System.out.println("The area of the second rectangle is: " + r2.area());
        System.out.println("The perimeter of the first rectangle is: " + r1.perimetro());
        System.out.println("The perimeter of the second rectangle is: " + r2.perimetro());
    }
}
