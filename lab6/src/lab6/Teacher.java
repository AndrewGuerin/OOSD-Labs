package lab6;

public class Teacher extends Person{
	//variables
	
	private static int numCourses;
	private String[] courses; 
	private static final int MAXCOURSES=5;
	
	// constructors
	public Teacher(String name, String address) {
		super(name, address);
		numCourses=0;
		courses = new String[MAXCOURSES];
	}
	//getters and setters
	public static int getNumCourses() {
		return numCourses;
	}
	//misc methods
	public boolean addCourse(String course) {

	for(int i=0;i<numCourses;i++) {
			if(courses[i].equals(course)) {
				return false;
			}
		}
		courses[numCourses]=course;
		numCourses++;
		return true;
	}
	
	public boolean removeCourse(String course) {
		int courseindex = numCourses;
		for(int i=0;i<numCourses;i++) { // loops through array
			if(courses[i].equals(course)) { //find position array is at, to then asign positon
				courseindex=i;
				break;
						
			}
		}
		if(courseindex == numCourses) { //check course index to see if there are courses in the array. if num course = 0 and course index = 0 then ther is none
			return false;
		}
		else {
			for(int i=0;i<numCourses;i++) {
				courses[i] = courses[i+1];
				return true;
			}
			numCourses--;
			return true;
		}
	}
	//to String
	public String toString() {
		 return super.toString() + ", numCourses = " + numCourses;
}
}





