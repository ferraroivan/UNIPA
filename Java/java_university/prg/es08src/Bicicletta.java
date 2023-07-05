package prg.es08;

public class Bicicletta extends Veicolo{
	private String modello;
	
	public Bicicletta(){
		
	}
	
	public Bicicletta(double x0, double y0, double v0x, double v0y,double aX, double aY, String modello){
		setPosizione(x0,y0);
		setVelocitaIniziale(v0x,v0y);
		setAccelerazione(aX,aY);
		setModello(modello);
	}
	
	public Bicicletta(Point2D posizione, Point2D velocitaIniziale, Point2D accelerazione, String modello){
		setPosizione(posizione.getX(), posizione.getY());
		setVelocitaIniziale(velocitaIniziale.getX(), velocitaIniziale.getY());
		setAccelerazione(accelerazione.getX(), accelerazione.getY());
		setModello(modello);
	}
	
	public void muovi(double deltaT){
		incrementaTempoTotale(deltaT);
		double t = getTempoTotale();
		double x = getPosizione().getX() + getVelocitaIniziale().getX() * t + getAccelerazione().getX() * t * t;
		double y = Math.cos(x);
		setPosizione(x,y);
	}
	
	public void setModello(String modello){
		this.modello = modello;
	}
	
	public String getModello(){
		return modello;
	}
	
	public String toString(){
		return "La bici ha " + super.toString() + " modello: " + getModello();
	}

}

/*
public Bicicletta(double x0, double y0, double v0x, double v0y,double aX, double aY, String modello){
	super(x0,y0,v0x,v0y,aX,aY);
	setModello(modello);
}

public void setModello(String modello){
	this.modello = modello;
}

public String muovi(double t){
	double x = (x0 + v0x)*t + aX * t * t;
	double y = (y0 + v0y)*t + aY * t * t;
	return "X: " + x + " Y: " + y;
}*/