package prg.es11;

public class Collega extends Contatto{
	private String qualifica;
	
	public Collega(){
		
	}
	
	public Collega(String nome, String cognome, String numeroTelefono, String qualifica){
		super(nome,cognome,numeroTelefono);
		this.qualifica = qualifica;
	}
	
	public void stampaSeCollega(){
		System.out.println(this);
	}
	
	public String toString(){
		return super.toString() + "(" + qualifica + ")";
	}
}