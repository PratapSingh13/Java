import java.util.Scanner;
public class Palindrome_Number 
{
	public static void main(String[] args) 
	{
		int n;
		int temp;
		int rem;
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n=sc.nextInt();
		temp=n;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(n==rev)
		{
			System.out.println("Entered Number is Palindrome");
		}
		else
		{
			System.out.println("Entered Number is not Palindrome");
		}

	}

}
