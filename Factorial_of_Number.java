import java.util.Scanner;
public class Factorial_of_Number 
{
	public static void main(String[] args) 
	{
		int n, c;
		int fact = 1;
		System.out.println("Enter an Integer to calculaate it's Factorial");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n<0)
			System.out.println("Number should be non-negative");
		else
		{
			for(c=1; c<=n; c++)
				fact=fact*c;
			System.out.println("Factorial of "+n+" is = "+fact);
		}

	}

}
