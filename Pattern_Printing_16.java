public class Pattern_Printing_16
{
	int i,j,k;
	public static void main(String args[])
	{
		for(i=1; i<=5; i++)
		{
			for(j=5; j<i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1; i<=5; i++)
		{
			for(j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
