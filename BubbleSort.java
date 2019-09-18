// JAVA Program to Demonstrate Bubble Sort
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		int temp;
		int [] array = {36,19,2,32,5,29};
		
		for(int i=0; i<array.length; i++)
		{
			int flag=0;
			for(int j=0; j<(array.length-1)-i; j++)
			{
				if(array[j]>array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		for(int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+ " ");
		}

	}

}



//OUTPUT=[2 5 19 29 32 36]
