//Write a Program to print factorial of a number using recursion
public class Factorial_of_Number_Using_Recursion 
{
	public static void main(String[] args) 
	{
		System.out.println(factorial(5));
	}
	private static int factorial(int number)
	{
		if(number==1)
		{
			return 1;
		}
		else
		{
			return number*factorial(number-1);
		}
	}

}
