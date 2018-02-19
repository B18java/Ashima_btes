package patterns;

public class Pattern5 {
	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=7;i++)
		{
			for(j=6;j>=i;j--)
			{
				System.out.print("1");
			}
			
				for(int k=1;k<=i;k++)
				{
					System.out.print(i);
			}
				System.out.println();
		}
	}

}
