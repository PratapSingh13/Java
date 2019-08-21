//Java Program to show how to Reverse a String
public class String_Reverse 
{
	public static void main(String[] args) 
	{
		String name="Yogendra Pratap Singh";
		int size = name.length();           //Using length() we get the size of String
		String rev="";                       
		for(int i=size-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);        //Using char() we get the character of String
		}
		System.out.println(rev);
	}	
}
