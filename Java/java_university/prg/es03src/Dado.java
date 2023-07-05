package prg.es03;
import java.lang.Math;

public class Dado{

	public int lancia(){
		int d = (int)(Math.random()*6+1);
		return d;
	}
}