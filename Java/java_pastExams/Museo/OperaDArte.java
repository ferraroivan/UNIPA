package museo.prg;

public class OperaDArte{
	private String titolo;
	private String autore;
	private String dataDiCreazione;
	
	public OperaDArte(String titolo, String autore, String dataDiCreazione){
		setTitolo(titolo);
		setAutore(autore);
		setDataDiCreazione(dataDiCreazione);
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
	
	public String toString(){
		return titolo + " " + autore + " " + dataDiCreazione;
	}
}