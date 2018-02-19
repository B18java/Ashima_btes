package mypack;

public class CheckValue implements Check{
	
	public boolean checkString(String s)
	{
		int j=0,count=0;
		while(j<s.length()) {
		if(s.charAt(j)==' ')
		{
			count++;
			break;
		}
		j++;
		}
		if(count==0)
		return false;
		else
			return true;
	}
	public boolean checkInt(int i)
	{
		String s1=String.valueOf(i);
		int j=0,count=0;
		while(j<s1.length()) {
		if(s1.charAt(j)=='0')
		{
			count++;
			break;
		}
		j++;
		}
		if(count==0)
		return false;
		else
			return true;
		
		
	}

}
