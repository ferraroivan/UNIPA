package prg.es08;

public abstract class Veicolo{
	private Point2D posizione;
	private Point2D velocitaIniziale;
	private Point2D accelerazione;
	private double tempoTotale;
	
	public Veicolo(){
		posizione = new Point2D();
		velocitaIniziale = new Point2D();
		accelerazione = new Point2D();
	}
	
	abstract void muovi(double deltaT);
	
	public void incrementaTempoTotale(double deltaT){
		this.tempoTotale += deltaT;
	}
	
	public String toString(){
		return "Posizione: " + posizione.toString() + " velocita iniziale: " + velocitaIniziale.toString() + " accelerazione iniziale: " + accelerazione.toString();
	}
	
	public void stampaPosizione(){
		System.out.println(posizione);
	}
	
	// setters
	public void setPosizione(double x, double y){
		this.posizione.setX(x);
		this.posizione.setY(y);
	}
	
	public void setAccelerazione(double x, double y){
		this.accelerazione.setX(x);
		this.accelerazione.setX(y);
	}
	
	public void setVelocitaIniziale(double x, double y){
		this.velocitaIniziale.setX(x);
		this.velocitaIniziale.setY(y);			
	}
	
	// getters
	public Point2D getPosizione(){
		return posizione;
	}
	
	public Point2D getAccelerazione(){
		return accelerazione;
	}
	
	public Point2D getVelocitaIniziale(){
		return velocitaIniziale;
	}
	
	public double getTempoTotale(){
		return this.tempoTotale;
	}
	
}

/*
// posizione
private double x0;
private double y0;

// velocita iniziale
private double v0x;
private double v0y;

// accelerazione
private double aX;
private double aY;

public Veicolo(double x0, double y0, double v0x, double v0y,double aX, double aY){
	setPosizione(x0,y0);
	setVelocitaIniziale(v0x,v0y);
	setAccelerazione(aX,aY);
}

public String muovi(double t){
	double x = (x0 + v0x)*t + aX * t * t;
	double y = (y0 + v0y)*t + aY * t * t;
	return "X: " + x + " Y: " + y;
}

// Setters
public void setPosizione(double x0, double y0){
	this.x0 = x0;
	this.y0 = y0;
}

public void setVelocitaIniziale(double v0x, double v0y){
	this.v0x = v0x;
	this.v0y = v0y;
}

public void setAccelerazione(double aX, double aY){
	this.aX = aX;
	this.aY = aY;
}*/