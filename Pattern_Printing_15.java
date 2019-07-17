
public class Pattern_Printing_15 
{

	public static void main(String[] args) 
	{
		int i;
		int j;
		int k;
		// For First Vertical Line
		for(i=1; i<=4; i++)
		{
			//For Space
			for(j=5; j>1; j--)
			{
				System.out.print(" ");
			}
			//For Star Printing
			for(k=1; k<=1; k++)
			{
				System.out.print("*");
			}
			//To Change the Line
			System.out.println();
		}
		//For Horizontal Star Pattern
		for(i=1; i<=1; i++)
		{
			for(j=1; j<=9; j++)
			{
				System.out.print("*");
			}
			//To Change the Line
			System.out.println();
		}
		//For Second Vertical Line
		for(i=1; i<=4; i++)
		{
			//For Space
			for(j=5; j>1; j--)
			{
				System.out.print(" ");
			}
			//For Star Printing
			for(k=1; k<=1; k++)
			{
				System.out.print("*");
			}
			//To Change the Line
			System.out.println();
		}
	}

}
