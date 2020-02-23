package lab6;

public class Student extends Person{
	//variables
	private static int numCourses;
	private String[] courses;
	private int[] grades;
	
	//constructors
	public Student(String name, String address) {
		super(name, address);	//hand off names and address to the super class constructor
		numCourses = 0;
		courses = new String[5];
		grades = new int[5];
		}
	//getters and setters
	public static int getNumCourses() {
		return numCourses;
	}
	//misc methods
	public void addCourseGrade(String course, int grade) {
		numCourses++;
		courses[numCourses -1] = course;
		grades[numCourses -1] = grade;
	}
	
	
	public void printGrades() {
		for(int i=0; i < numCourses; i++ ) {
			System.out.println(courses[i] + ": " + grades[i]);
		}
	}
	
	public double getAverageGrades() {
		double sum = 0.0;
		for(int i = 0; i < numCourses; i++) {
			sum += grades[i];
		//	sum = sum + grades[i];
		}
		return sum / numCourses;
		//or
		//double avg = sum / numCourses;
		//return avg;
		
	}
	//to string
	public String toString() {
	 return super.toString() + ", numCourses = " + numCourses;
	}
	
}
