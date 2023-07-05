package prg.es03;

public class Persona{
	public String nome;
	public String cognome;
	public int eta;

	public Persona(String n, String c, int e){
		nome = n;
		cognome = c;
		eta = e;
	}

	public Persona(){}

	public String toString(){
		return "Nome: " + nome + ", Cognome: " + cognome + ", Eta: " + eta;
	}

	public boolean equals(Persona p){
		Persona p2 = new Persona();
		if(p2.nome.equals(p.nome) && p2.cognome.equals(p.cognome) && p2.eta == p.eta){
			return true;
		}
		else{
			return false;
		}
	}
}