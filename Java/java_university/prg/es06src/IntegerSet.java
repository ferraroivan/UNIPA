package prg.es06;

public class IntegerSet{
    private boolean a[] = new boolean[100];
    
    public IntegerSet(){
        ;
    }
    
    public IntegerSet unionOfIntegerSet(IntegerSet altro){
		IntegerSet res = new IntegerSet();
		for(int i = 0 ; i<100; ++i){
			if(this.contains(i) || altro.contains(i)) res.insertElement(i);
		}
        return res;
    }

    public IntegerSet intersectionOfIntegerSet(IntegerSet altro){
		IntegerSet res = new IntegerSet();
		for(int i = 0 ; i<100; ++i){
			if(this.contains(i) && altro.contains(i)) res.insertElement(i);
		}
        return res;
    }
    
	public boolean contains(int x){
		return a[x];
	}
	
    public void insertElement(int x){
		if(x < 0) throw new IllegalArgumentException("Argument too small");
		if(x > 99) throw new IllegalArgumentException("Argument too big");
		else {
			a[x] = true;
		}
    }
    
    public void deleteElement(int x){
        a[x] = false;
    }
    
    public String toString(){
		String res = "{";
		for(int i = 0; i<99; ++i){
			if(this.contains(i)) res += (i + " ");
		}
        return res + "}";
    }
}