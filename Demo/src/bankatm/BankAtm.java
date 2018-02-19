package bankatm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Invalid_amountException extends Exception
{

	Invalid_amountException()
	{
		super();
	}
}
public class BankAtm 
{
	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	static int atmpin;
	static double balance=10000;
	
	
	public void withdraw(double amount) throws  IOException
	{
		try
		{
			if(balance-amount<=500)
			{
				throw new Invalid_amountException();
			}
			else if(amount>balance)
			{
				throw new Invalid_amountException();
			}
			else
			{
				balance=balance-amount;
				System.out.print(balance_enquirey());
			}
		}
		catch(Exception e)
		{
			System.out.println("You cannot withdraw this amount");
		}
		
	
	}
	
		public void deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Your new balance is "+balance);
	}
	public double balance_enquirey()
	{ 
		return balance;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter your pin");
		atmpin=Integer.parseInt(br.readLine());
		System.out.println("Enter the amount you want to withdraw");
		double am=Integer.parseInt(br.readLine());
		
	new BankAtm().withdraw(am);
	new BankAtm().balance_enquirey();
	int count=1;
	System.out.println("Do you want to deposit money? y/n");
	char c=br.readLine().charAt(0);
	while(count!=0)
	{
		
	if(c=='y')
	{
		System.out.println("Enter the amount you want to deposit");
		double am1=Integer.parseInt(br.readLine());
		
		new BankAtm().deposit(am1);
	count=0;
		
		
	}
	else if(c=='n')
	{
		System.out.println("Thankyou");
	count=0;
		
	}
	
	else
	{
		System.out.print("Invalid choice.Please re-enter");
	count=1;
	}
		
		
	
	}

}
}