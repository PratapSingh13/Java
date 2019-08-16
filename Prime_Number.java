//Java Program to Check either Number is Prime or not
import java.util.Scanner;
public class Prime_Number 
{
	public static void main(String args[]) 
	{
		int n;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number which you want to check either the number is Prime or Not !");
		n=sc.nextInt();
		for(int i=2; i<=(n-1); i++)
		{
			if(n%i==0) 
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Your Number is Prime");
		}
		else
		{
			System.out.println("Your Number is not Prime");
		}
	}
}
