package prg.es09;
import java.lang.CharSequence;
import java.lang.String;

public class ReversedString implements CharSequence{
	private String s;
	
	public ReversedString(String s){
		setString(s);
	}
	
	public ReversedString(){
		
	}
	
	@Override
	public ReversedString subSequence(int start, int end){
		if(start == end){
			return null;
		}
		if(start < 0 || end < 0){
			throw new IndexOutOfBoundsException("Index array negative");
		}
		if(start > end){
			throw new IndexOutOfBoundsException("Start greater than end");
		}
		ReversedString res;
		String rev = "";
		char[] ch = this.toString().toCharArray();
		int size = ch.length;
		int inizio = size - start;
		int fine = size - end;
		for(int i = inizio - 1; i > fine; i--){
			rev+=ch[i];
		}
		res = new ReversedString(rev);
		return res;
	}
	
	@Override
	public char charAt(int index){
		char[] x = s.toCharArray();
		return x[index-1];
	}
	
	public void setString(String s){
		this.s = s;
	}
	
	@Override
	public int length(){
		int i = 0;
		for(char character : s.toCharArray()){
			i++;
		}
		return i;
	}
	
	@Override 
	public String toString(){
		return s;
	}
}