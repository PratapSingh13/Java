//Java Program for Fibonacci series
import java.util.Scanner;
public class Fibonacci_Series 
{
	public static void main(String[] args) 
	{
		int num;
		int a=0;
		int b=0;
		int c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Times");
		num=sc.nextInt();
		System.out.println("Fibonacci Series of the Number is:");
		for(int i=0; i<=num; i++)
		{
		    a=b;
		    b=c;
		    c=a+b;
		    System.out.println(a +"");
		}   

	}

}
