
public class Solution_ExceptionHandling3 
{
	public static void main(String[] args) 
	{
		try
		{
			//Exception may throw here
			int data=50/0;
		}
		//Handling the Exception using Exception Class
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Rest of the Code");
	}
}
