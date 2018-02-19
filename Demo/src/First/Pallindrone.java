package First;

import java.util.Scanner;

public class Pallindrone {

	private static Scanner scan;

	public static void main(String args[])
{
	scan = new Scanner(System.in);
	int num=scan.nextInt();
	int real=num;
	int r=0;
	int a;
	while(num!=0)
	{
		a=num%10;
		r=r*10+a;
		num=num/10;
		
	}
	if(r==real)
	{
		System.out.println("pallindrone");
	}
	else
	{
		System.out.print("Not a pallindrone");
	}
}

	
}
