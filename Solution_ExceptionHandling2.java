
public class Solution_ExceptionHandling2 
{
	public static void main(String[] args) 
	{
		try 
		{
			//Exception may be Here
			int data=50/0;
			//if exception occurs,the remaining statement will not exceute  
			System.out.println("Rest of the Code");
		}
		//Handling Exception
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}

