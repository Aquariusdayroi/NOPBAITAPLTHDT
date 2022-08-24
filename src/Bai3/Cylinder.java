package Bai3;

public class Cylinder {
	private double r;
	private double h;
	public Cylinder(double r, double h) {
		this.r = r;
		this.h = h;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	public double getDienTichXQ( ) {
		return 2*Math.PI*r*h;
	}
	public double getDienTichTP() {
		return 2*Math.PI*r*(r+h);
	}
	public double getTheTich( ) {
		return Math.PI*r*r*h;
	}
}
