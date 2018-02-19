package assignment1;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		args=new String[1];
args[0]="Whats the matter son,you school books are uncovered";
int count=0;
for(int i=0;i<args[0].length();i++)
{
	if(args[0].charAt(i)=='s')
	{
		count++;
		System.out.println("Index of occurence of s is "+i);
	}
}
System.out.println("s has occured "+count+" no. of times");
	}

}
