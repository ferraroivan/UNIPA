package prg.es11;
import java.util.Objects;

public class Contatto implements Comparable<Contatto>{
	private String nome,cognome,telefono;
	
	public Contatto(){
		this("-","-","#");
	}
	
	public Contatto(String nome, String cognome, String telefono){
		this.nome=nome;
		this.cognome=cognome;
		this.telefono=telefono;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getCognome(){
		return cognome;
	}
	
	public int hashCode(){
		return Objects.hash(nome,cognome);
	}
	
	public int compareTo(Contatto altro){
		if(cognome.equals(altro.getCognome()))
			return nome.compareTo(altro.getNome());
		return cognome.compareTo(altro.getCognome());
	}
	
	public boolean equals(Object altro){
		Contatto c = (Contatto) altro;
		return c.getNome().equals(this.getNome()) && c.getCognome().equals(this.getCognome());
	}
	
	public String toString(){
		return getNome() + getCognome() + "(" + telefono +")";
	}
	public void stampaSeAmico(){
		
	}
	public void stampaSeCollega(){
			
	}
}