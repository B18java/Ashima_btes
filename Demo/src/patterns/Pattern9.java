package patterns;

public class Pattern9 {

	public static void main(String arg[])
	{
		
		for(int i=7;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);	
			}
			System.out.println();
		}
		int count;
		for(int i=8;i<=13;i++)
		{
			count=1;
			for(int j=8;j<=i+1;j++)
			{
			System.out.print(count++);	
			}
			System.out.println();
		}
	}
}
