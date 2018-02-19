package patterns;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=1;
for(int i=1;i<=5;i++)
{
	count=1;
	for(int k=4;k>=i;k--)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
	System.out.print(count);
	count++;
	}
	count=1;
	for(int y=1;y<i;y++)
	{
		System.out.print(count);
		count++;
	}
	System.out.println();
}
for(int i=4;i>=1;i--) {
	count=1;
	for(int k=4;k>=i;k--)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print(count);
		count++;
	}
	count=1;
	for(int y=1;y<i;y++)
	{
		System.out.print(count);
		count++;
	}
	System.out.println();
}
	}

}
