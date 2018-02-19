package patterns;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int x;
		for(int i=3;i>=1;i--)
		{
			x=97;
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print((char)x);
				x++;
			}
			int y=x-2;
				
				for(int j=2;j>=i;j--)
				{
					System.out.print((char)y);
					y--;
				}
				System.out.println();

		}
		
		for(int i=1;i<=2;i++)
		{ x=97;
		for(int k=0;k<i;k++)
		{
			System.out.print(" ");
		}
			for(int j=3;j>i;j--)
			{
			System.out.print((char)x);	
			x++;
			}    
			int y=x-2;
			for(int j=2;j>i;j--)
			{
				System.out.print((char)y);	
				y--;
				
			}
			System.out.println();
		}
		
	}

}
