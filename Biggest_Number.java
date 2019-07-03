//Java Program to find the biggest Number
import java.util.Scanner;
public class Biggest_Number 
{
	public static void main(String[] args) 
	{
		int x,y,z;
		System.out.println("Enter any three Numbers");
		Scanner in = new Scanner (System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		if(x>y && x>z)
		{
			System.out.println("First Number is Largest");
		}
		else
			if(y>x && y>z)
			{
				System.out.println("Second Number is Largest");
			}
			else
				if(z>x && z>y)
				{
					System.out.println("Third Number is Largest");
				}
				else
				{
					System.out.println("The Numbers are not distinct");
				}
	}

}g
