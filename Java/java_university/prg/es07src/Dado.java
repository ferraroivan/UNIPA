package prg.es07;

public class Dado extends Randomizzatore{
	private final int side = 6;
	// private final int side = 6;
	
	public Dado(){
		
	}
	
	public int getSide(){
		return side;
	}
	
	// lancia 2 dadi
	public void lancia(){
		int dice1, dice2;
		int result;
		for(int i = 0;i<10;i++){
			dice1 = super.lancia(getSide());
			dice2 = super.lancia(getSide());
			result = dice1+dice2;
			System.out.print(result + " ");
		}
	}
	

	
	
}