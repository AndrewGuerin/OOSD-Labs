package Lab8q2;

public class TestPerson {

	public static void main(String[] args) {
		
		Person[] p = new Person[2];
		
		Employee emp = new Employee("Tom", 60000);
		
		Student stud = new Student("Mary", "Programing");
		
		p[0]=emp;
		p[1]=stud;
		
		for(Person i:p) {
			System.out.println(i.getName());
			System.out.println(i.getDescription());
		}
		

	}

}
