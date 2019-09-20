// JAVA Program to Demonstrate SELECTION SORTING
public class SelectionSort 
{

	public static void main(String[] args) 
	{
		int temp = 0;
		int min;
		int[] array = {36,19,12,25,2,14};
		
		for(int i = 0; i < array.length; i++)
		{
			min = i;
			for(int j = i+1; j < array.length; j++)
			{
				if(array[j] < array[min])
				{
					min = j;
				}
			}
			temp = array[i];
			array[i] = array[min];
			array[min] = temp;
		}
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}
