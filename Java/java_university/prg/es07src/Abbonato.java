package prg.es07;
import prg.es05.Persona;

public class Abbonato extends Persona{
	private double sconto = 0.05;
	
	public Abbonato(){
		
	}
	
	public Abbonato(Persona persona){
		// call the methods, litsted below
		this(persona.getNome(), persona.getCognome(), persona.getEta());
	}
	
	public Abbonato(String nome, String cognome, int eta){
		// call the method of Persona()
		super(nome,cognome,eta);
	}
	
	public void setSconto(double sconto){
		this.sconto = sconto;
	}
	
	public double getSconto(){
		return sconto;
	}
	
	public double acquista(double total){
		return total*(1.0 - sconto);
	}	
	
	public String toString(){
		return super.toString() + ", Sconto: " + this.sconto*100 + "%";
	}
}