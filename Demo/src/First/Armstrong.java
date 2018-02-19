package First;
import java.util.*;
public class Armstrong {

	private static Scanner scan;

	public static void main(String[] args) {
		scan=new Scanner(System.in);
		int num=scan.nextInt();
		int sem;
		int rem=sem=num;
		int count=0;
		int a,r=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
	while(rem!=0)
		{
			a=rem%10;
			r+=Math.pow(a,count);
			rem=rem/10;
		}
	if(sem==r)
	{
		System.out.println("Armstrong");
	}
	else
	{
		System.out.println("Not Armstrong");

	}
	}
}
