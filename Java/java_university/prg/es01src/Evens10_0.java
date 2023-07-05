package prg.es01;

public class Evens10_0 {
    public static void main(String[] args) {
        int count = 10;
        while(count >= 0){
            if(count % 2 == 0){
                System.out.println(count);
                count--;
            } else {
                count--;
            }
        }
    }
}
