package Lab8q2;

public class Employee extends Person {
	private int salary;
	
	public Employee(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	public String getDescription() {
	return("An employee with a salary of " + salary); 
	}
}	
