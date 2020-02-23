package shape;

public class Cylinder extends ThreeDShape {
	private double radius;
	private double height;
	
	public Cylinder(String name, String colour, double radius, double height) {
		super(name, colour);
		this.radius = radius;
		this.height = height;
	}
	
	public double area() {     // assume we want surface area    //brackets for presedence
		return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
	}
	
	public double volume() {
		return Math.PI * radius * radius * height;
	}

	@Override
	public String toString() {    
	    return super.toString() + "\nShape radius = " + this.radius + "\nShape height = " + this.height;
	}
}
