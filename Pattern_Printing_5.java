// JAVA Program to Print Half Opposite Triangle
public class Pattern_Printing_5 {

	public static void main(String[] args) 
	{
		int i;
		int j;
		int k;
		for(i=1; i<=5; i++)
		{
			//Print Space in increasing Order
			for(j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			//Print Star in Decreasing Order
			for(k=5; k>=i; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
