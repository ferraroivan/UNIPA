package prg.es09;

public class Complex extends Numero{
	private double reale;
	private double immaginario;
	
	public Complex(double re, double im){
		setReale(re);
		setImmaginario(im);
	}
	
	public Complex(double re){
		setReale(re);
	}
	
	public Complex(){
		
	}
	
	public Complex somma(Complex altro){
		Complex c = new Complex(altro.getReale() + this.getReale(), altro.getImmaginario() + this.getImmaginario());
		return c;
	}
	
	public Complex sottrai(Complex altro){
		Complex c = new Complex(altro.getReale() - this.getReale(), altro.getImmaginario() - this.getImmaginario());
		return c;
	}
	
	public Complex somma(Numero altro){
		if (altro instanceof Razionale) throw new ArithmeticException();
		else if(altro instanceof Complex){
			Complex c = (Complex) altro;
			Complex ris = new Complex(c.getReale() + this.getReale(), c.getImmaginario() + this.getImmaginario());
			return ris;
		}
		return null;
	}
	
	public Complex sottrai(Numero altro){
		if (altro instanceof Razionale) throw new ArithmeticException();
		else if(altro instanceof Complex){
			Complex c = (Complex) altro;
			Complex ris = new Complex(c.getReale() - this.getReale(), c.getImmaginario() - this.getImmaginario());
			return ris;
		}
		return null;
	}
	
	public String toString(){
		return getReale() + " + i" + getImmaginario();
	}
	
	public void setReale(double reale){
		this.reale = reale;
	}
	
	public void setImmaginario(double immaginario){
		this.immaginario = immaginario;
	}
	
	public double getReale(){
		return reale;
	}
	
	public double getImmaginario(){
		return immaginario;
	}
}
