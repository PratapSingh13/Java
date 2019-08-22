//Java program to count the Number of words in a String
import java.util.Scanner;
public class CountTheWords 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[]words=str.trim().split(" ");
		System.out.println("Number of Words in the String is: " +words.length);
				
	}
}
