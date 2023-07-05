package libreria;

public abstract class Articolo{
	private int id;
	private String title;


	public int getID(){
		return id;
	}
	public String getTitle(){
		return title;
	}
	public void setID(int id){
		this.id = id;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public String toString(){
		return "ID: " + getID() + " Title: " + getTitle();
	}
	public int hashCode(){
		char[] temp = title.toCharArray();
		int count = 0,hash;
		for(int i = 0; i<temp.length;i++){
			count = temp[i] * 31;
		}
		hash = count + id*31;
		return hash;
	}
	public boolean equals(Articolo a){
		if(this.getID() == a.getID() && this.getTitle().equals(a.getTitle())){
			return true;
		} else {
			return false;
		}
	}
}