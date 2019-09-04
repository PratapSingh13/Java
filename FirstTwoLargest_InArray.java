import java.util.Scanner;

public class FirstTwoLargest_InArray 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the Number of Elements You want in Array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		
		//Creating an Array of Size of n 
		int array[]=new int[n];
		System.out.println("Enter all the Elements");
		for(int i=0; i<array.length; i++)
		{
			array[i]=sc.nextInt();
		}
		
		int largest_1,largest_2,temp;
		largest_1=array[0];
		largest_2=array[1];
		
		if(largest_1<largest_2)
		{
			temp=largest_1;
			largest_1=largest_2;
			largest_2=temp;
		}
		
		for(int i=2; i<array.length; i++)
		{
			if(largest_1<array[i])
			{
				largest_2=largest_1;
				largest_1=array[i];
			}
			else if(array[i]>largest_2 && array[i]!=largest_1)
			{
				largest_2=array[i];
			}
		}
		System.out.println("The First Largest is:"+largest_1);
		System.out.println("The Second Largest is:"+largest_2);
		
	}

}
