//JAVA Program to find the Maximum Value in Array
public class Minimum_Value_In_Array 
{
	public static void main(String[] args) 
	{
		int a[]= {14,46,47,94,12,52,86};
		int min=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum Value is "+min);
	}

}
