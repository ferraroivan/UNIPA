package elezioni;

public class Candidato extends Studente{
	private String lista;
	
	public Candidato(long matricola, long codiceDiControllo, String nome, String cognome, String lista){
		super(matricola, codiceDiControllo, nome, cognome);
		setLista(lista);
	}
	
	public void setLista(String lista){
		this.lista = lista;
	}
	
	public String getLista(){
		return lista;
	}
	
	public String toString(){
		return super.toString() + " Lista: " + getLista();
	}
}