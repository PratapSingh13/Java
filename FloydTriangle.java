// Java Program to implement Floyd's triangle
import java.util.Scanner;
public class FloydTriangle 
{
	public static void main(String[] args) 
	{
		int rows;
		int counter_i, counter_j;
		int number = 1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows for Floyd's Triangle:");
		
		rows = scan.nextInt();
		System.out.println("Floyd's Triangle");
		
		for(counter_i = 1; counter_i <= rows; counter_i++)
		{
			for(counter_j = 1; counter_j <= counter_i; counter_j++)
			{
				System.out.print(number+" ");
				number++;              // For Incrementing the number value
			}
			System.out.println();      // To change the line
		}

	}

}


Floyd's Triangle
1 
2 3 
4 5 6 
7 8 9 10 
