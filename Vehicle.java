//Java Program to show Abstraction
abstract class Vehicle              //Abstract class
{
	abstract void start();         //Abstract Method
}
class Jeep extends Vehicle        //Inheriting Abstract class
{
	void start() 
	{
		System.out.println("Jeep Starts from Keys");        //Implementing abstract method
	}
}
class Scooter extends Vehicle     //Inheriting Abstract class
{
	void start() 
	{
		System.out.println("Scooter starts from Kick");     //Implementing abstract method
	}
	public static void main(String args[])
	{
		//In abstraction we can not create object of abstract class
		
		Jeep obj1=new Jeep();              //Creating object of regular class i.e. Jeep
		obj1.start();
		Scooter obj2=new Scooter();       //Creating object of regular class i.e. Scooter
		obj2.start();
	}
}
	

