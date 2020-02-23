package ie.itcarlow.lab2b;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	private double perimeter;
	


	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	public Rectangle(double rLength, double rWidth, double rArea, double rPerimeter)
	{
		length = rLength;
		width = rWidth;
	}

	public void setRecLength(double rLength)
	{
		length = rLength;
		
		if (rLength > 0 && rLength <40)
			{
				length = rLength;
			}
			else
			{
					System.out.println("Enter a value between 0 and 40");
				
			}
	}
	public double getRecLength()
	{
		return length;
	}

	public void setRecWidth(double rWidth)
	{
		if (rWidth > 0 && rWidth < 40)
		{
			width = rWidth;
		}
		else
		{
				System.out.println("Enter a value between 0 and 40");
			
		}
	}
	public double getRecWidth()
	{
		return width;
	}

	

	public double getArea()
	{
		area = (length * width);
		
		return area;
	}

	
	public double getPerimeter()
	{
		perimeter = (length * 2 + width * 2);
		return perimeter;
	}
	
	public void printRectangle()
	{
		for(int i = 0; i < length; i++)
		{
			//Print length on the right side
			System.out.print("*");
			
			//ONLY print width at the top and bottom line
			if(i == 0 || i == length - 1)
			{
				//prints width top and bottom line
				for(int j = 0; j < width -2  ; j++)
				{
					System.out.print("*");
				} //end of inner for loop
				
			}
			else
			{
				//print the space in between
				for(int k = 0;  k < width -2 ; k++)
				{
					System.out.print(" ");
				}//end of inner for loop
			}
				
			//Print left side of the length
			System.out.println("*");
			
		}
	}
	
	
	
	
}