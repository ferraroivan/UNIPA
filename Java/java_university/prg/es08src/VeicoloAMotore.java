package prg.es08;

public class VeicoloAMotore extends Veicolo{
	private int cilindrata;
	
	public VeicoloAMotore(){}
	
	public VeicoloAMotore(Point2D posizione, Point2D velocitaIniziale, Point2D accelerazione, int cilindrata){
		setPosizione(posizione.getX(), posizione.getY());
		setVelocitaIniziale(velocitaIniziale.getX(), velocitaIniziale.getY());
		setAccelerazione(accelerazione.getX(), accelerazione.getY());
		setCilindrata(cilindrata);
	}
	
	public VeicoloAMotore(double x0, double y0, double v0x, double v0y,double aX, double aY, int cilindrata){
		setPosizione(x0,y0);
		setVelocitaIniziale(v0x,v0y);
		setAccelerazione(aX,aY);
		setCilindrata(cilindrata);
	}
	
	public int getCilindrata(){
		return cilindrata;
	}
	
	public void setCilindrata(int cilindrata){
		this.cilindrata = cilindrata;
	}
	
	public void muovi(double deltaT){
		incrementaTempoTotale(deltaT);
		double t = getTempoTotale();
		double x = getPosizione().getX() + getVelocitaIniziale().getX() * t + getAccelerazione().getX() * t * t;
		double y = getPosizione().getY() + getVelocitaIniziale().getY() * t + getAccelerazione().getY() * t * t;
		setPosizione(x,y);
	}
	
	public String toString(){
		return super.toString() + " cilindrata: " + getCilindrata();
	}
}

/*
public VeicoloAMotore(double x0, double y0, double v0x, double v0y,double aX, double aY, int cilindrata){
	super(x0,y0,v0x,v0y,aX,aY);
	setCilindrata(cilindrata);
}

public void setCilindrata(int cilindrata){
	this.cilindrata = cilindrata;
}

public String muovi(double t){
	double x = (getX0() + getV0x())*t + getAx() * t * t;
	double y = (getY0() + getV0y())*t + getAy() * t * t;
	return "X: " + x + " Y: " + y;
}
*/
