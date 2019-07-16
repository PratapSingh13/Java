
public class Pattern_Printing_8 
{

	public static void main(String[] args) 
	{
		int i; 
		int j;
		int k;
		for(i=1; i<=6; i++)
		{
			for(j=6; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1; i<=(6-1); i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(k=(6-1); k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	}

}
