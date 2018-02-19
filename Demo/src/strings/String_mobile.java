package strings;

import java.util.Scanner;

public class String_mobile {
	private static Scanner scan;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scan=new Scanner(System.in);
long l=scan.nextLong();
int count=0;
//int x=68;
String str=String.valueOf(l);
for(int i=0;i<str.length();i++)
{
	
	
count=0;

	for(int j=0;j<str.length();j++)
	{
		
	if(str.charAt(i)==str.charAt(j))
	{
		count++;

		}

}
	
	System.out.println(str.charAt(i)+" occurs "+count+" times");


}

	}
}
