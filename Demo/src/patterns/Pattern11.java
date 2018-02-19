package patterns;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int i,j;
 int count=3;
 boolean flag=true;
 for(i=1;i<=5;i++)
 {
	 if(i==1)
	 {
		 System.out.print("2");
	 }
	 else
	 {
	 for(j=1;j<=i;j++)
	 {
		 for(int k=2;k<count;k++){
			 if(count%k==0)
			 {
				 flag=false;
			 }
			 count++;
		 }
		 if(flag==true)
		 {
			 System.out.print(count);
		 }
	 }
	 }
	 System.out.println();

 }
	 
 
	}

}
