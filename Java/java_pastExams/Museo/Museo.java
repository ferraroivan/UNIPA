package museo.prg;
import java.util.ArrayList;
import java.util.Iterator;

public class Museo{
	ArrayList<Object> list = new ArrayList<>();
	//ArrayList<OperaDArte> list2 = new ArrayList<>();
	//ArrayList<Scultura> list3 = new ArrayList<>();
	private String name;
	private String address;
	
	public Museo(String name, String address){
		setName(name);
		setAddress(address);
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAddress(){
		return address;
	}
	
	
	// stampare lista opere
	public void stampa(){
		System.out.println(getName() + " " + getAddress());
		for(int i = 0; i < list.size(); i++){
			System.out.println(i + " " + list.get(i));
		}
	}
	
	// add opera
	public void addDipinto(String titolo, String autore, String dataDiCreazione, int altezza, int larghezza, String tecnica){
		Dipinto d = new Dipinto(titolo, autore, dataDiCreazione, altezza, larghezza, tecnica);
		list.add(d);
	}
	
	public void addOperaDArte(String titolo, String autore, String dataDiCreazione){
		OperaDArte o = new OperaDArte(titolo, autore, dataDiCreazione);
		list.add(o);
	}
	
	public void addScultura(String titolo, String autore, String dataDiCreazione, String materiale, int altezza){
		Scultura s = new Scultura(titolo, autore, dataDiCreazione, materiale, altezza);
		list.add(s);
	}
	
	// remove opera
	public void removeOpera(String r){
		for(int i = 0; i < list.size(); i++){
			if(r.equals(list.get(i))){
				list.remove(i);
			}
		}
	}

}