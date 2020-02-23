package shape;

public class Sphere extends ThreeDShape {
	private double radius;
	
	public Sphere(String name, String colour, double radius) {
		super(name, colour);
		this.radius = radius;
	}
	
	public double area() {
		return 4 * Math.PI * radius * radius;
	}
	
	public double volume() {
		return 4.0 /3 * Math.PI * radius * radius * radius;  
		//java will do integer division without 4.0
		//eg 4/3 will equal 1 instead of  1.33333
	}
	
	@Override
	public String toString() {    
	    return super.toString() + "\nShape radius = " + this.radius;
	}
}
