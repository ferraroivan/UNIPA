package prg.es09;

import java.util.ArrayList;
import prg.es07.Abbonato;
import prg.es07.AbbonatoPremium;

public class Servizio{
	ArrayList<Abbonato> list;
	
	public Servizio(){
		list = new ArrayList<>();
	}
	
	public void addAbbonato(Abbonato abb){
		this.list.add(abb);
	}
	
	public void addAbbonato(String nome, String cognome, int eta, boolean abbonatoPremium){
		Abbonato abb;
		if(abbonatoPremium == true){
			abb = new AbbonatoPremium(nome, cognome, eta);
		} else {
			abb = new Abbonato(nome, cognome, eta);
		}
		this.list.add(abb);
	}
	
	public void deleteAbbonato(int id){
		this.list.remove(id);
	}
	
	public Abbonato getAbbonato(int id){
		return this.list.get(id);
	}
	
	public void printAbbonati(){
		int id = 1;
		System.out.println("Lista abbonati: ");
		for(Abbonato abb : this.list){
			if(!(abb instanceof AbbonatoPremium)){
				System.out.println(id+") "+abb);
			}
			id++;
		}
	}
	
	public void printAbbonatiPremium(){
		int id = 1;
		System.out.println("Lista abbonati premium: ");
		for(Abbonato abb : this.list){
			if(abb instanceof AbbonatoPremium){
				System.out.println(id+") "+abb);
			}
			id++;
		}
	}
}