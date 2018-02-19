package First;

import java.util.Scanner;

public class Prime {

	private static Scanner scan;

	public static void main(String[] args) 
	{
		scan=new Scanner(System.in);
		int num=scan.nextInt();
		int count=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		
		if(count==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	
		
		}
	}

