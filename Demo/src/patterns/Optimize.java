package patterns;

public class Optimize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=0;i<=4;i++)
{    
	for(int j=4;j>=i;j--)
	{
		System.out.print("*");
	}
	System.out.println();
	if(i==0)
		System.out.print(" ");
	else if(i==1)
		System.out.print("  ");
	else if(i==2)
		System.out.print("   ");
	else if(i==3)
		System.out.print("    ");
}
	}

}
