import java.util.Scanner;
public class NumberType 
{
	public static void main(String[] args) 
	{	
		double number;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the number which you want to check: ");
		
		number = scan.nextDouble();
		
		findNumberType(number);
	}
	
	public static void findNumberType(double number)
	{
		if(number > 0)
		{
			System.out.println(number+" is Postive number");
		}
		else if(number < 0)
		{
			System.out.println(number+" is Negative number");
		}
		else
		{
			System.out.println(number+" is neither Postive nor Negative");
		}
	}
  
}
