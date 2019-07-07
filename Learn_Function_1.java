
public class Learn_Function_1 
{
	public static void main(String[] args) 
	{
		int a=11;
		int b=6;
		int c=mainFunction(a,b);
		System.out.println("Minimum Value=" +c);

	}
	/* Return of Minimum of two numbers*/
	public static int mainFunction(int n1, int n2)
	{
		int min;
		if(n1>n2)
			min=n2;
		else
			min=n1;
		return min;
	} 

}
