import java.util.Scanner;
public class StringPalindrome 
{

	public static void main(String[] args) 
	{
		String str;
		String rev_str = "";
		
		System.out.println("Input the String Please");
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		
		int length = str.length();
		
		for(int i = length-1; i >= 0; i--)
		{
			rev_str = rev_str + str.charAt(i);
		}
		if(str.equals(rev_str))
		{
			System.out.println("Yes String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}

	}

}
