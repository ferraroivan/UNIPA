package museo.prg;

public class Dipinto{
	private int altezza;
	private int larghezza;
	private String tecnica; //= {"olio", "tempera", "litografia", "serigrafia", "china"};
	private String titolo;
	private String autore;
	private String dataDiCreazione;
	
	public Dipinto(String titolo, String autore, String dataDiCreazione, int altezza, int larghezza, String tecnica){
		setTitolo(titolo);
		setAutore(autore);
		setDataDiCreazione(dataDiCreazione);
		setAltezza(altezza);
		setLarghezza(larghezza);
		setTecnica(tecnica);
	}
	
	public void setAltezza(int altezza){
		this.altezza= altezza;
	}
	
	public void setLarghezza(int larghezza){
		this.larghezza = larghezza;
	}
	
	public void setTecnica(String tecnica){
		this.tecnica = tecnica;
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
		return titolo + " " + autore + " " + dataDiCreazione + " " + altezza + "x" + larghezza + " " + tecnica;
	}
}