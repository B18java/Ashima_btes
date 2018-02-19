package patterns;

public class Pattern_amdocs {

	public static void main(String args[])
	{
		int count=0;
	//	int temp=1;
		
		for(int i=1;i<=5;i++)
		{
			int array[]=new int[i];
			if(i%2!=0)
			{
				for(int j=0;j<array.length;j++)
			{
					array[j]=++count;
			
			}
				for(int j=0;j<array.length;j++)
				{
					
				
				System.out.print(array[j]);
				}
			}
			else
			{
				
				for(int j=array.length-1;j>=0;j--)
				{
					array[j]=++count;
				
			}
				for(int j=0;j<array.length;j++)
				System.out.print(array[j]);
			}
			System.out.println();	
			
		}
	}
}

