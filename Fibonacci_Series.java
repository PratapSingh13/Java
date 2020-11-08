//Java Program for Fibonacci series
import java.util.Scanner;
public class Fibonacci_Series 
{
	public static void main(String[] args) 
	{
		int num;
		int num1=0;
		int num2=0;
		int num3=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Times");
		num=sc.nextInt();
		System.out.println("Fibonacci Series of the Number is:");
		for(int i=0; i<=num; i++)
		{
		    num1=num2;
		    num2=num3;
		    num3=num1+num2;
		    System.out.println(num1 +"");
		}   

	}

}
