package prg.es07;
import prg.es05.Persona;

public class AbbonatoPremium extends Abbonato{
	private final int SPESA = 100;
	private double spesa = 0;
	
	public AbbonatoPremium(){
		
	}
	
	public AbbonatoPremium(Persona persona){
		this(persona.getNome(),persona.getCognome(),persona.getEta());
	}
	
	public AbbonatoPremium(String nome, String cognome, int eta){
		super(nome,cognome,eta);
	}
	
	public double getSpesa(){
		return spesa;
	}
	
	public double acquista(double costo){
		double contoScontato = super.acquista(costo);
		spesa += costo;
		if(spesa/SPESA > 1){
			contoScontato = contoScontato - (5 * ((int)(spesa/SPESA)));
			spesa = spesa - (100 * ((int)(spesa/SPESA)));
		}
		return contoScontato;
	}
	
	public String toString(){
		return super.toString() + " Spesa per bonus: " + this.spesa;
	}
}