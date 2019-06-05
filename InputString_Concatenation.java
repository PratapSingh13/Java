import java.util.Scanner;
public class InputString_Concatenation 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter Your First Name");
		String FirstName=input.next();
		
		System.out.println("Enter Your Second Name");
		String SecondName=input.next();
		
		System.out.println("Enter Your Last Name");
		String LastName=input.next();
		
		System.out.println(FirstName + SecondName + LastName);

	}

}
