package prg.es06;

public class Point3D extends Point2D{
	private double z;
	
	public void setZ(double z){
		this.z=z;
	}
	
	public double getZ(){
		return z;
	}
	
	public String toString(){
		return "(<" + super.getX() + ">,<" + super.getY() + ">,<" + getZ() + ">)";
	}
	
}