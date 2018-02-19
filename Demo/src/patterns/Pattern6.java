package patterns;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=1;i<=13;i++)
		{
			if(i>=8)
			{
				int count=1;
				for(j=i;j<=13;j++)
				{
				System.out.print(count++);	
				}
			}
			else
			{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			}
			System.out.println();
			}
		}
	}
