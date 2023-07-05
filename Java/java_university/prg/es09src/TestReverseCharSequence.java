package prg.es09;

public class TestReverseCharSequence{
	public static void main(String[] args){
		String s = "Questo è solo un esempio";
		ReversedString rs = new ReversedString(s);
		System.out.println(rs.subSequence(0,7));
	}
}