// Java Program to apply Bubble Sort on String
public class BubbleSort_on_String 
{
	public static void main(String[] args) 
	{
		int counter, index;
		String str[] = {"Yogendra", "Singh", "Pratap"};
		String temp;
		System.out.println("Your Strings in sorted order is:");
		for(counter = 0; counter < str.length; counter++)
		{
			for(index = counter + 1; index < str.length; index++)
			{
				if(str[index].compareTo(str[counter]) < 0)
				{
					temp = str[counter];
					str[counter] = str[index];
					str[index] = temp;
				}
			}
			System.out.print(" "+str[counter]);
		}
	}
}
