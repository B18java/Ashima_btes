package strings;

import java.util.Scanner;


public class String_wordreverse {
	private static Scanner scan;
	
	
	public static void main(String args[])
	{
		int loc=0;
	 int count=0;
		String b="";
	
		scan=new Scanner(System.in);
		String str=scan.nextLine();
while(loc<str.length())
{
	
		while(str.charAt(count)!=' ')
		{
			count++;
			//System.out.println(i);
			//System.out.println("count="+count);
			if(count>=str.length())
			{	
				break;
			}
					}
		for(int j=count-1;j>=loc;j--)
		{
			b=b+str.charAt(j);
			//System.out.println(b);

		}
b=b+" ";
loc=count+1;
//System.out.println("loc= "+loc);

count++;
}
    System.out.print(b);
}
}
