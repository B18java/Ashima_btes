package sorting;

import java.util.Scanner;

public class Insertion_sort {
	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
int temp;
		scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
			{
			arr[i]=scan.nextInt();
			for(int j=0;j<i;j++)
			{
				if(arr[i]<arr[j])
				{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
				}
				}
			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]);
			}
			System.out.println();
				}
			
	
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
