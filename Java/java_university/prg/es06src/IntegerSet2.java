package prg.es06;
import java.util.ArrayList;

public class IntegerSet2{
    private ArrayList<Integer> a = new ArrayList<>();
    
    public IntegerSet2(){
        ;
    }
    
    public IntegerSet2 unionOfIntegerSet(IntegerSet2 altro){
		IntegerSet2 res = new IntegerSet2();

		for(int item : this.a)
			res.insertElement(item);
		for(int item : altro.a)
			res.insertElement(item);
		
        return res;
    }

    public IntegerSet2 intersectionOfIntegerSet(IntegerSet2 altro){
		IntegerSet2 res = new IntegerSet2();

		for(int item : this.a){
			if(altro.contains(item)){
				res.insertElement(item);
			}
		}
		
		return res;
    }
    
	public boolean contains(int x){
		return a.contains(x);
	}
	
    public void insertElement(int x){
		if(x < 0) throw new IllegalArgumentException("Argument too small");
		if(x > 99) throw new IllegalArgumentException("Argument too big");
		if(this.contains(x))
			return;
		else
			a.add(x);
	}
    
    public void deleteElement(int x){
        a.remove((Object)x);
    }
    
    public String toString(){
		String res = "{";
		for(int item : this.a){
			res += (item + " ");
		}
        return res + "}";
    }
}