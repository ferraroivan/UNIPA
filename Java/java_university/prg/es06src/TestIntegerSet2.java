package prg.es06;

public class TestIntegerSet2{
    public static void main(String args[]){
		try{
	        IntegerSet2 a = new IntegerSet2();
	        IntegerSet2 b = new IntegerSet2();

        
	        a.insertElement(4);
	        a.insertElement(890);
	        a.insertElement(23);
	        b.insertElement(4);
	        b.insertElement(42);
	        b.insertElement(41);
        
	        System.out.println("a: " + a);
	        System.out.println("b: " + b);
        
	        IntegerSet2 res;
        
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