package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class lcm_hcf {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the two numbers");
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
int hcf=0,lcm=0;
		for(int i=2;i<a*b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				hcf=i;
			}
		}
		System.out.println("hcf is "+hcf);
		lcm=a*b/hcf;
		System.out.print("lcm is "+lcm);
	}
}
