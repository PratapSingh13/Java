import java.util.Scanner;
public class Input_Even_Odd 
{
	public static void main(String[] args) 
	{
		int x;
		System.out.println("Input a Number Please");
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		if(x%2==0)
		{
			System.out.println("The Number is Even");
		}
		else
		{
			System.out.println("The Number is Odd");
		}
}

