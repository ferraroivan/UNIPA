package museo.prg;

public class Scultura{
	private String titolo;
	private String autore;
	private String dataDiCreazione;
	private String materiale;
	private int altezza;
	
	public Scultura(){
		
	}
	
	public Scultura(String titolo, String autore, String dataDiCreazione, String materiale, int altezza){
		setTitolo(titolo);
		setAutore(autore);
		setDataDiCreazione(dataDiCreazione);
		this.materiale = materiale;
		this.altezza = altezza;
	}

	public void setTitolo(String titolo){
		this.titolo = titolo;
	}
	
	public void setAutore(String autore){
		this.autore = autore;
	}
	
	public void setDataDiCreazione(String dataDiCreazione){
		this.dataDiCreazione = dataDiCreazione;
	}
	
	public void setMateriale(String materiale){
		this.materiale=materiale;
	}
	
	public void setAltezza(int altezza){
		this.altezza = altezza;
	}

	public String toString(){
		return titolo + " " + autore + " " + dataDiCreazione + " " + materiale + " " + altezza;
	}

}