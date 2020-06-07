// Java Program to implement Selection Sort
public class Selection_Sort
{
	public static void main(String[] args) 
	{
		SelectionSort object = new SelectionSort();
		int array[] = {12,32,22,43,19,46,89,5};
		
		System.out.print("Original array: ");
		object.printArray(array);
		
		object.sort(array);
		
		System.out.print("Sorted array: ");
		object.printArray(array);
	}
	public static void sort(int array[])
	{
		int length = array.length;
		for(int i = 0; i < length - 1; i++)
		{
			int minimum = i;
			for (int j = i+1; j < length; j++)
				if(array[j] < array[minimum])
					minimum = j;
			
			int temp = array[minimum];
			array[minimum] = array[i];
			array[i] = temp;
		}
	}
	
	public static void printArray(int array[])
	{
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}

}
