package prg.es05;

public class Date{

	private int day;
	private int month;
	private int year;
	int[] daysOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	String[] months = {"Gennaio","Febbraio","Marzo","Aprile","Maggio",
					   "Giugno","Luglio","Agosto","Settembre","Ottobre",
					   "Novembre","Dicembre"};

	public Date(){}

	public Date(int day, int year){
		for(int i = 0;i<daysOfMonth.length;i++){
			if(day < daysOfMonth[i]){
				this.month = i+1;
				this.day = day;
				break;
			} else {
				day -= daysOfMonth[i];
			}
		}
		setYear(year);
	}

	public Date(int day, int month, int year){
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	public Date(int day, String month, int year){
		setDay(day);
		for(int i = 0;i<months.length;i++){
			if(month.equals(months[i])){
				this.month = i+1;
			}
		}
		setYear(year);
	}

	//Setters
	public void setDay(int day){
		for(int i = 0;i<daysOfMonth.length;i++){
			if(day == daysOfMonth[i]){
				day = i+1;
			}
			if(day < daysOfMonth[i]){
				this.day = day;
			}
			if(day > daysOfMonth[i]){
				throw new IllegalArgumentException();
			}

		}
	}

	public void setMonth(int month){
		if(month > 12){
			throw new IllegalArgumentException();
		} else {
			this.month = month;
		}
	}

	public void setYear(int year){
		this.year = year;
	}

	//Getters
	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	//Display
	public String stampa1(){
		int days = 0;
		for(int i=1;i<month;i++){
			days += daysOfMonth[i];
		}
		return (days+this.day) + " " + this.year;
	}

	public String stampa2(){
		return this.day + "/" + this.month + "/" + 
		String.valueOf(this.year).charAt(2) + 
		String.valueOf(this.year).charAt(3);
	}

	public String stampa3(){
		return this.day + " " + months[this.month-1] + " " + this.year;

	}

	public String toString(){
		return stampa3();
	}

	public boolean equals(Date date){
		return (this.day == date.getDay() && this.month == date.getMonth() && 
				this.year == date.getYear()) ? true : false;
	}
}