//Example of Inheritance
class Calculation
{
	int z;
	public void addition(int x,int y)
	{
		z=x+y;
		System.out.println("The Sum of given Numbers:" +z);
	}
	public void Substraction(int x, int y)
	{
		z=x-y;
		System.out.println("The Difference of the given Numbers:" +z);
	}
	
}
public class My_Calculation extends Calculation
{
	public void multiplication(int x,int y)
	{
		z=x*y;
		System.out.println("The Product of the given Numbers:" +z);
	}

	public static void main(String[] args) 
	{
		int a=20;
		int b=10;
		My_Calculation demo = new My_Calculation();
		demo.addition(a,b);
		demo.Substraction(a, b);
		demo.multiplication(a, b);
	}

}
