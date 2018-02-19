package First;

import java.util.Scanner;

public class Conversion {
	static Scanner scan;
	public static void main(String args[])
	{
		scan=new Scanner(System.in);
		int dnum=scan.nextInt();
		int rem;
		int a=0;
		while(dnum!=0)
		{
		rem=dnum%2;
		a=a*10+rem;
		
		dnum=dnum/2;
		}
		System.out.print(a);
		}
	
}
