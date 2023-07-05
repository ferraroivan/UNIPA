package prg.es11;
import java.util.ArrayList;

public class VectorInteger implements Comparable<VectorInteger>{
	ArrayList<Integer> list;
	
	public VectorInteger(){
		this(10);		
	}
	
	public VectorInteger(int x){
		list = new ArrayList<>();
		for(int i = 0;i<x;++i){
			list.add(0);
		}
	}
	
	public int size(){
		return list.size();
	}
	
	public void set(int index, int value){
		list.set(index, value);
	}
	
	public int get(int index){
		if(index >= this.size())
			throw new IndexOutOfBoundsException();
		return list.get(index);
	}
	
	// to check that the new VectorInteger is the same size of the others 2
	public VectorInteger sum(VectorInteger v1){
		if(this.size() != v1.size())
			throw new IllegalArgumentException();
		VectorInteger v2 = new VectorInteger();
		for(int i = 0;i<size();i++){
			v2.set(i, v1.get(i) + this.get(i));
		}
		return v2;
	}
	
	// to check that the new VectorInteger is the same size of the others 2
	public VectorInteger subtraction(VectorInteger v1){
		if(this.size() != v1.size())
			throw new IllegalArgumentException();
		VectorInteger v2 = new VectorInteger();
		for(int i = 0;i<size();i++){
			v2.set(i, this.get(i) - v1.get(i));
		}
		return v2;
	}
	
	// to check that the new VectorInteger is the same size of the others 2
	public int scalarProduct(VectorInteger v1){
		return 0;
	}
	
	public VectorInteger prodottoScalare(int x){
		return null;
	}
	
	public double modulo(){
		double ris = 0.0;
		for(int i =0;i<size();i++){
			ris += get(i)*get(i);
		}
		return Math.sqrt(ris);
	}
	
	public boolean equals(Object v){
		if(v == this)
			return true;
		if(!(v instanceof VectorInteger)){
			return false;
		}
		VectorInteger x = new VectorInteger();
		return this.list.equals(x.list);
	}
	
	public int hashCode(){
		int h = 0;
		for(int i = 0;i<size();i++){
			h += get(i);
		}
		return h;
	}
	
	public int compareTo(VectorInteger altro){
		if(this.equals(altro)){
			return 0;
		}
		if(this.modulo()>altro.modulo()){
			return 1;
		} else {
			return -1;
		}
	}
	
	public String toString(){
		return list.toString();
	}
	
}