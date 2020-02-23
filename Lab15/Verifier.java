package Lab15;

public class Verifier {
	
	public static void verifyIntRange(int value, int low, int high) throws OutOfRangeException{
		
		if(value <low || value >high)throw new OutOfRangeException("Value is not in the range 1...100");
		else{
			System.out.println("Number in range!!!");
		}
		
	}
	
	public static void verifyPasswordStrength(String password) throws InvalidPasswordException{
		 if(password.length()<8) throw new InvalidPasswordException(password + " is not strong enough!");
		 else{
			 System.out.println("Good password.");
		 }
	}

	
}//end class