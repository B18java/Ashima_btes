package patterns;

public class Pattern4 
{
 
	public static void main(String args[])
	{
		int i,j;
		int a,b,temp;
		a=1;
		b=2;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				
				if(j==1)
				{ a=1;
					System.out.print(a+" ");
				}
				if(j==2)
				{
					b=2;
					System.out.print(b+" ");
				}
				if(j>=3)
				{
					temp=a+b;
					a=b;
					b=temp;
					System.out.print(temp+" ");
				}
				}
			
			System.out.println();
		}
		
		}
	}

