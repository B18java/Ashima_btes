package sorting;

import java.util.Scanner;

public class Quick_sort {
private static Scanner scan;
static int lower[]=new int[5];
static int upper[]=new int[5];
static int top=0;

static int n=5;
static int[] arr=new int[n];


Quick_sort()
{
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
}
/*public void push()
{
	top++;
	
	if(n>0)
	{
	lower[top]=0;
	upper[top]=n-1;

	}
	
}*/

	public static void main(String[] args) {
	 scan=new Scanner(System.in);
		// TODO Auto-generated method stub
Quick_sort o=new Quick_sort();
Quick o1=new Quick();
//o.push();
top++;

if(n>0)
{
lower[top]=0;
upper[top]=n-1;

}
int beg,end;
while(top>0)
{
	beg=lower[top];
	end=upper[top];
	top--;
	System.out.println(top);
	int loc1=o1.quick(arr, beg, end);
	if(beg<loc1-1)
	{
		top++;
		lower[top]=beg;
		upper[top]=loc1-1;
		
	}
	if(end>loc1+1)
	{
		top++;
		lower[top]=loc1+1;
		upper[top]=end;
		
	}
}



for(int i=0;i<arr.length;i++)
{
	arr[i]=scan.nextInt();
}
	}
}

