package prg.es05;

public class Razionale{

	private int numeratore;
	private int denominatore = 1;

	public Razionale(int n, int d){
		setNumeratore(n);
		setDenominatore(d);
	}

	public Razionale(){

	}

	// riduzione frazione
	private Razionale riduci(){
		if(this.getNumeratore()==0 || this.getDenominatore()==0){
			System.out.println("Numero non trovato");
			return this;
		}
		int min;
		if(this.numeratore <= this.denominatore){
			min = this.getNumeratore();
		} else {
			min = this.getDenominatore();
		}
		cerca_numeri_primi:
		for(int i = 2; i < min; i++){
			for(int j = 2; j < i; j++){
				if(i%j==0){
					continue cerca_numeri_primi;
				}
			}
			while(this.getNumeratore()%i==0 && this.getDenominatore()%i==0){
				this.setNumeratore(this.getNumeratore()/i);
				this.setDenominatore(this.getDenominatore()/i);
			}
		}
		return this;
	}

	// 4 Operazioni
	public Razionale somma(Razionale s){
		Razionale c = new Razionale();
		c.setNumeratore(this.getNumeratore() * s.getDenominatore() + this.getDenominatore() * s.getNumeratore());
		c.setDenominatore(this.getDenominatore()*s.getDenominatore());
		c.riduci();
		return c;
	}



	public Razionale sottrai(Razionale s){
		Razionale c = new Razionale();
		c.setNumeratore(this.getNumeratore() * s.getDenominatore() - this.getDenominatore() * s.getNumeratore());
		c.setDenominatore(this.getDenominatore()*s.getDenominatore());
		c.riduci();
		return c;
	}

	
	public Razionale moltiplica(Razionale s){
		Razionale c = new Razionale();
		if(this.getNumeratore() == 0 || s.getNumeratore() == 0) throw new ArithmeticException();
		else {
			c.setNumeratore(this.getNumeratore()*s.getNumeratore());
			c.setDenominatore(this.getDenominatore()*s.getDenominatore());
		}
		return c;
	}

	public Razionale dividi(Razionale s){
		Razionale c = new Razionale();
		if(this.getNumeratore() == 0 || s.getNumeratore() == 0) throw new ArithmeticException();
		else {
			c.setNumeratore(this.getNumeratore()*s.getDenominatore());
			c.setDenominatore(this.getDenominatore()*s.getNumeratore());
		}
		return c;
	}

	// Getters
	public int getNumeratore(){
		return numeratore;
	}

	public int getDenominatore(){
		return denominatore;
	}

	// Setters
	public void setNumeratore(int numeratore){
		this.numeratore = numeratore;
	}

	public void setDenominatore(int denominatore){
		if (denominatore == 0) throw new IllegalArgumentException();
		else this.denominatore = denominatore;
	}

	public String toString(){
		return "("+getNumeratore() + "/" + getDenominatore()+")";
	}
}