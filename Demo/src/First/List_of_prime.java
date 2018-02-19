package First;
import java.util.Scanner;

public class List_of_prime {

	static Scanner scan;
	public static void main(String args[])
	{
		scan=new Scanner(System.in);
		int num=scan.nextInt();
		int count;
		int temp=0;
		for(int i=2;i<=num;i++)
		{
			count=0;
			
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				temp++;
			}
			}
		System.out.println("the number of prime numebrs are"+temp);
	}
}
