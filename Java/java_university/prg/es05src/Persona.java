package prg.es05;

public class Persona{
	private String nome;
	private String cognome;
	private int eta;

	public Persona(String n, String c, int e){
		setNome(n);
		setCognome(c);
		setEta(e);
	}

	public Persona(){}

	// Setters
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCognome(String cognome){
		this.cognome = cognome;
	}
	public void setEta(int eta){
		this.eta = eta;
	}

	// Getters
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	public int getEta(){
		return eta;
	}


	public String toString(){
		return "Nome: " + getNome() + ", Cognome: " + getCognome() + ", Eta: " + getEta();
	}

	public boolean equals(Persona p){
		Persona p2 = new Persona();
		if(p2.getNome().equals(p.getNome()) && p2.getCognome().equals(p.getCognome()) && p2.getEta() == p.getEta()){
			return true;
		}
		else{
			return false;
		}
	}
}