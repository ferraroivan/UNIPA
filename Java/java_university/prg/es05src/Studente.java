package prg.es05;

public class Studente{
	private String name;
	private String surname;
	Date dateOfBirthday = new Date();

	public Studente(){
	}

	public Studente(String name, String surname, int day, int month, int year){
		setName(name);
		setSurname(surname);
		setDate(day, month, year);
	}

	// setters with validity check
	public void setName(String name){
		this.name = name;	
	}

	public void setSurname(String surname){
		this.surname = surname;
	}

	public void setDate(int day, int month, int year){
		dateOfBirthday.setDay(day);
		dateOfBirthday.setMonth(month);
		dateOfBirthday.setYear(year);
	}

	// getters
	public String getName(){
		return name;
	}

	public String getSurname(){
		return surname;
	}

	public String getDate(){
		return dateOfBirthday.stampa3();
	}

	public String toString(){
		return "Name: " + getName() + ", Surname: " + getSurname() + ", Date: " + getDate();
			   
	} 

	public boolean equals(Studente s){
		return (this.getName() == s.getName() && this.getSurname() == s.getSurname() &&
				this.getDate() == s.getDate()) ? true : false;
	}
}