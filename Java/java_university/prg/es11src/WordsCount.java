package prg.es11;
import java.util.Map;
import java.util.HashMap;
import java.lang.String;
import java.util.Scanner;

public class WordsCount{
	public static void main(String[] args){
		Map<String,Integer> map = new HashMap<String,Integer>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String s = input.next();
		String[] x = s.split("[a-zA-Z_0-9]");
		for(int i = 0;i<x.length;i++){
			map.put(x[i],i);
		}
		
		for(Map.Entry m : map.entrySet()){
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}

/*
Scrivete un programma che, utilizzando il metodo split su una stringa contenente il testo di questo esercizio, determina il numero totale di parole presenti nel testo e la parola che compare con maggiore frequenza. Potreste anche pensare di utilizzare una Map<String, Integer> per memorizzare la frequenza di ciascuna parola utilizzando la parola stessa come chiave. Stampate, infine, la frequenza di ciascuna parola mostrando le parole in ordine alfabetico
*/




