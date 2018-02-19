package patterns;

import java.util.Scanner;

public class Histrogram_horizontal {
private static Scanner scan;

public static void main(String[] args) {
		// TODO Auto-generated method stub
scan=new Scanner(System.in);
String str=scan.nextLine();
for(int j=0;j<str.length();j++)
{
	
int a=str.charAt(j)-48;

for(int i=1;i<=a;i++)
	{
	  System.out.print("*");
	}
System.out.println();
	}
	}
	}


