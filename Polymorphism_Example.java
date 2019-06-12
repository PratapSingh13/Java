//Java Program to demonstrate Polymorphism
public class Polymorphism_Example 
{
	double sum(double x,double y)
	{
		return(x+y);
	}
	int sum(int x,int y,int z)
	{
		return(x+y+z);
	}

	public static void main(String[] args) 
	{
		Polymorphism_Example Sum = new Polymorphism_Example();
		System.out.println(Sum.sum(10,20));
		System.out.println(Sum.sum(10, 20, 30));
		System.out.println(Sum.sum(10.5, 20.5));

	}

}
