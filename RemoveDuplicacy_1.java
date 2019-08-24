//Java Program to Remove Duplicate Elements from an Array 
public class RemoveDuplicacy_1 
{
	public static void main(String[] args) 
	{
		int a[]={1,2,2,4,5,5,6,7,7,8,9};
		int temp[]=new int[a.length];                //Creating temporary Array of name temp[]
		int j=0;
		for(int i=0; i<a.length-1; i++)              //i<a.length-1; because array should not go out of bound
		{
			if(a[i]!=a[i+1])
			{
				temp[j]=a[i];
				j++;
			}
		}
		temp[j]=a[a.length-1];                      //fix last element of a[] in temp[]
		for(int i=0; i<a.length; i++)
		{
			System.out.println(temp[i]+"");         //[1,2,,4,5,6,7,8,9,0,0,0,]

		}
	}
}
