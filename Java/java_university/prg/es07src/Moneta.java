package prg.es07;

public class Moneta extends Randomizzatore{
	private final int face = 2;
	
	public Moneta(){
		
	}
	
	public int getFace(){
		return face;
	}
	
	public void lancia(){
		String head = "T";
		String tails = "C";
		int random;
		for(int i = 0; i< 10;i++){
			random = super.lancia(getFace());
			if(random == 1){
				System.out.print(head + " ");
			} else {
				System.out.print(tails + " ");
			}
		}
	}
}