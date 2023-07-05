package prg.es07;
import java.util.ArrayList;
import java.util.Scanner;

public class Servizio{
	ArrayList<Abbonato> listaAbbonati;
	ArrayList<AbbonatoPremium> listaAbbonatiPremium;
	
	public Servizio(){
		listaAbbonati = new ArrayList<>();
		listaAbbonatiPremium = new ArrayList<>();
	}
	
	public void aggiungiAbbonato(Abbonato a){
		listaAbbonati.add(a);
	}

	public void aggiungiAbbonatoPremium(AbbonatoPremium a){
		listaAbbonatiPremium.add(a);
	}
	
	public void stampaAbbonati(){
		System.out.println("Lista Abbonati");
		for(int i = 0;i<listaAbbonati.size();i++){
			System.out.println(i + ")" + listaAbbonati.get(i));
		}
	}
	
	public void stampaAbbonatiPremium(){
		System.out.println("\nLista Abbonati Premium");
		for(int i = 0;i<listaAbbonatiPremium.size();i++){
			System.out.println(i + ")" + listaAbbonatiPremium.get(i));
		}
	}
	
	public Abbonato getAbbonato(int i){
		return listaAbbonati.get(i);
	}
	
	public AbbonatoPremium getAbbonatoPremium(int i){
		return listaAbbonatiPremium.get(i);
	}
	
	
	
}