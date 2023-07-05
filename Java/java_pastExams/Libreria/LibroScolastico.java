package libreria;

public class LibroScolastico extends Libro{
	private int numeroScuole;

	public LibroScolastico(int id, String title, String author, int numeroScuole){
		super(id,title,author);
		setNumeroScuole(numeroScuole);
	}

	public void setNumeroScuole(int numeroScuole){
		this.numeroScuole = numeroScuole;
	}
	public int getNumeroScuole(){
		return numeroScuole;
	}

	public String toString(){
		return super.toString() + " Scuole: " + getNumeroScuole();
	}

	public int hashCode(){
		return numeroScuole*31;
	}
	public boolean equals(LibroScolastico s){
		if(this.getNumeroScuole() == s.getNumeroScuole() && super.equals(s)){
			return true;
		} else {
			return false;
		}
	}
}