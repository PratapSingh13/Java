//JAVA Program to find the Maximum Value in Array
public class Maximum_Value_In_Array 
{

	public static void main(String[] args) 
	{
		int arr[]= {14,46,47,94,52,86};
		int max=arr[0];
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Maximum Value is= "+max);

	}

}
