package Exam;

public class Cylinder extends Circle{
	private double height = 1.0;

	public Cylinder() {
		super();
	}
	
	public Cylinder(double radius) {
		super(radius);
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return this.getArea() * this.getHeight();
	}

	@Override
	public String toString() {
		return "Cylinder with radius" + this.getRadius() + ", which is a subclass of " + super.toString();
	}
	
	
}
