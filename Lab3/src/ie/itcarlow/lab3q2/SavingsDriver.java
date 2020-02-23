package ie.itcarlow.lab3q2;

public class SavingsDriver {

	public static void main(String[] args) {
		
		SavingsAccount Saver1 = new SavingsAccount(2000, 4);
		SavingsAccount Saver2 = new SavingsAccount(3000, 4);

		
		
		System.out.println("New Balance is " + Saver1.calculateMonthlyInterest());
		System.out.println("New Balance is " + Saver2.calculateMonthlyInterest());
	}

}
