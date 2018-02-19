package patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		for(i=1;i<=5;i++)
		{
		for(j=1;j<=i;j++)
		{ 
			if(i%2==0){
				if(j%2==0)
			{
				System.out.print("1");
			}
				else
				{
					System.out.print("0");
				}
			}
			else
			{
			 System.out.print(j%2);
			}
		}
		System.out.println(" ");
		}
		}

}
