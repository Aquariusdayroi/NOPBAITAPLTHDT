package Bai2;

public class Point {
	private double x;
	private double y;
	private double z;
	private String name;
	
	public Point(double x, double y, double z, String name) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.name = name;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Point Negative() {
		Point p = new Point(-x, -y, -z, "~"+name) ;
		return p;
	}
	public  Double getDistance () {
		return Math.sqrt(x*x+y*y+z*z);
	}
	public String toString() {
		// TODO Auto-generated method stub
		return name+"("+x+","+y+","+z+")";
	}
}
