package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remove_first_last_space {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine(); 
		int i=0;
		String b="",a="";
		
			while(str.charAt(i)==' ')
			{
				
				//System.out.println(b);
				i++;
			}
		
		b+=str.substring(i,str.length());
		System.out.println(b);
				i=b.length()-1;
				System.out.println(i);
				while(b.charAt(i)==' ');
				{
					i--;
					
			}
				a+=b.substring(0,i+1);
				System.out.println();
		System.out.println(a+"jello");
	}

}
