
public class Pattern_Printing_9 
{

	public static void main(String[] args) 
	{
		int i;
		int j;
		int k;
		for(i=1; i<=5; i++)
		{
			for(j=5; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=5; k>=1; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
