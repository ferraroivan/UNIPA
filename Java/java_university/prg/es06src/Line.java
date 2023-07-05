package prg.es06;

public class Line{
	Point2D p1 = new Point2D();
	Point2D p2 = new Point2D();
	
	public Line(){
		
	}
	
	public Line(double x1, double y1, double x2, double y2){
		p1.setX(x1);
		p1.setY(y1);
		p2.setX(x2);
		p2.setY(y2);
	}
	
	public double distance(Point2D p){
		return Math.sqrt(Math.pow(p1.getX()-p.getX(), 2) + Math.pow(p1.getY()-p.getY(), 2));
	}
}