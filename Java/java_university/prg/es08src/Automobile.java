package prg.es08;

public class Automobile extends VeicoloAMotore{
	private String targa;
	
	public Automobile(){
		
	}
	
	public Automobile(Point2D posizione, Point2D velocitaIniziale, Point2D accelerazione, int cilindrata, String targa){
		super(posizione,velocitaIniziale,accelerazione,cilindrata);
		setTarga(targa);
	}
	
	public Automobile(double x0, double y0, double v0x, double v0y,double aX, double aY, int cilindrata, String targa){
		super(x0,y0,v0x,v0y,aX,aY,cilindrata);
		setTarga(targa);
	}
	
	public void setTarga(String targa){
		this.targa = targa;
	}
	
	public String getTarga(){
		return targa;
	}
	
	public String toString(){
		return "L'auto ha " + super.toString() + " numero di targa: "  + getTarga();
	}

}

/*
public Automobile(double x0, double y0, double v0x, double v0y,double aX, double aY, double cilindrata, String targa){
	super(x0,y0,v0x,v0y,aX,aY,cilindrata);
	setTarga(targa);
}

public void setTarga(String targa){
	this.targa = targa;
}

public String muovi(double t){
	double x = (x0 + v0x)*t + aX * t * t;
	double y = (y0 + v0y)*t + aY * t * t;
	return "X: " + x + " Y: " + y;
}*/