package sorting;

import java.util.Scanner;
public class Selection_sort {
	private static Scanner scan;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] arr=new int[5];

scan=new Scanner(System.in);
for(int i=0;i<arr.length;i++)
	{
	arr[i]=scan.nextInt();
	}
int temp;
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for(int i=0;i<=4;i++)
{
	System.out.print(arr[i]+" ");
}


	}

}
