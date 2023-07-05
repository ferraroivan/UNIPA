package elezioni;

import java.util.ArrayList;

public class Seggio{
	ArrayList<Studente> s = new ArrayList<>();
	
	public Seggio(){
		Studente s1 = new Studente(731273, 100, "Ivan", "Ferraro");
		Studente s2 = new Studente(731274, 101, "Marco", "P");
		Studente s3 = new Studente(731275, 102, "Stanlio", "Ferraro");
		Studente s4 = new Studente(731276, 103, "Olio", "Ling");
		Studente s5 = new Studente(731277, 104, "Aglio", "Meng");
		Studente s6 = new Studente(731268, 105, "It", "Fang");
		Studente s7 = new Studente(731234, 106, "Post", "Fnag");
		Studente s8 = new Studente(731245, 107, "Ex", "Yuan");
		Studente s9 = new Studente(731223, 110, "On", "Failier");
		Studente s10 = new Studente(731234, 111, "Nuclear", "Fission");
		Candidato c1 = new Candidato(755234, 112, "Nuclear", "Fusion", "Matteotti");
		Candidato c2 = new Candidato(732234, 113, "Enzym", "Collateral", "Berlusconi");
		Candidato c3 = new Candidato(731634, 114, "Side", "Effect", "PD");
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		s.add(s7);
		s.add(s8);
		s.add(s9);
		s.add(s10);
		s.add(c1);
		s.add(c2);
		s.add(c3);		
	}
	
	public void stampa(){
		int j = 1;
		for(int i = 0;i<s.size();i++){
			System.out.println(j + ". " + s.get(i));
			j++;
		}
	}
	
	public void vota(int index){
		
		
	}
}