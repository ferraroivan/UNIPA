package prg.es07;

public class Randomizzatore{
	
	public int lancia(int n){
		int random = (int)(Math.random()*n+1);
		return random;
	}
}