// Java Program to demonstrate TRY & CATCH
public class Solution_ExceptionHandling1 
{
	public static void main(String[] args) 
	{
		try
		{
			// Exception may be here
			int data=50/0;
		}
		//Handling the Exception
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the Code");
	}
}

