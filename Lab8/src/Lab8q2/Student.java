package Lab8q2;

public class Student extends Person {
	//varibales 
	private String course;
	
	//constructor
	public Student(String name, String course) {
		super(name);
		setCourse(course);
	}
	//abstract method
	public String getDescription() {
		return ("A student studying" + getCourse());
	}
	//getters and setters
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
