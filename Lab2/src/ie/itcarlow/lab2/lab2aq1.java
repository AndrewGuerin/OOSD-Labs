package ie.itcarlow.lab2;

public class lab2aq1 {

	public static void main(String[] args) 
	
	{
	
		HotelRoom roomA = new HotelRoom();
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setRoomAvail(1);
		roomA.setRate(100);
		
		
		HotelRoom roomB = new HotelRoom();
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setRoomAvail(0);
		roomB.setRate(80);
		
		HotelRoom roomC = new HotelRoom();
		
		
		System.out.println("Room A number is " + roomA.getRoomNumber() +" " + roomA.getRoomType()
		+ " " + roomA.getRoomAvail() + " " + roomA.getRate());
		System.out.println("Room B number is " + roomB.getRoomNumber() +" " + roomB.getRoomType()
		+ " " + roomB.getRoomAvail() + " " + roomB.getRate());
		
	}

}
