package patterns;

import java.util.Scanner;

public class Histogram_vertical {
	private static Scanner scan;
	
	public int max(int arr[])
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[0])
			{
				max=arr[i];
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Histogram_vertical obj=new Histogram_vertical();
		
		scan=new Scanner(System.in);
		String str=scan.nextLine();
		int j=0;
		/*System.out.println("Enter your range");
		int range=scan.nextInt();*/
		
		int[] a=new int[str.length()];
		
		while(j<str.length())
		{
			a[j]=str.charAt(j)-48;
			j++;
		
		}
		
		int max_1=obj.max(a);
		for(int k=0;k<max_1;k++)
		{
		for(int i=0;i<str.length();i++)
			{
			if(a[i]>0)
			{
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			
			}
			a[i]--;
			//System.out.print("a["+i+"] is"+a[i]);
			}
		
		System.out.println();
		
			}
			
	}
		}


