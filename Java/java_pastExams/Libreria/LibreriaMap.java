package libreria;

import java.util.Map;
import java.util.HashMap;

public class LibreriaMap{
	Map<Articolo, Integer> map = new HashMap<Articolo, Integer>();
	public LibreriaMap(){

	}
	// add obj map
	public void add(Articolo a, int b){
		map.put(a,b);
	}
	// print map
	public void print(){
		System.out.println(map);
	}
	// libroscolastico with most used books
	public int mostBookUsed(){
		int count = 0;
		for(int i = 0;i<map.size();i++){
			if(map instanceof LibroScolastico){
				count++;
			}
			if(map.get(i).getTitle().equals("Extreme")){
				count++;
			}
		}
		return count;
	}

}