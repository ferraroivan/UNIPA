package prg.es11;

public class Amico extends Contatto{
	private String address;
	
	public Amico(){
		
	}
	
	public Amico(String nome, String cognome, String numeroTelefono, String address){
		super(nome,cognome,numeroTelefono);
		this.address = address;
	}
	
	
	public void stampaSeAmico(){
		System.out.println(this);
	}
	
	
	public String toString(){
		return super.toString() + "(" + address + ")";
	}
}