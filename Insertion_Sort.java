//Java Program to demonstrate INSERTION SORT 
public class Insertion_Sort 
{
	public static void insertionsort(int[] array)
	{
		int n = array.length;
		for(int j=1; j<n; j++)
		{
			int key=array[j];
			int i=j-1;
			while((i>-1) && (array[i]>key))
			{
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
		}
	}
	public static void main(String args[]) 
	{
		int[] arr_1= {9,14,3,2,43,11,58,22};
		System.out.println("Before Insertion Sort");
		for(int i:arr_1)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		insertionsort(arr_1);   //Sorting array using Insertion Sort
		System.out.println("After Insertion Sort");
		for(int i:arr_1)
		{
			System.out.print(i+" ");
		}
	}

}
