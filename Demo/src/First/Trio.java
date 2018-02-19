package First;

import java.util.Scanner;

public class Trio {
	static Scanner scan;
	public static void main(String args[])
	{
		scan=new Scanner(System.in);
		int num=scan.nextInt();
		int a=0;
		int b=1;
		int c=1;
		int temp;
		System.out.print(a+" "+b+" "+c+" ");

		for(int i=1;i<=num;i++)
		{
			temp=a+b+c;
			a=b;
			b=c;
			c=temp;
			System.out.print(temp+" ");
		}
	}
	
}
