package mypack;

public class Palindrome implements Check
{

	public boolean checkString(String s)
	{
		String b="";
		for(int j=s.length()-1;j>=0;j--)
		{
			b+=s.charAt(j);
			
		}
		if(s.equals(b))
		return true;
		else
			return false;
	}
	public boolean checkInt(int i)
	{
		int rem,a,r=0;
		a=i;
		while(i>0)
		{
			rem=i%10;
			r=r+rem*10;
			i=i/10;
			}
		if(a==r)
		return true;
		else
			return false;
	}
	
}
