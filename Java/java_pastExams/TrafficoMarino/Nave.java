package traffico;

import java.lang.Math;

public class Nave{
	private String codice;
	private double x;
	private double y;
	private double speed;
	private double length;
	private double width;
	private int direction; // between 0 and 359
	private int passangers;
	
	public Nave(String codice, double x, double y, double speed, double length, double width, int direction, int passangers){
		setCodice(codice);
		setX(x);
		setY(y);
		setSpeed(speed);
		setLength(length);
		setWidth(width);
		setDirection(direction);
		setPassangers(passangers);
	}
	
	public Nave(double x, double y){
		setX(x);
		setY(y);
	}
	
	public void avanza(){
		double x0 = 0, y0 = 0;
		x0 += getSpeed() * Math.cos(getDirection()*3.14/180);
		y0 += getSpeed() * Math.sin(getDirection()*3.14/180);
		System.out.println("X: " + x0 + " " + "Y: " + y0);
	}
	
	public double distanza(double x, double y){
		double dx = x - getX();
		double dy = y - getY();
		double distanza = Math.sqrt(dx*dx + dy*dy);
		return distanza;
	}
	
	// Setters
	public void setCodice(String codice){
		this.codice = codice;
	}
	
	public void setX(double x){
		this.x = x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public void setSpeed(double speed){
		this.speed = speed;
	}
	
	public void setLength(double length){
		this.length = length;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public void setDirection(int direction){
		if(direction >= 0 || direction <= 359){
			this.direction = direction;
		} else {
			System.out.println("Direction non valid");
		}
	}
	
	public void setPassangers(int passangers){
		this.passangers = passangers;
	}
	
	// Getters
	public String getCodice(){
		return codice;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public double getSpeed(){
		return speed;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getWidth(){
		return width;
	}
	
	public int getDirection(){
		return direction;
	}
	
	public int getPassangers(){
		return passangers;
	}
	
	public String toString(){
		return "Codice:" + getCodice() + " X:" + getX() + " Y:" + getY() + " Speed:" + getSpeed() + " Length:" + getLength() +
				" Width:" + getWidth() + " Direction:" + getDirection() + " Passangers:" + getPassangers();
	}
	
}