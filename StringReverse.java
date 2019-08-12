import java.util.Scanner;
public class StringReverse 
{
	public static void main(String[] args) 
	{
		String str;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Your String");
		str=in.nextLine();
		String[] token=str.split("");     //Used Split method to Print in Reverse
		for(int i=token.length-1; i>=0; i--)
		{
			System.out.print(token[i] + "");
		}

	}

}
