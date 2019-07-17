
public class Pattern_Printing_14 
{
	public static void main(String[] args) 
	{
		int i;
		int j;
		int k;
		for(i=1; i<=5; i++)
		{
			for(j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(k=5; k>=i; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=2; i<=5; i++)
		{
			for(j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
