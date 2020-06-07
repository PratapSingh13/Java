import java.util.Scanner;
public class BinarySearch 
{
	public static void main(String[] args) 
	{
		int counter;
		int number;
		int item;
		int array[];
		int first;
		int middle;
		int last;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of elements:");
		number = input.nextInt();
		
		//Creating an array to store all the elements
		array = new int[number];
		
		System.out.println("Enter " + number + " integers");
		
		for(counter = 0; counter < number; counter++)
		{
			array[counter] = input.nextInt();
			
			System.out.println("Enter the search value:");
			item = input.nextInt();
			first = 0;
			last = number - 1;
			middle = (first + last)/2;
			
			while(first <= last)
			{
				if(array[middle] < item)
					first = middle + 1;
				else if(array[middle] == item)
				{
					System.out.println(item + " found at location " + (middle + 1) + ".");
					break;
				}
				else
				{
					last = middle -1;
				}
				middle = (first + last)/2;
			}
			if(first > last)
				System.out.println(item + " is not found");
		}

	}

}
