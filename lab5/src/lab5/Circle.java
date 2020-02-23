package lab5;

public class Circle extends Point {

	private int radius;

	
	//constructors
	public Circle(int radius, int x, int y) {
	super(x,y);
	setRadius(radius);
	}
		
	//setters and getters 
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
		}
	
	
	//misc methods 
	
	//to String
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + "]";
	}
	
	
}
