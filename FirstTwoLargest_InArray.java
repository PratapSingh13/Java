//Java Program to Find the Largest Two Numbers in an Array

import java.util.Scanner;

public class FirstTwoLargest_InArray 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the Number of Elements You want in Array");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		
		//Creating an Array of Size of n 
		int array[]=new int[num];
		System.out.println("Enter all the Elements");
		for(int index=0; i<array.length; index++)
		{
			array[index]=sc.nextInt();
		}
		
		int first_largest,second_largest,temp;
		first_largest=array[0];
		second_largest=array[1];
		
		if(first_largest<second_largest)
		{
			temp=first_largest;
			first_largest=second_largest;
			second_largest=temp;
		}
		
		for(int index=2; i<array.length; index++)
		{
			if(largest_1<array[i])
			{
				second_largest=first_largest;
				first_largest=array[index];
			}
			else if(array[index]>second_largest && array[index]!=first_largest)
			{
				second_largest=array[index];
			}
		}
		System.out.println("The First Largest is:"+first_largest);
		System.out.println("The Second Largest is:"+second_largest);
		
	}

}
