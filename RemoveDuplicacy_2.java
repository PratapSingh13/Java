//Java Program to Remove Duplicate Elements from an Sorted Array 
//Without using another Array
public class RemoveDuplicacy_2 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,2,4,5,5,6,7,7,8,9};
		int j=0;
		for(int i=0; i<a.length-1; i++)                             //i<a.length-1; because array should not go out of bound
		{
			if(a[i]!=a[i+1])
			{
				a[j]=a[i];
				j++;                                               //Increment j index;
			}
		}
		a[j]=a[a.length-1];
		for(int i=0; i<j+1; i++)                                  //i<j+1 for traverse into j    
		{
			System.out.println(a[i]+"");                         //[1,2,,4,5,6,7,8,9]
		}
	}
}
