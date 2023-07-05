package elezioni;

public class Studente{
	private long matricola;
	private long codiceDiControllo;
	private String nome;
	private String cognome;
	
	public Studente(long matricola, long codiceDiControllo, String nome, String cognome){
		setMatricola(matricola);
		setCodiceDiControllo(codiceDiControllo);
		setNome(nome);
		setCognome(cognome);
	}
	
	// Setters
	public void setMatricola(long matricola){
		this.matricola = matricola;
	}
	public void setCodiceDiControllo(long codiceDiControllo){
		this.codiceDiControllo=codiceDiControllo;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setCognome(String cognome){
		this.cognome=cognome;
	}
	
	// Getters
	public long getMatricola(){
		return matricola;
	}
	public long getCodiceDiControllo(){
		return codiceDiControllo;
	}
	public String getNome(){
		return nome;
	}
	public String getCognome(){
		return cognome;
	}
	
	public String toString(){
		return "Matricola: " + getMatricola() + " Codice di Controllo: " + getCodiceDiControllo() + 
				" Nome: " + getNome() + " Cognome: " + getCognome();
	}
}