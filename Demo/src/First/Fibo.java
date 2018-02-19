package First;
import java.util.Scanner;
public class Fibo {

	private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
		int num=scan.nextInt();
		int a=0;
		int b=1;
		int temp=0;
		System.out.print(a+" "+b+" ");

		while(temp!=num)		
		{
			temp=a+b;
			a=b;
			b=temp;
			System.out.print(temp+" ");
		}

	}

}
