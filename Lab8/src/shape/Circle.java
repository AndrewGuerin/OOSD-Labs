package shape;

public class Circle extends TwoDShape {
	private double radius;
	
public Circle(String name, String colour, double radius) {
	super(name, colour);
	this.radius = radius;
}

public double area() {
	return Math.PI * radius * radius;  //get the area
}


@Override
public String toString() {    
    return super.toString() + "\nShape radius = " + this.radius;
}
}
