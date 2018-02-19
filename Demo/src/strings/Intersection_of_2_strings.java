package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Intersection_of_2_strings {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the first String");
		String as=br.readLine();
		System.out.println("Enter the second String");
		String bs=br.readLine();
		StringTokenizer ast=new StringTokenizer(as);
		StringTokenizer bst=new StringTokenizer(bs);
int acount=ast.countTokens();
int bcount=bst.countTokens();
String[] a=new String[ast.countTokens()];
String[] b=new String[bst.countTokens()];
//System.out.println(ast.countTokens());
//System.out.println(bst.countTokens());
for(int i=0;i<acount;i++)
			{
		a[i]=ast.nextToken();
			//System.out.println(a[i]);
			}
		for(int i=0;i<bcount;i++)
		{
		b[i]=bst.nextToken();
		//System.out.println(b[i]);
		}
			for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<b.length;j++)
			{
				if(a[i].equals(b[j]))
				{
					System.out.println("the words "+a[i]+" and "+b[j]+" are common");
				}
			}
			}
			}

}
