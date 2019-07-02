import java.util.Scanner;        //Importing Library of JAVA with Scanner class
public class TakingInput_fromUser 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the FIRST Number");
		int First=input.nextInt();
		
		System.out.println("Enter the FIRST Number");
		int Second=input.nextInt();
		
		System.out.println(First+Second);

	}
}
