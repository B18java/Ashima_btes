package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Find_duplicate_word {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine(); 
		
		StringTokenizer st=new StringTokenizer(str," ");
		int count=st.countTokens();
	
		
		String[] a;
		a=new String[count];
		int loc=0;
		//mytemp=1;
		for(int i=0;i<count;i++)
		{
			a[i]=st.nextToken();
		}
		for(int i=0;i<count;i++){
			loc=1;
			if(a[i]==" ")
			{
					continue;
			}
			for(int j=i+1;j<count;j++)
			{
				
				if(a[i].equals(a[j]))
				{
					loc++;
					a[j]=" ";
				}
				//temp++;
			}
			System.out.println("the word "+a[i]+" occurs "+loc+" times");
		}
		/*int i=0,count=0,loc=1;
	while(count<str.length())
	{
		//System.out.println("toodles");
		loc=1;
		while(str.charAt(i)!=' ')
		{
			count++;
			b=b+str.charAt(i);
			i++;
			//System.out.println(b);
		}
		
		
		//System.out.println("bye");
		a+=str.substring(count,str.length());
		//System.out.println(a);
		for(int j=0;j<a.length();j++)
			{
			String c="";
			if(a.charAt(j)!=' ')
			{
				c+=a.charAt(j);
				j++;			}
			if(c.equals(b))
			{
				loc++;
			}
			
			System.out.println("the word "+b+" occurs"+loc+" times");
		}
		//System.out.println("hello");
		b=""; 
		a="";
		//System.out.println(a);
		//System.out.println(b);
		count++;
		i++;
	}*/
	
	}

}
