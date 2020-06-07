import java.util.Scanner;
public class EvenOdd 
{
	public static void main(String[] args) 
	{
		// Creating Scanner class object
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		
		// Reading value from User
		int number = scan.nextInt();
		
		// Method calling
		findEvenOdd(number);
	}
	public static void findEvenOdd(int number)
	{
		if(number % 2 == 0)
			System.out.println("Your given number is even ");
		else
			System.out.println("Your given number is Odd");
	}

}
