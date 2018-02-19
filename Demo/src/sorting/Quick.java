package sorting;

public class Quick {
	public int quick(int[] array,int left,int right)
	{
		int loc=0,count=0;
		int pivot=array[0];
		int j,k,temp;
	while(count<array.length)
	{
		for(j=right;j>=loc;j--)
		{
			if(array[j]<pivot)
			{
				temp=array[0];
				array[0]=array[j];
			array[j]=temp;
			break;
			}
		}
	
		pivot=array[j];
		loc=j;
		for(k=left;k<=loc;k++)
		{
			if(array[k]>pivot)
			{
				temp=array[k];
				array[k]=array[j];
				array[j]=temp;
				break;	
			}
		}
		/*for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}*/
		pivot=array[k];
		loc=k;
		count++;
	}
	for(int i=0;i<array.length;i++)
	{
		System.out.print(array[i]+" ");
	}
	return loc;
	}
	public static void main(String args[])
	{
		Quick u=new Quick();
		int[] ar={1,6,4,2};
		u.quick(ar,0,3);
	}
}
