package prg.es04;

public class Persona{
	public Persona(){}
	
	public Persona(String n, String c, int e){
		setNome(n);
		setCognome(c);
		setEta(e); // eta = e
	}
	
	public int getEta(){
		return this.eta;
	}
		
	public void setEta(int x){
		this.eta = x;
	}
	
	public String getNome(){
		return this.nome;
	}
		
	public void setNome(String s){
		this.nome = s;
	}
			
	public String getCognome(){
		return this.cognome;
	}
		
	public void setCognome(String s){
		this.cognome = s;
	}
			
	public String toString(){
		return (this.nome + " " + this.cognome + "(" + this.eta + ")");
	}
	
	public boolean equals(Persona altro){
		return (this.nome.equals(altro.nome) && this.cognome.equals(altro.cognome) && (this.eta == altro.eta));
	}
	
	private String nome, cognome;
	private int eta;
	
	
	
}