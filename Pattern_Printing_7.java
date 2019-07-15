
public class Pattern_Printing_7 
{
	public static void main(String[] args) 
	{
		int i;
		int j;
		for(i=1; i<=6; i++)
		{
			for(j=1; j<=i; j++)
			{
				//Print Star in Increasing Order
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1; i<=(6-1); i++)
		{
			//Print Star in Decreasing Order
			for(j=(6-1); j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}g
