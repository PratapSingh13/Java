import java.util.Scanner;
public class Arithmetic_Operations 
{

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Please Enter the First Number");
		int FirstNumber=input.nextInt();
		
		System.out.println("Please Enter the Second Number");
		int SecondNumber=input.nextInt();
		
		System.out.println("Sum= "+ (FirstNumber+SecondNumber));
		System.out.println("Sub= "+ (FirstNumber-SecondNumber));
		System.out.println("Mul= "+ (FirstNumber*SecondNumber));
		System.out.println("Div= "+ (FirstNumber/SecondNumber));
		System.out.println("Remainder= "+ (FirstNumber%SecondNumber));
		
				

	}

}
