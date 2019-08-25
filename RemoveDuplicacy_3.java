//Java Program to Remove Duplicate Elements from Sorted and UnSorted Array 
//By using HASH SET
import java.util.HashSet;
public class RemoveDuplicacy_3 
{
	public static void main(String[] args) 
	{
		int a[]= {1,3,2,4,2,3,4,6,5,5};
		HashSet<Integer> HS=new HashSet<>();        //Creating an object of HashSet class
		for(int i=0; i<a.length; i++)
		{
			HS.add(a[i]);
		}
		for(int no:HS)
		{
			System.out.println(no+"");
		}

	}
}
