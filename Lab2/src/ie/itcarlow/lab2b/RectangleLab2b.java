package ie.itcarlow.lab2b;

public class RectangleLab2b {

	public static void main(String[] args) {
		Rectangle RecA = new Rectangle();
		RecA.setRecLength(4);
		RecA.setRecWidth(10);
		
		
		System.out.println("Rectangle length is " + RecA.getRecLength());
		System.out.println("Rectangle width is " + RecA.getRecWidth());
		System.out.println("Rectangle area is " + RecA.getArea());
		System.out.println("Rectangle perimeter is " + RecA.getPerimeter());

		RecA.printRectangle();
	}

}
