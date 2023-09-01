package prg.es11;
import java.util.Collection;
import java.util.TreeSet;
import java.util.Iterator;

public class Rubrica{
	Collection<Contatto> dati;
	
	public Rubrica(){
		dati = new TreeSet<>();
	}
	
	public void aggiungi(Contatto c){
		dati.add(c);
	}
	
	public void stampaAmici(){
		Iterator<Contatto> it = dati.iterator();
		while(it.hasNext())
			it.next().stampaSeAmico();
	}
	
	public void stampaColleghi(){
		Iterator<Contatto> it = dati.iterator();
		while(it.hasNext())
			it.next().stampaSeCollega();
	}
	
	public void stampaContatti(){
		Iterator<Contatto> it = dati.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
	
	public Contatto trova(String nome, String cognome){
		Iterator<Contatto> it = dati.iterator();
		Contatto c;
		while(it.hasNext()){
			c = it.next();
			if(c.getNome().equals(nome) && c.getCognome().equals(cognome)){
				return c;
			}
		}
		return null;
	}
	
	public void cancella(){
		dati.clear();
	}
}
