package ie.itcarlow.lab2;

public class HotelRoom {

	private int roomNumber;
	private String roomType;
	private int roomAvail;
	private double rate;
	
	
	
	public HotelRoom()			// constructor method #1
	{
		roomNumber = 0;
		roomType = "";
		roomAvail = 0;
		rate = 0;
	}
	
	
	public HotelRoom(int roomNum, String roomT, int roomAva, double roomRate)			// constructor method #1
	{
		roomNumber = roomNum;
		roomType = "";
		roomAvail = 0;
		rate = 0;
	}
	
	public void setRoomNumber (int roomNumb)
	{
		roomNumber = roomNumb;
	}

	public int getRoomNumber()
	{
		return roomNumber;
	}
	
	public void setRoomType (String roomTp)
	{
		roomType = roomTp;
	}

	public String getRoomType()
	{
		return roomType;
	}
	
	public void setRoomAvail (int roomOcc)
	{
		roomAvail = roomOcc;
	}
	
	public int getRoomAvail()
	{
		
		return roomAvail;
	}
	
	public void setRate (double roomRate)
	{
		rate = roomRate;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	
	
	
	
	
	
	
	
	}

