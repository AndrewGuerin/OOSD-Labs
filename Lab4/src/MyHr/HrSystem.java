package MyHr;

import java.util.Scanner;

public class HrSystem {

	public static void main(String[] args) {
		
		Office[] offices = new Office[3];
		
		for(int i=0; i<3; i++)
		{
			Office office = new Office(1);
			offices[i] = office;
		}

		while(true) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("MENU SYSTEM");
		System.out.println("1. List all Offices");
		System.out.println("2. Create employee record");
		System.out.println("3. List all employees");
		
		System.out.println("Pick one");
		int choice = scanner.nextInt();
		scanner.nextLine();
		
		switch(choice)
		{
		case 1:
			System.out.println("List all offices");
			
			for(int i = 0; i < 3; i++) {
				System.out.println(offices[i]);
			}
			
			break;
		case 2:
			System.out.println("Create a new Employee record");
			break;
		case 3:
			System.out.println("List all employees");
			break;
		
		}
		}
		
		
		
	}

}
