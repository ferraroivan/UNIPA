package traffico;
import java.util.ArrayList;
import java.util.Iterator;

public class Porto{
	ArrayList<Nave> cala = new ArrayList<>();
	private final double DISTANZA = 100.0;
	
	public Porto(){
		
	}
	
	public void avanza(){
		for(int i = 0;i<cala.size();i++){
			Nave n = cala.get(i);
			n.avanza();
		}
	}
	
	public void addNave(String codice, double x, double y, double speed, double length, double width, int direction, int passangers){
		Nave n = new Nave(codice, x, y, speed, length, width, direction, passangers);
		cala.add(n);
	}
	
	public void removeNave(int index){
		cala.remove(index);
	}
	
	public void stampa(){
		for(Nave n : cala){
			System.out.println(n);
		}
	}
	
	public void prevenzioneCollisione(double x, double y){
		double distanza;
		for(int i = 0; i<cala.size(); i++){
			Nave n1 = cala.get(i);
			distanza = n1.distanza(x, y);
			if(distanza > DISTANZA){
				System.out.println("Warning, the ships are too close, imminent danger!!!");
			}
		}
	}
}