package libreria;

public class Libro extends Articolo{
	private String author;

	public Libro(){

	}

	public Libro(int id, String title, String author){
		super.setID(id);
		super.setTitle(title);
		setAuthor(author);
	}

	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String toString(){
		return super.toString() + " Autore: " + getAuthor() + "\n";
	}

	public int hashCode(){
		char[] temp = author.toCharArray();
		int count = 0;
		for(int i = 0; i<temp.length;i++){
			count = temp[i] * 31;
		}
		return count;
	}
	public boolean equals(Libro l){
		if(this.getAuthor().equals(l.getAuthor()) && super.equals(l)){
			return true;
		} else {
			return false;
		}
	}
}