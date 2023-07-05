package prg.es02;

public class PrimeNumbers{
    /*
    public static void main(String[] args) {
       int prime = 0;
       int count = 100;
       while(count >= 0){
           if(prime % 2 == 0){
               prime++;
               count--;
               continue;
           } else {
               System.out.println(prime);
           }
           count--;
           prime++;
       }
    }
    */
    static void primenumber(int MyNum) { int n = 0;
    if (MyNum == 2 || MyNum == 3){
      System.out.print(MyNum + " ");
    } 
    else if (MyNum % 6 == 1 || MyNum % 6 == 5) {
      for(int i = 2; i*i <= MyNum; i++) {
        if(MyNum % i == 0){
          n++;
          break;
        }
      }

      if (n == 0){
        System.out.print(MyNum + " ");
      }
    } 
  }
  
  public static void main(String[] args) {
    int x = 100;
    System.out.println("Prime numbers less than "+ x + " are: ");
    for(int i = 2; i < x + 1; i++) {
      primenumber(i);
    }
  }
}
