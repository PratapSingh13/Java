// Java Program to demonstrate Working of Method Overloading in JAVA.
public class Sum 
{
	//Overloaded sum(). This sum takes two int type parameters
	int sum(int x,int y)
	{
		return(x+y);
	}
	//Overloaded sum(). This sum takes three int type parameters
	int sum(int x,int y,int z)
	{
		return(x+y+z);
	}
	//Overloaded sum(). This sum takes two double type parameters
	double sum(double x,double y)
	{
		return(x+y);
	}
	public static void main(String[] args) 
	{
		Sum s = new Sum();
		System.out.println(s.sum(10,20));
		System.out.println(s.sum(10, 20,30));
		System.out.println(s.sum(20.80, 45.77));
	  

	}
}
