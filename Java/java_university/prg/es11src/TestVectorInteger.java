package prg.es11;

public class TestVectorInteger{
	public static void main(String[] args){
		VectorInteger v1,v2,v3,ris;
		v1 = new VectorInteger(5);
		v2 = new VectorInteger(5);
		ris = new VectorInteger();
		v3 = new VectorInteger(25);
		
		v1.set(2,10);
		v1.set(3,15);
		v2.set(0,10);
		v2.set(1,5);
		
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		ris = v1.sum(v2);
		System.out.println("Ris: " + ris);
		
		v1.set(7,25);
		try{ 
			ris = v1.subtraction(v3);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println(ris.hashCode());
		System.out.println(v1.equals(v2));
		System.out.println(v2.compareTo(v2));
	} 
}