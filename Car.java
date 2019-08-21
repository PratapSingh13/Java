//Java Program to show Single Level Inheritance
class Vehicle
{
	void Type() 
	{
		System.out.println("What Type of Vehicle You Want to Buy");
	}
}
public class Car extends Vehicle 
{
	void Sedan() 
	{
		System.out.println("I would Like To Buy a Sedan Car");
	}
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.Type();          //What Type of Vehicle You Want to Buy
		c.Sedan();        //I would Like To Buy a Sedan Car
	}
}
