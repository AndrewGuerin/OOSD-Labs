package Lab15;

import java.util.Scanner;

public class VerifyTest {

	public static void main(String[] args) {
		
		int value;
		int low =1;
		int high =100;
		String password;
		
		while(true){

		Scanner in = new Scanner(System.in);
		Scanner pass = new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		value = in.nextInt();
		
		try {
			Verifier.verifyIntRange(value,low,high);
		} catch (OutOfRangeException e) {
			e.printStackTrace();
		}
		
		System.out.println("Please enter a pasword:");
		password = pass.nextLine();
		try{
			Verifier.verifyPasswordStrength(password);
		}
		catch(InvalidPasswordException e){
			e.printStackTrace();
		}
		System.out.println("Press any key to continue...");
		}//end loop
	}//end main

}//end class