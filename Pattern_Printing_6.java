// Java Program to print the REVERSE Triangle 
public class Pattern_Printing_6 
{
	public static void main(String[] args) 
	{
		int i;
		int j;
		int k;
		for(i=6; i>=1; i--)
		{
			//Print Star in Decreasing Order
			for(k=1; k<=(i*2)-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			//Print Space in increasing order
			for(j=6; j>=i; j--)
			{
				System.out.print(" ");
			}
		}

	}
}
