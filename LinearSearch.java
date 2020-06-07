// Java Program to implement Linear Search
import java.util.Scanner;
public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int counter;        
		int number;         
		double item;
		int array[];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number of elements you want: ");
		number = scan.nextInt();
		
		//Creating an Array which store all the elements
		array = new int[number];
		System.out.println("Please enter " + number + " integers");
		
		//Loop to store each number in array
		for (counter = 0; counter < number; counter++)
			array[counter] = scan.nextInt();
		
		System.out.println("Enter the search value:");
		item = scan.nextInt();
		
		for(counter = 0; counter < number; counter++)
		{
			if(array[counter] == item)
			{
				System.out.println(item+" is present at location "+(counter+1));
				
				break;
			}
		}
		if(counter == number)
			System.out.println(item + " This number doesn't exist in array");
	}

}
