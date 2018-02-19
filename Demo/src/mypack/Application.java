package mypack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String s=br.readLine();
		System.out.println("Enter the integer");

		int i=Integer.parseInt(br.readLine());
Palindrome p=new Palindrome();
System.out.println("Is the string pallindrome? "+p.checkString(s));
System.out.println("Is the integer pallindrome? "+p.checkInt(i));
CheckValue c=new CheckValue();
System.out.println("Is there any spaces? "+c.checkString(s));
System.out.println("Is there a 0 digit? "+c.checkInt(i));

	}

}
