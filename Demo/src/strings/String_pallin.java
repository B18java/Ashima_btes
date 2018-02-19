package strings;
import java.util.Scanner;
public class String_pallin {
private static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
scan=new Scanner(System.in);
String str=scan.nextLine();
int i,j;
int count=0;
//String str1;
for(i=str.length()-1,j=0;i>=str.length()/2;i--,j++)
{
	
	if(str.charAt(i)!=str.charAt(j))
	{
		count++;
		break;
	}
	
}
if(count!=0)
{System.out.println();
	System.out.print("not Pallindrome");
}
else
{
	System.out.println();

	System.out.println("Pallindrome");
}
}
}
