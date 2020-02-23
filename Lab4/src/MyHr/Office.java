package MyHr;

public class Office {

		//variables
	private static int nextRoomNum=100;
	private int roomNum;
	private Employee employee1;
	private Employee employee2;
	
	
	
		
		
	//constructors 
	

	public Office(int roomNum)
	{
		this.roomNum = (nextRoomNum);
		nextRoomNum++;
	}
	
		
		

	//Getters and Setters  //what is encapsulation????? learn
	
		
	//Misc methods 
		
		


	//to String  
		public String toString() {
			return "office number = " + roomNum;
		}
		
	
	
}
