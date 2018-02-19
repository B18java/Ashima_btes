package First;
import java.util.Scanner;
public class Length {

	private static Scanner scan;
	public static void main(String[] args) {
		
		scan=new Scanner(System.in);
	
		long num=scan.nextLong();
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println(count);
	

	}

}
