package ie.itcarlowlab9q2;

public class Car extends RoadVehicle{
	private String carType;
 
	public Car() {
	 	this("", 0, 0);
	 	}
 
	public Car(String c, int w, int p) { 
		super(w, p);
		setType(c);
	}
 
	public void setType(String t)  {
		carType = t;
	}
 
	public String getType() {
		return carType;
	}
	
	//misc methods 
		public void calculateDuty() {
			System.out.println("Car Tax is: " + 120 * CARTAXRATE);
		}
}