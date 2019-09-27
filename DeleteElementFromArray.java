// JAVA Program to Delete an element from an Array

public class DeleteElementFromArray 
{

	public static void main(String[] args) 
	{
		int[] array = {10,40,30,80,60,20};
		int deleteElement = 30;
		int count = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(deleteElement == array[i])
			{
				for(int j = i; j < array.length - 1; j++)
				{
					array[j] = array[j+1];
				}
				count = count+1;
				break;
			}
		}
		if(count == 0)
		{
			System.out.println("Element not found");
		}
		else
		{
			for(int i = 0; i < array.length - 1; i++)
			{
				System.out.print(array[i]+" ");
			}
		}

	}

}
