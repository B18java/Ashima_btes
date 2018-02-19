package patterns;

public class Debugging
{

	int prime(int num)

	{

	int i;
	int flag=0;

	
	for (i=2;i<num;i++)

	{
		if (num % i== 0)
	{
		
	flag = 1;
	break;
	}
	}
	if (flag == 0 || num == 2)
	{

	return (1);
	}
	else
	{
	return (0);
	}
	}
	public static void main(String args[])
	{
		int i,j;
		int num=2;
		
Debugging obj=new Debugging();
		for (i = 0; i < 5; i++)
		{
			j=0;
		while(j<=i)
	{
			int k=obj.prime(num);
		
			if(k==1)
			{
			System.out.print(num+" ");
		j++;
				num++;
			}
			else
			{
				num++;
			
			}
	
		}
	
		System.out.println(); 
		}
		}
	}
