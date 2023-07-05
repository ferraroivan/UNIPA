package prg.es02;

public class Operazioni{
    public static void main(String[] args) {
        int a = 5, b = 3, i = 6;
        float f = 3.14F;
        int r1, r2, r3, r4;
        char c = 'a';
        short s = 5000;
        r1 = a/b;
        r2 = (int)c * s;
        r3 = i + (int)f;
        r4 = r1-r2-r3;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}
