package prg.es09;

public class Razionale extends Numero{

	private int numeratore;
	private int denominatore = 1;

	public Razionale(int n, int d){
		setNumeratore(n);
		setDenominatore(d);
	}

	public Razionale(){

	}

	// riduzione frazione
	private Razionale semplifica(int numeratore, int denominatore) {
		Razionale s;
		int n = numeratore, d = denominatore;
		if(numeratore > denominatore) {
			int i = 2;
			System.out.print("(" + numeratore + "/" + denominatore + ")");
			while(i <= d) {
				if(n % i == 0 && d % i == 0) {
					System.out.print(" = (" + n/i + "/" + d/i + ")");
					n /= i;
					d /= i;
				}
				else i++;
			}
		}
		else if (numeratore < denominatore) {
			System.out.print("(" + numeratore + "/" + denominatore + ")");
			int i = 2;
			while(i <= n) {
				if(n % i == 0 && d % i == 0) {
					System.out.print(" = (" + n/i + "/" + d/i + ")");
					n /= i;
					d /= i;
				}
				else i++;
			}
		}
		else System.out.println(" = " + 1);
		System.out.println("");
		s = new Razionale(n, d);
		return s;
	}

	// 4 Operazioni
	public Razionale somma(Numero r){
		int n = 0, d = 0;
		if(r instanceof Razionale){
			Razionale t = (Razionale) r;
			d = this.getDenominatore() * t.getDenominatore();
			n = (this.getNumeratore()*t.getDenominatore()) - (t.getNumeratore()*this.getDenominatore());
			return semplifica(n,d);
		}
		return null;
	}
	
	public Razionale sottrai(Numero s){
		int n = 0, d = 0;
		if(s instanceof Razionale){
			Razionale t = (Razionale) s;
			d = this.getDenominatore()*t.getDenominatore();
			n = this.getNumeratore() * t.getDenominatore() - this.getDenominatore() * t.getNumeratore();
			return semplifica(n,d);
		}
		return null;
	}
	public Razionale somma(Razionale s){
		Razionale c = new Razionale();
		c.setNumeratore(this.getNumeratore() * s.getDenominatore() + this.getDenominatore() * s.getNumeratore());
		c.setDenominatore(this.getDenominatore()*s.getDenominatore());
		return c;
	}



	public Razionale sottrai(Razionale s){
		Razionale c = new Razionale();
		c.setNumeratore(this.getNumeratore() * s.getDenominatore() - this.getDenominatore() * s.getNumeratore());
		c.setDenominatore(this.getDenominatore()*s.getDenominatore());
		return c;
	}

	
	public Razionale moltiplica(Razionale s){
		Razionale c = new Razionale();
		c.setNumeratore(this.getNumeratore()*s.getNumeratore());
		c.setDenominatore(this.getDenominatore()*s.getDenominatore());
		return c;
	}

	public Razionale dividi(Razionale s){
		Razionale c = new Razionale();
		c.setNumeratore(this.getNumeratore()*s.getDenominatore());
		c.setDenominatore(this.getDenominatore()*s.getNumeratore());
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
		if(denominatore != 0) this.denominatore = denominatore;
		else throw new ArithmeticException("Non puoi mettere zero a denominatore");
	}

	public String toString(){
		return "("+getNumeratore() + "/" + getDenominatore()+")";
	}
}
	
