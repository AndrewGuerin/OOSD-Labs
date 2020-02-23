package MyHr;

public class Employee {

	//variables
	private static int nextEmployNum=1000;
	
	private Address address;
	private int employNum;
	private String empType;
	private static String compCar;
	
	
		
		
	//constructors 
	public Employee(Address address, String empType, String compCar) 
	{
		this.address = address;
		setEmpType(empType);
		
		this.employNum = nextEmployNum;
		nextEmployNum++;
		
		if(empType.equals("Manager")) //cant use == doesnt work well when comparing strings
		{
			this.compCar = compCar;
		}
	}
	
		
		

	//Getters and Setters  //what is encapsulation????? learn
	public int getEmployNum() {
		return employNum;
	}
	public void setEmployNum(int employNum) {
		this.employNum = employNum;
	}

	
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getCompCar() {
		return compCar;
	}
	public void setCompCar(String compCar) {
		Employee.compCar = compCar;
	}




	@Override
	public String toString() {
		return "Employee [employNum=" + getEmployNum() + ", empType=" + getEmpType() + "]";
	}
	
		
		
	//Misc methods 
		
		


	//to String  
		
}
