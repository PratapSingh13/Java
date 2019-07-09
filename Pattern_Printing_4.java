public class Pattern_Printing_4
{
	public static void main(String[] args) {
		int i;
		int j;
		int k;
		for(i=1; i<=10; i++)
		{
			for(j=10; j>i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=(i*2)-1; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
