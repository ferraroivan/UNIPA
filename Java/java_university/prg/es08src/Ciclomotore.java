package prg.es08;

public class Ciclomotore extends VeicoloAMotore{
	private long numeroDiTelaio;
	
	public Ciclomotore(){
		
	}
	
	public Ciclomotore(Point2D posizione, Point2D velocitaIniziale, Point2D accelerazione, int cilindrata, long numeroDiTelaio){
		super(posizione,velocitaIniziale,accelerazione,cilindrata);
		setNumeroDiTelaio(numeroDiTelaio);
	}
	
	public Ciclomotore(double x0, double y0, double v0x, double v0y,double aX, double aY, int cilindrata, long numeroDiTelaio){
		super(x0,y0,v0x,v0y,aX,aY,cilindrata);
		setNumeroDiTelaio(numeroDiTelaio);
	}
	
	public void setNumeroDiTelaio(long numeroDiTelaio){
		this.numeroDiTelaio = numeroDiTelaio;
	}
	
	public long getNumeroDiTelaio(){
		return numeroDiTelaio;
	}
	
	public String toString(){
		return "Il ciclomotore ha " + super.toString() + " numero di telaio: " + getNumeroDiTelaio();
	}

}

/*
public Ciclomotore(double x0, double y0, double v0x, double v0y,double aX, double aY, double cilindrata, long numeroDiTelaio){
	super(x0,y0,v0x,v0y,aX,aY,cilindrata);
	setNumeroDiTelaio(numeroDiTelaio);
}

public void setNumeroDiTelaio(long numeroDiTelaio){
	this.numeroDiTelaio = numeroDiTelaio;
}

public String muovi(double t){
	double x = (x0 + v0x)*t + aX * t * t;
	double y = (y0 + v0y)*t + aY * t * t;
	return "X: " + x + " Y: " + y;
}*/