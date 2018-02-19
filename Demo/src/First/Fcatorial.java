package First;
import java.util.Scanner;
public class Fcatorial {

	private static Scanner scan;
	public static void main(String[] args) {
		scan=new Scanner(System.in);
int no=1;
		int num=scan.nextInt();
		for(int i=1;i<=num;i++)
		{
			no=no*i;
		}
	System.out.println(no);
	}

}
