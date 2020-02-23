package ie.itcarlow.lab3q2;

public class SavingsAccount {
	
	private int AccNumber;
	private static double annualInterestRate;
	private double AccBalance;
	private int percent;
	
	
	public SavingsAccount()
	{
		AccBalance = 0;
		percent = 0;
		AccNumber = 0;
		annualInterestRate = 0;
		
	}
	
	public SavingsAccount(double balance, int interest)
	{
		AccBalance = balance;
		
		annualInterestRate = 4;
		
	}
	
	
	public double calculateMonthlyInterest()
	{
		double interest;
		interest = (AccBalance * annualInterestRate) / 12;
		
		AccBalance = AccBalance + interest;
		return AccBalance;
	}
	
	public double getMonthlyInterest()
	{
		return AccBalance;
	}
	
	public static void modifyInterestRate(int newInterestRate)
	{
		annualInterestRate = newInterestRate;
		
	}
	
	
	
	public void setAnnualInterestRate(double interest)
	{
		annualInterestRate = interest;
	}
	
	public double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	
	
	
	
	
	
	
	
	
	
}
