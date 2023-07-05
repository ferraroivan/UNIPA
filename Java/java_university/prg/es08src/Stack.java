package prg.es08;
import java.util.ArrayList;

public class Stack <T> {
	ArrayList<T> list = new ArrayList <>(100);
	
	public Stack(){
		
	}
	
	// add element at the end of the list
	public void push(T s){
		if(isFull()) throw new IllegalArgumentException("Stack full");
		else list.add(s); 

	}
	
	// remove the first element
	public void pop(){
		if(!isEmpty()) throw new IllegalArgumentException("Stack empty");
		else list.remove(0);
	}
	
	public boolean isEmpty(){
		boolean state = false;
		for(int i = 0; i < list.size();i++){
			if(list.get(i).equals(null)){
				state = true;
			} else{
				state = false;
			}
		}
		return state;
	}
	
	public boolean isFull(){
		boolean state;
		if(list.size() == 100){
			state = true;
		} else {
			state = false;
		}
		return state;
	}
	
	public String toString(){
		return "Stack\n" + list.toString();
	}
	
	public boolean equals(String s, String d){
		boolean state;
		if(s.equals(d)){
			state = true;
		} else {
			state = false;
		}
		return state;
	}
}