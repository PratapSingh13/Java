import java.util.Scanner;
public class StringReverse_2 
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
		System.out.println(rev_str);

	}

}
